package loginTest;

import org.junit.Test;
import parentTest.ParentTest;

public class LoginTest extends ParentTest {

    @Test
    public void validLogin() {
        homePage.openPage();
        homePage.clickOnSignOn();
        loginPage.enterEmailAddressToEmailField("adbetnet2016@gmail.com");
        loginPage.enterPasswordToPasswordField("samsung");
        loginPage.clickToSignIn();
        checkExpectedResult("MyAccount is not pressent", true, myAccountPage.isPresentOnMyPersonalInformationPage("adbetnet2016@gmail.com"));
    }


}