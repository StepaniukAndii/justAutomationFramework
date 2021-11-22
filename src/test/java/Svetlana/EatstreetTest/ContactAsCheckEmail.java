package Svetlana.EatstreetTest;

import ClasesToAllUs.TestInit;
import Svetlana.EatstreetPage.AboutAsPage;
import Svetlana.EatstreetPage.FooterPage;
import Svetlana.EatstreetPage.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class ContactAsCheckEmail extends TestInit {
    @Test
    public void contactAsCheckEmail(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        openUrl("https://eatstreet.com/");
        HomePage homePage=new HomePage(driver);
        homePage.getClickGoItBtn().click();
        FooterPage footerPage=new FooterPage(driver);
        footerPage.openContactUs().click();
        AboutAsPage aboutAsPage=new AboutAsPage(driver);
        aboutAsPage.checkOpenUrl().get(1).click();
        ArrayList<String> countTabs =new ArrayList<String>(driver.getWindowHandles());
        Assert.assertEquals(countTabs.size(),1);
    }
}
