package steps;

import base.FrameworkConfig;
import base.FrameworkInitialize;
import config.ConfigReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks {

    @Before
    public void Setup() {
        ConfigReader.PopulateSettings();

         FrameworkConfig.LocalPage = new FrameworkInitialize().InitializePlaywright();

    }

    @After
    public void cleanUp() throws Exception {
        FrameworkConfig.LocalPage.close();
        FrameworkConfig.Playwright.close();
    }
}
