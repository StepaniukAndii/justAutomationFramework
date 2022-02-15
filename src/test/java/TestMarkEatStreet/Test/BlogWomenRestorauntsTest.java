package TestMarkEatStreet.Test;

import ClasesToAllUs.TestInit;
import TestMarkEatStreet.Page.BlogPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BlogWomenRestorauntsTest extends TestInit{
    BlogPage blogPage;
    @Test
    public void womenrestorauntstext(){
        blogPage = new BlogPage(driver);
        openUrl("https://blog.eatstreet.com/");
        blogPage.womenrestorauntstextbtn().click();
        Boolean wait = new WebDriverWait(driver, 10).
                until(ExpectedConditions.urlToBe("https://blog.eatstreet.com/2021/03/03/womens-history-month/"));
        Assert.assertTrue(driver.getCurrentUrl().contains("womens-history-month/"));
    }
}
