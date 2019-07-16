package changeLanguage;

import org.junit.Test;
import parentTest.ParentTest;

public class ChangeLanguageTest extends ParentTest {

    @Test
    public void changeLanguage() {
        homePage.openPage();
       // homePage.clickToChangeLanguage();
        homePage.changeLanguage("Українська");
        checkExpectedResult("Ukraine language wasn't chose", true, homePage.ukraineLanguageIsPresent());

    }

}
