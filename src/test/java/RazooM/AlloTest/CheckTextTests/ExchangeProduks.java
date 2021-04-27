package RazooM.AlloTest.CheckTextTests;

import RazooM.AlloTest.Pages.ExchangeProduksLokators;
import ClasesToAllUs.TestInit;
import org.testng.annotations.Test;

public class ExchangeProduks extends TestInit {

    ExchangeProduksLokators locators;

    @Test
    public void exchangeProduks(){
        goToSiteAllo();
        choiceMyNewSamsung();
        choiceMyOldSamsung();
        getAndShowTheResult();
    }

    private void getAndShowTheResult() {
        String price =  locators.priceTell().getText();
        String discount = locators.discountTell().getText();
        String leftToPay = locators.leftToPayTell().getText();
        System.out.println ("Стоимость выбранного устройства: " +price);
        System.out.println ("Скидка по программе Алло Обмен: "  +discount);
        System.out.println ("Осталось доплатить: " +leftToPay);
    }

    private void choiceMyOldSamsung() {
        locators.choiceMyOldTellSamsung().click();
        locators.serchMyOldTell().sendKeys("Термiнал Apple iPhone 4 8GB");
        locators.modelMyOldBlack().click();
    }
    private void choiceMyNewSamsung() {
        locators.choiceMyNewTellSamsung().click();
        locators.serchMyNewTell().sendKeys("Samsung Galaxy A01 2");
        locators.modelMyNewBlack().click();
    }
    private void goToSiteAllo() {
        locators = new ExchangeProduksLokators (driver);
        openUrl("https://allo.ua/ru/");
        locators.exchangeButton().click();
    }
}