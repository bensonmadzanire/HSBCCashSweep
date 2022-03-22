package pages;

import base.FrameworkConfig;
import com.microsoft.playwright.Page;



public class HomePage {


    Page page = FrameworkConfig.LocalPage;


    String btnconfiguration = "text='Configuration'";
    String btnAccept = "text='Accept'";
    String txtBaccountcode = "text='Bloomberg Account Code'";
    String btnSave = "text='Save'";
    String lnkfeedback = "text='Support / Feedback / Defect'";
    String txtminimumValue = "text='Minimum (Greater than 999)'";
    String lnkOrders = "text='Orders'";
    String lnkMonitors = "text='Monitor'";
    String lnkAccounts = "text='Accounts'";
    String txtAccountCode = "text='genesis-input'";
    String lnkSweepingDashboard = "text='Sweeping Dashboard'";
    String popDismiss = "text='Dismiss'";


    //This is a method to click the configuration link on the Home page
    public void clickConfiguration() {
        page.isVisible(btnconfiguration);
        page.click(btnconfiguration);
    }

    public void clickSweepingDashboard() {
        page.isVisible(lnkSweepingDashboard);
        page.click(lnkSweepingDashboard);
    }

    public void clickAccept() {
        page.click(btnAccept);

    }

    public boolean captureAccountCodeField(String accountcode) {
        page.fill(txtBaccountcode, accountcode);
        return true;
    }

    public void clickSave() {
        page.isVisible(btnSave);
        page.click(btnSave);

    }

    public void clickFeedback() {
        page.click(lnkfeedback);
    }

    public boolean captureMinimumValueField(String mValue) {
        page.fill(txtminimumValue, mValue);
        return true;
    }

    public void clickOrders() {
        page.click(lnkOrders);
    }

    public void clickMonitor() {
        page.click(lnkMonitors);
    }

    public void clicklnkAccount() {
        page.click(lnkAccounts);
    }

    public boolean captureAccCodeField(String accountCode) {
        page.fill(txtAccountCode, accountCode);
        return true;
    }

    public void clickDismiss() {
        page.isVisible(popDismiss);
        page.click(popDismiss);
    }
}