package pages;

import libs.ActionWithOutElements;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.FindBy;

public class HomePage extends ParentPage {


    public HomePage(WebDriver webDriver) {
        super(webDriver, "/");

    }

    @FindBy(xpath = ".//a[@class=\"login\"]")
    private WebElement signIn;

    @FindBy(xpath = ".//a[@title='T-shirts']")
    private WebElement tShirtMenuItem;

    @FindBy(xpath = ".//a[@title='Women']")
    private WebElement womenMenuItem;

    public void openPage() {
        try {
            webDriver.get("http://prestashop.qatestlab.com.ua/en/");
            logger.info("Login page is opened");
        } catch (Exception e) {
            logger.error("Can't open LoginPage");
            Assert.fail("Can't open LoginPage");
        }

    }

    public void clickOnSignOn() {
        try {
            signIn.click();
            logger.info("Sign in was clicked");
        } catch (Exception e) {
            logger.error("Sign in isn't work");
            Assert.fail("Sign in isn't work");
        }
    }

    public void clickToTShirtItemMenu() {
        actionsWithOutElements.clickToElement(tShirtMenuItem);
    }

    public void moveToWomenItem(){
        actionsWithOutElements.moveToElement(womenMenuItem);
    }
}
