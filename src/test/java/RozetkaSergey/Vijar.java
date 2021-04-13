package RozetkaSergey;

import ClasesToAllUs.TestInit;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.*;

public class Vijar extends TestInit {




    @Test //14
    public void checkMainAdvertisement () {
        HomePageVijar homePageVijar = new HomePageVijar(driver);
        homePageVijar.enterToVijar("https://viyar.ua/");
        homePageVijar.closeAdverb().click();
        homePageVijar.clickAdvertisement().get(0).click();
        sleep(1);
        homePageVijar.clickAdvertisement().get(0).click();
        sleep(1);
        homePageVijar.clickAdvertisement().get(0).click();
        sleep(1);
        homePageVijar.clickAdvertisement().get(0).click();
        sleep(1);
        homePageVijar.clickAdvertisement().get(0).click();
        sleep(1);
    }
}
