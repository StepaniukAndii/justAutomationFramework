package TestMarkEatStreet.Test;

import ClasesToAllUs.TestInit;
import TestMarkEatStreet.Page.BlogPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BlogPacificIslanderTest extends TestInit{
    BlogPage blogPage;
    @Test
    public void pacificislandertext(){
        blogPage = new BlogPage(driver);
        openUrl("https://blog.eatstreet.com/");
        blogPage.pacificislandertextbtn().click();
        Boolean wait = new WebDriverWait(driver, 10).
                until(ExpectedConditions.urlToBe("https://blog.eatstreet.com/2021/04/29/aapi-month/"));
        Assert.assertTrue(driver.getCurrentUrl().contains("aapi-month/"));
    }
}
