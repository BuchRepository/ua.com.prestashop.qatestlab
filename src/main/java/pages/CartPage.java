package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends ParentPage {

    @FindBy(xpath = ".//a[@id='1_1_0_0']")
    private WebElement firstPicDeleteFromCart;

    @FindBy(xpath = ".//tr[@id='product_1_1_0_0']")
    private WebElement firstItemInCart;


    public CartPage(WebDriver webDriver) {
        super(webDriver, "order");
    }

    public void deleteFromCart() {
        actionsWithOutElements.clickToElement(firstPicDeleteFromCart);
        logger.info("Item was deleted from cart");
    }


    public boolean isItemInList() {
        return actionsWithOutElements.isDisplayed(firstItemInCart);
    }



}
