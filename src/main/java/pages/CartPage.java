package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends ParentPage {

    @FindBy(xpath = ".//a[@title='Delete']")
    private WebElement deletePictogramFromCart;

    @FindBy(xpath = ".//tr[@id='product_1_1_0_0']")
    private WebElement firstItemInCart;

    public CartPage(WebDriver webDriver) {
        super(webDriver, "order");
    }

    public void deleteFromCart() {
        actionsWithOutElements.clickToElement(deletePictogramFromCart);
    }


    public void checkDeletedFromCart() {
        actionsWithOutElements.isDisplayed(firstItemInCart);
    }

}
