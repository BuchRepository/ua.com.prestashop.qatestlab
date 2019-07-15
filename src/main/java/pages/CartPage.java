package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends ParentPage {

    @FindBy(xpath = ".//a[@title='Delete' and @id='1_1_0_0']")
    private WebElement firstPicDeleteFromCart;

    @FindBy(xpath = ".//tr[@id='product_1_1_0_0']")
    private WebElement firstItemInCart;


    public CartPage(WebDriver webDriver) {
        super(webDriver, "order");
    }

    public void deleteFromCart() {
        actionsWithOutElements.clickToElement(firstPicDeleteFromCart);
    }


    public void checkDeletedFromCart() {
        actionsWithOutElements.isDisplayed(firstItemInCart);
    }

    public boolean isItemInList() {
        if (actionsWithOutElements.isDisplayed(firstItemInCart)==true){
            logger.info("The product is in the cart");
            return true;

        } else{
            logger.error("The product wasn't in the cart");
            Assert.fail("The product wasn't in the cart");
            return false;

        }
    }


}
