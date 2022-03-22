package steps;

import base.FrameworkConfig;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.HomePage;
import pages.LoginPage;

public class stepdefinitions {
    @Given("I navigate to the application")
    public void i_navigate_to_the_application() {
        FrameworkConfig.LocalPage.navigate("https://hsbc-dev-cashsweep1/sweep");

    }

        @And("I click login button")
    public void iClickLoginButton() {
     LoginPage loginPage = new LoginPage();
     loginPage.clickLoginButton();
    }

    @And("I enter the username as  {string}")
    public void iEnterTheUsernameAs(String userName) {
        LoginPage loginPage = new LoginPage();
        loginPage.captureUsernameField(userName);
    }

    @And("I enter the password as {string}")
    public void iEnterThePasswordAs(String password) {
        LoginPage loginPage = new LoginPage();
        loginPage.capturePasswordField(password);
    }

     @And("I click accept button")
    public void iClickAcceptButton() {
        HomePage homePage = new HomePage();
        homePage.clickAccept();
    }

    @And("I click configuration tab")
    public void iClickConfigurationTab() {
        HomePage homePage = new HomePage();
        homePage.clickConfiguration();
    }

       @And("I enter the accountcode as {string}")
    public void iEnterTheAccountcodeAs(String accountcode) {
        HomePage homePage = new HomePage();
        homePage.captureAccountCodeField(accountcode);
    }

    @And("I click save button")
    public void iClickSaveButton() {
        HomePage homePage = new HomePage();
        homePage.clickSave();
    }

    @And("I click feedback link")
    public void iClickFeedbackLink() {
        HomePage homePage = new HomePage();
        homePage.clickFeedback();
    }

    @And("I enter the minimumvalue as {string}")
    public void iEnterTheMinimumvalueAs(String mvalue) {
        HomePage homePage = new HomePage();
        homePage.captureMinimumValueField(mvalue);

    }

    @And("I click orders tab")
    public void iClickOrdersTab() {
        HomePage homePage = new HomePage();
        homePage.clickOrders();
    }

    @And("I click monitor tab")
    public void iClickMonitorTab() {
     HomePage homePage = new HomePage();
     homePage.clickMonitor();
    }

    @And("i click the accounts tab")
    public void iClickTheAccountsTab() {
    HomePage homePage = new HomePage();
    homePage.clicklnkAccount();
    }

    @And("I enter the Bloombergcode as {string}")
    public void iEnterTheBloombergcodeAs(String accountCode) {
        HomePage homePage = new HomePage();
        homePage.captureAccCodeField(accountCode);
    }

    @And("I click sweeping dashboard")
    public void iClickSweepingDashboard() {
     HomePage homePage = new HomePage();
     homePage.clickSweepingDashboard();
    }

    @And("I click dismiss pop up message")
    public void iClickDismissPopUpMessage() {
        HomePage homePage = new HomePage();
        homePage.clickDismiss();

    }
}
