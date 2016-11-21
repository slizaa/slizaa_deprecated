package org.slizaa.neo4j.dbadapter.tests

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.Assert
import org.junit.runner.RunWith
import org.eclipse.emf.ecore.EClass
import org.slizaa.neo4j.dbadapter.dbAdapterDsl.DbAdapterDefinition

@RunWith(XtextRunner)
@InjectWith(DbAdapterDslInjectorProvider)
abstract class AbstractDbAdapterDefinitionTest {

	@Inject extension protected ParseHelper<DbAdapterDefinition>;

	@Inject extension protected ValidationTestHelper;

	def DbAdapterDefinition test(String adapterDefinition) {
		val model = adapterDefinition.parse
		Assert.assertNotNull(model)
		println(dump(model, ""));
		model.assertNoErrors
		return model
	}

	def DbAdapterDefinition testAssertError(String adapterDefinition, EClass objectType, String code, int offset, int length,
		String... messageParts) {
		val model = adapterDefinition.parse
		Assert.assertNotNull(model)
		println(dump(model, ""));
		model.assertError(objectType, code, offset, length, messageParts);
		return model
	}

	def static String dump(EObject mod_, String indent) {
		var res = indent + mod_.toString.replaceFirst('.*[.]impl[.](.*)Impl[^(]*', '$1 ')

		for (a : mod_.eCrossReferences)
			res += ' ->' + a.toString().replaceFirst('.*[.]impl[.](.*)Impl[^(]*', '$1 ')
		res += "\n"
		for (f : mod_.eContents) {
			res += f.dump(indent + "    ")
		}
		return res
	}
}
