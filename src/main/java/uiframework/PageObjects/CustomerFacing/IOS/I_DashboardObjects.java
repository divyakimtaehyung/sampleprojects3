package uiframework.PageObjects.CustomerFacing.IOS;

import com.iexceed.uiframework.core.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uiframework.DomainObjects.Utility;

public class I_DashboardObjects {
    WebDriver driver = TestBase.getDriver();


    @FindBy(xpath = "//*[@id='cfpdhb__Dashboard__el_txt_1']")
    WebElement dashboardTitle;

    private final Utility utilities;

    public I_DashboardObjects(){
        PageFactory.initElements(driver,this);
        utilities = new Utility();
    }

    public void verifyDashboard() throws Exception {
        utilities.waitForElement(dashboardTitle);
    }
}
