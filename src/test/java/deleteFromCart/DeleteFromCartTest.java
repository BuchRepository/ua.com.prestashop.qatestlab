package deleteFromCart;

import org.junit.Test;
import parentTest.ParentTest;

public class DeleteFromCartTest extends ParentTest {

    @Test
    public void deleteFromCart() {
        homePage.openPage();
        homePage.moveToWomenItem();
        homePage.moveToTShirtItemMenu();
        homePage.clickToTShirtItemMenu();
        tShirtPage.clickList();
        tShirtPage.clickAddToCart();
        tShirtPage.clickProceedToCheckOut();
        tShirtPage.clickToCart();
        cartPage.deleteFromCart();
        checkExpectedResult("Item was find in cart", false, cartPage.isItemInList());

    }
}
