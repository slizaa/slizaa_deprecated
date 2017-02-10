/*******************************************************************************
 * Copyright (c) Gerd W�therich 2012-2016.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 * 
 * Contributors:
 *    Gerd W�therich (gerd@gerd-wuetherich.de) - initial API and implementation
 ******************************************************************************/
package org.slizaa.neo4j.dbadapter.internal.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

// https://github.com/hstaudacher/osgi-jax-rs-connector
// https://github.com/hstaudacher/osgi-jax-rs-connector/wiki/security
@Path("")
public interface Neo4JRemoteServiceRestApi {

  @POST
  @Path("/db/data/transaction/commit")
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  JsonObject executeCypherQuery(String message);
  
  @GET
  @Path("/db/data")
  @Produces(MediaType.APPLICATION_JSON)
  JsonObject serviceRoot();

  @GET
  @Path("/db/data/node/{id: \\d+}/properties")
  @Produces(MediaType.APPLICATION_JSON)
  JsonObject getNodeProperties(@PathParam("id") long id);

  @GET
  @Path("/db/data/relationship/{id: \\d+}/properties")
  @Produces(MediaType.APPLICATION_JSON)
  JsonObject getRelationshipProperties(@PathParam("id") long id);

  @GET
  @Path("/db/data/node/{id: \\d+}/labels")
  @Produces(MediaType.APPLICATION_JSON)
  JsonArray getNodeLabels(@PathParam("id") long id);

  @GET
  @Path("/db/data/labels")
  @Produces(MediaType.APPLICATION_JSON)
  JsonArray getNodeLabels();

  @GET
  @Path("/db/data/propertykeys")
  @Produces(MediaType.APPLICATION_JSON)
  JsonArray getPropertyKeys();

  @GET
  @Path("/db/data/relationship/types")
  @Produces(MediaType.APPLICATION_JSON)
  JsonArray getRelationshipTypes();
}
