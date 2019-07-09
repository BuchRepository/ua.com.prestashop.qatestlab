package addToCart;

import org.junit.Test;
import parentTest.ParentTest;

public class AddToCart extends ParentTest {

    @Test
    public void addToCart(){
        homePage.openPage();
        homePage.moveToWomenItem();
        homePage.moveToTShirtItemMenu();
        homePage.clickToTShirtItemMenu();
        tShirtPage.clickToFirstTShirt();
        tShirtPage.clickAddToCart();


    }



}
