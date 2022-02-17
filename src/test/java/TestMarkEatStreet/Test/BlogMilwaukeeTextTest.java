package TestMarkEatStreet.Test;

import ClasesToAllUs.TestInit;
import TestMarkEatStreet.Page.BlogPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BlogMilwaukeeTextTest extends TestInit{
    BlogPage blogPage;
    @Test
    public void milwaukeetext(){
        blogPage = new BlogPage(driver);
        openUrl("https://blog.eatstreet.com/");
        blogPage.milwaukeetextbtn().click();
        Boolean wait = new WebDriverWait(driver, 10).
                until(ExpectedConditions.urlToBe("https://blog.eatstreet.com/2021/03/17/eatstreet-milwaukee-brewers/"));
        Assert.assertTrue(driver.getCurrentUrl().contains("milwaukee-brewers/"));

    }
}
