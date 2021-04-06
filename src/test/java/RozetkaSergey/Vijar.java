package RozetkaSergey;

import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

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
        sleep(1);
        Assert.assertEquals(lang,"2");
    }
    @Test
    public void checkSwitching (){
        HomePageVijar homePageVijar = new HomePageVijar(driver);
        homePageVijar.enterToVijar("https://viyar.ua/");
        homePageVijar.closeAdverb().click();
        homePageVijar.topBar1().click();
        sleep(1);
        homePageVijar.topBar2().click();
        sleep(1);
        homePageVijar.topBar3().click();
        sleep(1);
        homePageVijar.topBar4().click();
        sleep(1);
        homePageVijar.topBar5().click();
        sleep(1);
        homePageVijar.topBar6().click();
        sleep(1);
        homePageVijar.topBar7().click();
        sleep(1);
        homePageVijar.topBar8().click();
        sleep(1);
        Assert.assertEquals(homePageVijar.counter,8);
    }
    @Test
    public void checkSearchField () {
        HomePageVijar homePageVijar = new HomePageVijar(driver);
        homePageVijar.enterToVijar("https://viyar.ua/");
        homePageVijar.closeAdverb().click();
        homePageVijar.findSearchFiel().sendKeys("Egger");
        homePageVijar.clickOnFind().click();
        homePageVijar.closeAdverb().click();
        List<String> elements = getAllElementsWithAttribute(homePageVijar.getElementsEgger(), "title");
        for (String elenent : elements) {
         String str  =   elenent.toLowerCase();
            if (!str.contains("egger")) {
                Assert.fail();
            }
        }




        
    }
    @Test
    public void checkPhoneNumbers () {
        HomePageVijar homePageVijar = new HomePageVijar(driver);
        homePageVijar.enterToVijar("https://viyar.ua/");
        homePageVijar.closeAdverb().click();
        homePageVijar.switchToUa().click();
        homePageVijar.closeAdverb().click();
        homePageVijar.clickToOpenFindPhonNumber().click();
        homePageVijar.closeAdverb().click();
        String  lang = homePageVijar.chosePhone().getText();
        Assert.assertEquals(lang,"+38 (044) 500-57-07");

    }


}
