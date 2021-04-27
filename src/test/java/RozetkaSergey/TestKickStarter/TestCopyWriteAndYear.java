package RozetkaSergey.TestKickStarter;

import ClasesToAllUs.TestInit;
import RozetkaSergey.KickstarterPages.KickstartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestCopyWriteAndYear extends TestInit {
    @Test
    public void copyWriteAndYear (){
        KickstartPage kickstartPage = new KickstartPage(driver);
        kickstartPage.enterToKickStarter("https://www.kickstarter.com/");
        String copyWriteString = kickstartPage.copyWriteAndYear().getText().replaceAll("[^\\d.]" ,"");
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy");
        Date date = new Date();
        String dateFromSite = formatter.format(date);
        Assert.assertEquals(dateFromSite,copyWriteString);
    }
}
