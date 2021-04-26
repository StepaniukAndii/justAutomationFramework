package RozetkaSergey.UkrNet;

import ClasesToAllUs.TestInit;
import RozetkaSergey.UkrNetPages.UkrNetPages;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestCopyWhrite extends TestInit {
    @Test
    public void copyWrite() {
        UkrNetPages ukrNetPages = new UkrNetPages(driver);
        ukrNetPages.enterToUkrNet("https://www.ukr.net/ua");
        sleep(2);
        moveMouseToElement(ukrNetPages.toEndOfTheFirstPage());
        ukrNetPages.buttonAdvertisementOnSite().click();
        switchToNewTitle(1);
        String copyWrite = ukrNetPages.copyWriteSign().getText().replaceAll("[^-\\d.]","").split("-")[1];
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy");
        Date date = new Date();
        String dateFromSite = formatter.format(date);
        Assert.assertEquals(dateFromSite,copyWrite);

    }
    public void switchToNewTitle(int numb){
        List<String> windows = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(numb));

    }
}
