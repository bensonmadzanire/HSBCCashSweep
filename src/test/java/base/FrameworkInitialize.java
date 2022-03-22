package base;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import config.Settings;

public class FrameworkInitialize {

    public Page InitializePlaywright() {

        //Initialize the browser
        BrowserInitialize browserInitialize = new BrowserInitialize();

        //Set the launch Options
        BrowserType.LaunchOptions launchOptions = new BrowserType.LaunchOptions();
        launchOptions.headless = Settings.Headless;
        launchOptions.devtools = Settings.DevTools;
        launchOptions.setSlowMo(500);


        //Get Browser
        var browser  = browserInitialize.GetBrowser(Settings.BrowserName, launchOptions);

        //Get browserContext
        Browser.NewContextOptions contextOptions = new Browser.NewContextOptions();
        contextOptions.locale = Settings.Locale;
        contextOptions.setIgnoreHTTPSErrors(true);



        var context = browserInitialize.GetBrowserContext(browser, contextOptions);

        //Get Page
        return browserInitialize.GetPage(context);

    }
}
