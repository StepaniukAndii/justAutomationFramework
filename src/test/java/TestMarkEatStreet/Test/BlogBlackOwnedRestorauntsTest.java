package TestMarkEatStreet.Test;

import ClasesToAllUs.TestInit;
import TestMarkEatStreet.Page.BlogPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BlogBlackOwnedRestorauntsTest extends TestInit{
    BlogPage blogPage;
    @Test
    public void blackownedrestorauntstext(){
        blogPage = new BlogPage(driver);
        openUrl("https://blog.eatstreet.com/");
        blogPage.blackrestorauntstextbtn().click();
        Boolean wait = new WebDriverWait(driver, 10).
                until(ExpectedConditions.urlToBe("https://blog.eatstreet.com/2021/01/29/wi-black-owned-restaurants/"));
        Assert.assertTrue(driver.getCurrentUrl().contains("black-owned-restaurants/"));

    }
}
