package TestMarkEatStreet.Test;

import ClasesToAllUs.TestInit;
import TestMarkEatStreet.Page.BlogPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BlogGivingSeasonTest extends TestInit{
    BlogPage blogPage;
    @Test
    public void givingseasontext(){
        blogPage = new BlogPage(driver);
        openUrl("https://blog.eatstreet.com/");
        blogPage.givingseasontextbtn().click();
        Boolean wait = new WebDriverWait(driver, 10).
                until(ExpectedConditions.urlToBe("https://blog.eatstreet.com/2020/12/29/recapping-eatstreets-giving-season/"));
        Assert.assertTrue(driver.getCurrentUrl().contains("giving-season/"));
    }
}
