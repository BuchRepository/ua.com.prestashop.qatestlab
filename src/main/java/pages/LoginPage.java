package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import sun.rmi.runtime.Log;

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

    public void enterEmailAddressToEmailField(String email) {
        actionsWithOutElements.enterTextToInput(emailAddressField, email);
    }

    public void enterPasswordToPasswordField(String pass) {
        actionsWithOutElements.enterTextToInput(passwordField, pass);
    }

    public void clickToSignIn() {
        actionsWithOutElements.clickToElement(signInButton);
    }

    public void openPage() {
        try{
            webDriver.get("http://prestashop.qatestlab.com.ua/authentication?back=my-account");
            logger.info("Login page is opened");
        } catch (Exception e){
            logger.error("Can't open LoginPage");
            Assert.fail("Can't open LoginPage");
        }
    }

    public void validsignIn(){
        openPage();
        enterEmailAddressToEmailField("adbetnet2016@gmail.com");
        enterPasswordToPasswordField("samsung");
        clickToSignIn();
    }


}
