package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TshirtPage extends ParentPage{

    @FindBy (xpath = "(.//img[@class='replace-2x img-responsive'])[2]")
    private WebElement firstItemTShirtList;

    @FindBy (xpath = ".//a[@class='button ajax_add_to_cart_button btn btn-default' and @data-id-product='1']")
    private WebElement addToCart;

    @FindBy (xpath = ".//i[@class='icon-ok']")
    private WebElement iconOk;

    @FindBy (xpath = ".//a[@class='btn btn-default button button-medium']")
    private WebElement proceedToCheckout;

    @FindBy (xpath = ".//i[@class='icon-th-list']")
    private WebElement list;

    @FindBy (xpath = ".//span[@class='cross']")
    private WebElement cross;

    @FindBy (xpath= ".//div[@class='shopping_cart']")
    private WebElement cart;

    @FindBy (xpath = "(.//div[@class='wishlist'])[1]")
    private WebElement wishlistButton;


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

    public void clickList() {
        actionsWithOutElements.clickToElement(list);
    }

    public void closedCartWindow() {
        actionsWithOutElements.clickToElement(cross);
    }

    public void clickToCart() {
        actionsWithOutElements.clickToElement(cart);
    }

    public void clickToWishlistButton() {
        actionsWithOutElements.clickToElement(wishlistButton);
    }

    public void moveToFirstItem() {
        actionsWithOutElements.moveToElement(firstItemTShirtList);

    }

    public String getIdFirstItem() {
        System.out.println(firstItemTShirtList.getAttribute("title"));
        return firstItemTShirtList.getAttribute("title");
    }

}
