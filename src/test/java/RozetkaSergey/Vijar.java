package RozetkaSergey;

import ClasesToAllUs.TestInit;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.*;

public class Vijar extends TestInit {

    @Test
    public void checkSearchField () {
        HomePageVijar homePageVijar = new HomePageVijar(driver);
        homePageVijar.enterToVijar("https://viyar.ua/");
        homePageVijar.closeAdverb().click();
        homePageVijar.findSearchFiel().sendKeys("Egger");
        homePageVijar.clickOnFind().click();
        homePageVijar.closeAdverb().click();
        List<String> elements = getAttributeCollection(homePageVijar.getElementsEgger(), "title");
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
    @Test
    public void checkFastScroll(){
        HomePageVijar homePageVijar = new HomePageVijar(driver);
        homePageVijar.enterToVijar("https://viyar.ua/");
        homePageVijar.closeAdverb().click();
        homePageVijar.scrollDown().sendKeys(Keys.PAGE_DOWN);
        sleep(2);
        homePageVijar.scrollFastUpButton().click();
        sleep(2);
    }
    @Test
    public void checkOutNameAndSurname(){
        HomePageVijar homePageVijar = new HomePageVijar(driver);
        homePageVijar.enterToVijar("https://viyar.ua/");
        homePageVijar.closeAdverb().click();
        homePageVijar.goToEnter().click();
        homePageVijar.getLogin().sendKeys(homePageVijar.getterLogin());
        homePageVijar.getPass().sendKeys(homePageVijar.getterPass());
        homePageVijar.clickEnter().click();
        homePageVijar.closeAdverb().click();
        homePageVijar.goToProfil().click();
        String surname = homePageVijar.getSurname().getAttribute("value");
        Assert.assertEquals(surname,"Гринчук");
        String name = homePageVijar.getName().getAttribute("value");
        Assert.assertEquals(name, "Сергей");
            }
    @Test
    public void checkOutLoginAndPass () {
        HomePageVijar homePageVijar = new HomePageVijar(driver);
        homePageVijar.enterToVijar("https://viyar.ua/");
        homePageVijar.closeAdverb().click();
        homePageVijar.goToEnter().click();
        homePageVijar.getLogin().sendKeys(homePageVijar.getterLogin());
        homePageVijar.getPass().sendKeys(homePageVijar.getterPass());
        homePageVijar.clickEnter().click();
        homePageVijar.closeAdverb().click();
        homePageVijar.goToProfil().click();
        String log = homePageVijar.getLog().getAttribute("value");
        String pas = homePageVijar.getPassword().getAttribute("value");
        Assert.assertEquals(pas,log);
    }
    @Test
    public void addItemToBasket (){
        HomePageVijar homePageVijar = new HomePageVijar(driver);
        homePageVijar.enterToVijar("https://viyar.ua/");
        homePageVijar.closeAdverb().click();
        homePageVijar.topBar2().click();
        homePageVijar.clickOnSamorezy().click();
        homePageVijar.closeAdverb().click();
        homePageVijar.getItems().get(0).click();
        homePageVijar.closeAdverb().click();
        homePageVijar.pickBuy().get(0).click();
        homePageVijar.pickBuy2().get(0).click();

    }
    @Test
    public void checkBasket (){
        HomePageVijar homePageVijar = new HomePageVijar(driver);
        homePageVijar.enterToVijar("https://viyar.ua/");
        homePageVijar.closeAdverb().click();
        homePageVijar.topBar2().click();
        homePageVijar.clickOnSamorezy().click();
        homePageVijar.closeAdverb().click();
        homePageVijar.getItems().get(0).click();
        homePageVijar.closeAdverb().click();
        homePageVijar.pickBuy().get(0).click();
        String boltFirstPrice = homePageVijar.getPrice().getText();
        double convertetBoltFirstPrice = Double.parseDouble(boltFirstPrice);
        homePageVijar.pickBuy2().get(0).click();
        homePageVijar.checkOut().click();
        homePageVijar.addItemToCard().click();
        getElement("//input[@class='onlyNumber pull-left']").sendKeys("0");
        sleep(1);
        double fullBoltsPrice = convertetBoltFirstPrice*30*10/10;
        getElement("//h2[@class='lk_heading_content']").click();
        sleep(1);
        String  totalOrderPrise = homePageVijar.getTheSecondPrice().getText().split(" ")[0];
        double convertedTotalPrise = Double.parseDouble(totalOrderPrise);
        Assert.assertEquals(fullBoltsPrice,convertedTotalPrise);

    }
    @Test
    public void deleteFromBasket(){
        HomePageVijar homePageVijar = new HomePageVijar(driver);
        homePageVijar.enterToVijar("https://viyar.ua/");
        homePageVijar.closeAdverb().click();
        homePageVijar.topBar2().click();
        homePageVijar.clickOnSamorezy().click();
        homePageVijar.closeAdverb().click();
        homePageVijar.getItems().get(0).click();
        homePageVijar.closeAdverb().click();
        homePageVijar.pickBuy().get(0).click();
        homePageVijar.pickBuy2().get(0).click();
        homePageVijar.ordering().click();
        homePageVijar.deliteItemFromBasket().click();
        String value = homePageVijar.getfromseitText().getText();
        Assert.assertEquals(value,"В вашей корзине ещё нет товаров.");
        sleep(1);






    }
    @Test
    public void checkSchedule () {
        HomePageVijar homePageVijar = new HomePageVijar(driver);
        homePageVijar.enterToVijar("https://viyar.ua/");
        homePageVijar.closeAdverb().click();
        homePageVijar.clickOnStatusOfOrder().click();
        homePageVijar.closeAdverb().click();
        List<String> listFromSchedule = getElementsText(homePageVijar.getDigit());
        String firsDigitFromTable = listFromSchedule.get(0);
        SimpleDateFormat formater = new SimpleDateFormat("(dd.MM)");
        Date realDate = new Date();
        System.out.println(firsDigitFromTable);
        System.out.println(formater.format(realDate));
        // Тест рабочий но не завершен до логического конца, так как есть два вопроса.
    }
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
