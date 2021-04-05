package RozetkaSergey;

import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Vijar extends TestInit {

    @Test
    public void loginTest() {
        HomePageVijar homePageVijar = new HomePageVijar(driver);
        homePageVijar.enterToGoogle("https://www.google.com");
        homePageVijar.googleField().sendKeys("Вияр");
        enter();
        homePageVijar.goToVijar().click();
        homePageVijar.closeAdverb().click();
        homePageVijar.goToEnter().click();
        homePageVijar.getLogin().sendKeys(homePageVijar.getterLogin());
        homePageVijar.getPass().sendKeys(homePageVijar.getterPass());
        homePageVijar.clickEnter().click();
        homePageVijar.closeAdverb().click();
        System.out.println("Sehr gut!");
    }

    @Test
    public void switchLanguage() {
        HomePageVijar homePageVijar = new HomePageVijar(driver);
        homePageVijar.enterToVijar("https://viyar.ua/");
        homePageVijar.closeAdverb().click();
        homePageVijar.switchToUa().click();
        homePageVijar.closeAdverb().click();
        String lang = homePageVijar.newsHeaderElement().getText();
        Assert.assertEquals(lang, "Новини");
    }

    @Test
    public void addToCard() {
        HomePageVijar homePageVijar = new HomePageVijar(driver);
        homePageVijar.enterToVijar("https://viyar.ua/");
        homePageVijar.closeAdverb().click();
        homePageVijar.clickAtToolbar().click();
        homePageVijar.clickToDSP().click();
        homePageVijar.closeAdverb().click();
        sleep(1);
        homePageVijar.itemForCompareOne().click();
        sleep(1);
        homePageVijar.itemForCompareTwo().click();
        sleep(1);
        homePageVijar.goToCompare().click();
        String  lang = homePageVijar.itemCounter().getText();
        Assert.assertEquals(lang,"2");
    }


}
