package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccount extends ParentPage{

    @FindBy (xpath=".//a[@title='Information']")
    private WebElement myPersonalInformation;

    public MyAccount(WebDriver webDriver) {
        super(webDriver, "my-account/");
    }

    public void clickMyPersonalInformation() {
        actionsWithOutElements.clickToElement(myPersonalInformation);
    }
}
