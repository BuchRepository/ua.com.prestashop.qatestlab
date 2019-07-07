package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TshirtPage extends ParentPage{

    @FindBy (xpath = ".//img[@class='replace-2x img-responsive']")
    private WebElement firstItemTShirtList;

    @FindBy (xpath = ".//button[@name='Submit']")
    private WebElement addToCart;

    @FindBy (xpath = ".//i[@class='icon-ok']")
    private WebElement iconOk;

    @FindBy (xpath = ".//i[@class='icon-chevron-right right']")
    private WebElement proceedToCheckout;

    public TshirtPage(WebDriver webDriver) {
        super(webDriver, "5-tshirts");
    }


    public void clickToFirstTShirt() {
        actionsWithOutElements.clickToElement(firstItemTShirtList);
    }

    public void clickAddToCart() {
        actionsWithOutElements.clickToElement(addToCart);
    }

    public void checkAddToCart() {
        actionsWithOutElements.isDisplayed(iconOk);
    }

    public void clickProceedToCheckOut() {
        actionsWithOutElements.clickToElement(proceedToCheckout);
    }
}
