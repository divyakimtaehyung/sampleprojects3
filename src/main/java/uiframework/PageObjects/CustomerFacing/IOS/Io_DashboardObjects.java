package uiframework.PageObjects.CustomerFacing.IOS;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uiframework.MobileUtility.IOSUtility;

import static com.iexceed.uiframework.appium.PcloudyConnection.appiumDriver;

public class Io_DashboardObjects {

    @FindBy(xpath = "//XCUIElementTypeStaticText")
    WebElement dashboardTitle;

    private final IOSUtility utilities;

    public Io_DashboardObjects(){
        PageFactory.initElements(appiumDriver,this);
        utilities = new IOSUtility();
    }

    public void verifyDashboard() throws Exception {
        utilities.screenshot("Dashboard loading");
        utilities.waitForElement(dashboardTitle);
        System.out.println(dashboardTitle.getText());
        utilities.screenshot("Dashboard");
    }
}
