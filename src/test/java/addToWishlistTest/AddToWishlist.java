package addToWishlistTest;

import loginTest.LoginTest;
import org.junit.Test;
import parentTest.ParentTest;

public class AddToWishlist extends ParentTest {

    @Test
    public void addToWishlist(){
        String idFirstItem;
   /*
        Can't click to wishlistButton. Locator is correct.
        homePage.openPage();
        homePage.moveToFirstPopularItem();
        homePage.clickToSomePopularItem();
        homePage.clickToWishlistButton();  */
        loginPage.validsignIn();
        homePage.clickToTShirtItemMenu();
        tShirtPage.clickList();
        tShirtPage.moveToFirstItem();
        tShirtPage.clickToWishlistButton();
        tShirtPage.clickCloseAddedNotification();
        tShirtPage.clickToMyAccount();
        myAccountPage.checkAddedItemToWishlist();
        myWishlist.clickViewWishlist();

        checkExpectedResult("Can not find item in list", true, myWishlist.isFirstItemInList(tShirtPage.getIdFirstItem()));

    }
}
