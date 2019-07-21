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

    @FindBy(xpath = "(.//a[@title='T-shirts'])[2]")
    private WebElement tShirtMenuItem;



    @FindBy(xpath = ".//a[@title='Women']")
    private WebElement womenMenuItem;

    @FindBy(xpath = ".//div[@id='languages-block-top']")
    private WebElement changeLanguageDropDown;


    @FindBy(xpath = ".//div[@class='current' and span='Українська']")
    private WebElement ukraineLanguageIsCurrent;

    @FindBy(xpath = "(.//span[contains(text(),'Quick view')])[1]")
    private WebElement somePopularItem;

    @FindBy(xpath = "(.//a[@class='product_img_link'])[1]")
    private WebElement firstPopularItem;

    @FindBy (xpath = ".//a[@id='wishlist_button']")
    private WebElement wishlistButton;


    public void openPage() {
        try {
            webDriver.get("http://prestashop.qatestlab.com.ua/");
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

    public void clickToChangeLanguage() {
        actionsWithOutElements.clickToElement(changeLanguageDropDown);
    }

    public void changeLanguage(String language) {
        String currentLanguage = changeLanguageDropDown.getText();
        System.out.println(changeLanguageDropDown.getText());

        if (currentLanguage.equals(language)) {
            logger.info(language + " has been already selected");
            System.out.println(language + " has been already selected");
        } else if (language.equals("English")) {
            actionsWithOutElements.clickToElement(changeLanguageDropDown);
            actionsWithOutElements.clickToElement(".//a[@title='English (United States)']");
            logger.info("English is selected current's language");
        } else if (language.equals("Русский")) {
            actionsWithOutElements.clickToElement(changeLanguageDropDown);
            actionsWithOutElements.clickToElement(".//a[@title='Русский (Russian)']");
            logger.info("Russian is selected current's language");
        } else if (language.equals("Українська")) {
            actionsWithOutElements.clickToElement(changeLanguageDropDown);
            actionsWithOutElements.clickToElement(".//a[@title='Українська (Ukrainian)']");
            logger.info("Ukrainian is selected current's language");
            System.out.println("Ukrainian is selected current's language");
        } else {
            logger.error("You inputted wrong language ");
        }
    }


    public void clickToTShirtItemMenu() {

        actionsWithOutElements.clickToElement(tShirtMenuItem);
    }

    public void moveToWomenItem() {
        //wait10.until(ExpectedConditions.titleIs("Women"));
        actionsWithOutElements.moveToElement(womenMenuItem);
    }

    public void moveToTShirtItemMenu() {
        actionsWithOutElements.moveToElement(tShirtMenuItem);
    }


    public boolean ukraineLanguageIsPresent() {
        return actionsWithOutElements.isDisplayed(ukraineLanguageIsCurrent);
    }

    public void clickToSomePopularItem() {
    actionsWithOutElements.clickToElement(somePopularItem);
    }

    public void moveToFirstPopularItem() {
        actionsWithOutElements.moveToElement(firstPopularItem);
    }

    public void clickToWishlistButton() {
        actionsWithOutElements.clickToElement(wishlistButton);
    }

}
