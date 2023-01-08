package uiframework.PageObjects.CustomerFacing.Web;

import com.iexceed.uiframework.core.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uiframework.DomainObjects.Utility;

public class DashboardObjects {
    WebDriver driver = TestBase.getDriver();


    @FindBy(xpath = "//*[@id='cfpdhb__Dashboard__el_txt_1']")
    WebElement dashboardTitle;

    private final Utility utilities;

    public DashboardObjects(){
        PageFactory.initElements(driver,this);
        utilities = new Utility();
    }

    public void verifyDashboard() throws Exception {
        utilities.waitForElement(dashboardTitle);
    }
}
