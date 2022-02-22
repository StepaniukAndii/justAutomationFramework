package TestMarkEatStreet.Test;

import ClasesToAllUs.TestInit;
import TestMarkEatStreet.Page.BlogPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BlogLGBTQTextEatStreetTest extends TestInit{
    BlogPage blogPage;
    @Test
    public void bloglgbtqtext(){
        blogPage = new BlogPage(driver);
        openUrl("https://blog.eatstreet.com/");
        blogPage.lgbtqtextbtn().click();
        Boolean wait = new WebDriverWait(driver, 10).
                until(ExpectedConditions.urlToBe("https://blog.eatstreet.com/2021/05/27/pride-month/"));
        Assert.assertTrue(driver.getCurrentUrl().contains("pride-month/"));
    }
}
