package deleteFromCart;

import addToCart.AddToCart;
import org.junit.Test;
import pages.ParentPage;
import parentTest.ParentTest;

public class DeleteFromCart extends ParentTest {

    @Test
    public void addToCart(){
        DeleteFromCart.super.addToCart();
        cartPage.deleteFromCart();
        cartPage.checkDeletedFromCart();








    }
}
