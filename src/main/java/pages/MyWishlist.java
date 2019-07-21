package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyWishlist extends ParentPage {

    @FindBy (xpath = "(.//td)[5]")
    private WebElement viewWishlist;

    @FindBy (xpath = "(.//img[@class='replace-2x img-responsive'] alt)[8]")
    private WebElement firstItemWishlist;

    @FindBy (xpath = "")
    private WebElement titleFirstItemWishList;

    public MyWishlist(WebDriver webDriver) {
        super(webDriver, "/module/blockwishlist/mywishlist");
    }


    public void clickViewWishlist() {
        actionsWithOutElements.clickToElement(viewWishlist);

    }


    public boolean isFirstItemInList(String titleFirstItemWishlist) {
        return actionsWithOutElements.isDisplayed(".//*[contains(text(),'" + titleFirstItemWishlist + "')]// ..// div[@class='wishlist_product_detail']");
    }
}
