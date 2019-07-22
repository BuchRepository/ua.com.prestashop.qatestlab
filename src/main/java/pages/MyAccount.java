package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccount extends ParentPage {

    @FindBy(xpath = "(.//i[@class='icon-building'])[2]")
    private WebElement myPersonalInformation;

    @FindBy(xpath = ".//input[@id='email']")
    private WebElement emailAddressField;

    @FindBy (xpath = ".//i[@class='icon-heart']")
    private WebElement myWishlist;

    public MyAccount(WebDriver webDriver) {
        super(webDriver, "my-account");
    }

   /* public void clickMyPersonalInformation() {
        actionsWithOutElements.clickToElement(myPersonalInformation);
    }*/

    public boolean isPresentOnMyPersonalInformationPage(String login) {
        actionsWithOutElements.clickToElement(myPersonalInformation);

        if (emailAddressField.getAttribute("value").equals(login)) {
            logger.info(login + " is presented on \"My Personal Information\" page");
            System.out.println(login + " is presented on \"My Personal Information\" page");
            return true;
        } else {
            logger.error(login + " isn't presented on \"My Personal Information\" page");
            System.out.println(login + " isn't presented on \"My Personal Information\" page");
            return false;
        }

    }

    public void checkAddedItemToWishlist() {
        actionsWithOutElements.clickToElement(myWishlist);

    }
}
