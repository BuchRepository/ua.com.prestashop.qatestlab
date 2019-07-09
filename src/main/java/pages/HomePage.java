package pages;

import libs.ActionWithOutElements;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends ParentPage {

    WebDriverWait wait10, wait15;


    public HomePage(WebDriver webDriver) {
        super(webDriver, "/");
        wait10 = new WebDriverWait(webDriver, 10);
    }

    @FindBy(xpath = ".//a[@class=\"login\"]")
    private WebElement signIn;

    @FindBy(xpath = ".//a[@title='T-shirts']")
    private WebElement tShirtMenuItem;

    @FindBy(xpath = ".//a[@title='Women']")
    private WebElement womenMenuItem;

    @FindBy(xpath = ".//a[@title='Blouses']")
    private WebElement blousesMenuItem;

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
        //wait10.until(ExpectedConditions.titleIs("Women"));
        actionsWithOutElements.moveToElement(womenMenuItem);
    }

    public void moveToTShirtItemMenu() {
        actionsWithOutElements.moveToElement(tShirtMenuItem);
    }

}
