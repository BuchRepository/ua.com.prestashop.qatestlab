package parentTest;

import addToCart.AddToCart;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import pages.*;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class ParentTest {
    protected WebDriver webDriver;
    protected LoginPage loginPage;
    protected HomePage homePage;
    protected TshirtPage tShirtPage;
    protected CartPage cartPage;
    protected MyAccount myAccountPage;



    @Before
    public  void before(){
        //Path to chromesriver.exe for Java
        File file = new File("./src/drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());

        webDriver = new ChromeDriver();
        //Show the window in max. size
        webDriver.manage().window().maximize();
        //Set default wait open
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        loginPage= new LoginPage(webDriver);
        homePage = new HomePage(webDriver);
        tShirtPage = new TshirtPage(webDriver);
        cartPage = new CartPage(webDriver);
        myAccountPage = new MyAccount(webDriver);
    }

    @After
    public void  after(){
        webDriver.quit();
    }

    public void checkExpectedResult(String message, boolean expectedResult, boolean actualResult){
        Assert.assertEquals(message, expectedResult, actualResult);
        //webDriver.findElement(By.xpath(".//*[@class='pull-left image']")).isDisplayed()
    }

//    public void checkExpectedResult (String message, boolean actualResult){
////        checkExpectedResult();
////    }



}
