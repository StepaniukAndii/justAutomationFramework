package Svetlana.EatstreetTest;
import ClasesToAllUs.TestInit;
import Svetlana.EatstreetPage.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AboutAs extends TestInit {
    @Test
    public void aboutAs(){
        driver.get("https://eatstreet.com/");
        HomePage homePage=new HomePage(driver);
        homePage.getClickGoItBtn().click();
        homePage.clickAbouAs().click();
        Assert.assertEquals(homePage.checkAboutAs().getText(),"About Us");
    }

}
