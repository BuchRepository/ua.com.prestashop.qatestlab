package loginTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import parentTest.ParentTest;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class LoginTest extends ParentTest {

    @Test
    public void validLogin() {
        homePage.openPage();
        homePage.clickOnSignOn();
        loginPage.enterEmailAddressToEmailField();
        loginPage.enterPasswordToPasswordField();
        loginPage.clickToSignIn();
        myAccountPage.clickMyPersonalInformation();
        //checkExpectedResult("MyAccount is not pressent", true, myAccountPage.isMyAccountPresent());
    }


}