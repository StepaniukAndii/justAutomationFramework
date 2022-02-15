package TestMarkEatStreet.Test;

import ClasesToAllUs.TestInit;
import TestMarkEatStreet.Page.BlogPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BlogCompostingDayTest extends TestInit{
    BlogPage blogPage;
    @Test
    public void compostingtext(){
        blogPage = new BlogPage(driver);
        openUrl("https://blog.eatstreet.com/");
        blogPage.compostingtextbtn().click();
        Boolean wait = new WebDriverWait(driver, 10).
                until(ExpectedConditions.urlToBe("https://blog.eatstreet.com/2021/05/19/composting-day/"));
        Assert.assertTrue(driver.getCurrentUrl().contains("composting-day/"));

    }
}
