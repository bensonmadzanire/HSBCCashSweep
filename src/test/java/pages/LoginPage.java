package pages;

import base.FrameworkConfig;
import com.microsoft.playwright.Page;

public class LoginPage {


    Page page = FrameworkConfig.LocalPage;

    String txtUserName = "text='Username'";
    String txtPassword = "text='Password'";
    String btnLogin = "text='Login'";
    String ErrorMessage = "text='An error has occured. Please check username and password and try again.'";

    public void Login(String userName, String password) {
        page.fill(txtUserName, userName);
        page.fill(txtPassword, password);
        page.click(btnLogin);


    }

    public boolean captureUsernameField(String userName) {
     page.fill(txtUserName,userName);
        return true;
    }
    public boolean capturePasswordField(String password) {
        page.fill(txtPassword,password);
        return true;
    }

    public boolean clickLoginButton() {
        page.click(btnLogin);
        return true;
    }
}
