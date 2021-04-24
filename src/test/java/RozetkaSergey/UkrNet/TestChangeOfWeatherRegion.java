package RozetkaSergey.UkrNet;

import ClasesToAllUs.TestInit;
import RozetkaSergey.UkrNetPages.UkrNetPages;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestChangeOfWeatherRegion extends TestInit  {
    @Test
    public void changeOfWeatherRegion (){
        UkrNetPages ukrNetPages = new UkrNetPages(driver);
        ukrNetPages.enterToUkrNet("https://www.ukr.net/ua");
        switchToIframe();
        String firstCity = ukrNetPages.cityName().getText();
        System.out.println(firstCity);
        ukrNetPages.cityName().click();
        ukrNetPages.fieldForSearchCity().sendKeys("Киев");
        sleep(1);
        enter();
        String secondCity = ukrNetPages.cityName().getText().replaceAll("\\p{P}", "").split(" ")[1];
        System.out.println(secondCity);
        Assert.assertEquals("Киев",secondCity);


        sleep(1);
    }
    public void switchToIframe (){
        driver.switchTo().frame(getElement("//iframe[@name='weather widget']"));
    }
}
