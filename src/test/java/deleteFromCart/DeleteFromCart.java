package deleteFromCart;

import addToCart.AddToCart;
import org.junit.Test;
import pages.ParentPage;
import parentTest.ParentTest;

public class DeleteFromCart extends ParentTest {

    @Test
    public void deleteFromCart(){
        homePage.openPage();
        homePage.moveToWomenItem();
        homePage.moveToTShirtItemMenu();
        homePage.clickToTShirtItemMenu();
        tShirtPage.clickList();
        tShirtPage.clickAddToCart();
        tShirtPage.clickProceedToCheckOut();
        tShirtPage.clickToCart();
        cartPage.deleteFromCart();
        //cartPage.checkDeletedFromCart();









    }
}
