package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends ParentPage{

    public LoginPage(WebDriver webDriver) {
        super(webDriver, "authentication?back=my-account");
    }

    @FindBy  (xpath=".//input[@id='email']")
    private WebElement emailAddressField;

    @FindBy (xpath =".//input[@id='passwd']")
    private WebElement passwordField;

    @FindBy (xpath =".//button[@id='SubmitLogin']")
    private WebElement signInButton;

    public void enterEmailAddressToEmailField() {
        actionsWithOutElements.enterTextToInput(emailAddressField, "adbetnet2016@gmail.com");
    }

    public void enterPasswordToPasswordField() {
        actionsWithOutElements.enterTextToInput(passwordField, "samsung");
    }

    public void clickToSignIn() {
        actionsWithOutElements.clickToElement(signInButton);
    }
}
