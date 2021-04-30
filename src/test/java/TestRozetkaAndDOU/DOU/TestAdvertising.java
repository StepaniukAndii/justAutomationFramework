package TestRozetkaAndDOU.DOU;

import ClasesToAllUs.TestInit;
import TestRozetkaAndDOU.BaseDate;
import TestRozetkaAndDOU.DOU.PagesDOU.AdvertisingPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class TestAdvertising extends TestInit {

    @Test
    public void testAdvertising() {
        openUrl(BaseDate.BASE_URL_DOU);
        AdvertisingPage advertisingPage = new AdvertisingPage(driver);
        advertisingPage.getAdvertising().click();
        Set<String> tabs = driver.getWindowHandles();
        Iterator<String> it = tabs.iterator();
        String tab1 = it.next();
        String tab2 = it.next();
        driver.switchTo().window(tab2);
        Assert.assertEquals(driver.getCurrentUrl(),"https://jobs.dou.ua/companies/allst" +
                "ars-it/vacancies/152257/?from=fp-header");
        driver.switchTo().window(tab1);
        advertisingPage.getAdvertisingHeader().click();
        Assert.assertEquals(driver.getCurrentUrl(),"/companies/levi9/vacancies/158120/?from=rs");
    }
}