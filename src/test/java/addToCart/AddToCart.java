package addToCart;

import org.junit.Test;
import parentTest.ParentTest;

public class AddToCart extends ParentTest {

    @Test
    public void addToCart(){
        homePage.openPage();
        homePage.moveToWomenItem();
        homePage.clickToTShirtItemMenu();



    }



}
