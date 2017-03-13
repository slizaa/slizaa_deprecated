package org.slizaa.ui.dependencytable;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swtbot.swt.finder.SWTBot;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotButton;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotText;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SWTBotJunit4ClassRunner.class)
public class SWTBotDemo {
  
  @Test
  public void test() {
    
    // SWTBotPreferences.PLAYBACK_DELAY = 100; // slow down tests...Otherwise we won't see anything

    Display display = new Display();
    Shell shell = new SampleSWTUI().showGUI(display);
    SWTBot bot = new SWTBot(shell);

    SWTBotButton loginButton = bot.button("Login");
    SWTBotText userText = bot.textWithLabel("User Name: ");
    SWTBotText passwordText = bot.textWithLabel("Password: ");

    userText.setFocus();
    userText.setText("Superman");

    assert (userText.getText().equals("Superman"));

    passwordText.setFocus();
    passwordText.setText("test123");

    loginButton.setFocus();
    loginButton.click();

    userText.setFocus();
    userText.setText("Favonius");

    assert (userText.getText().equals("Favonius"));

    passwordText.setFocus();
    passwordText.setText("abcd123");

    loginButton.setFocus();
    loginButton.click();

    display.dispose();
  }
}