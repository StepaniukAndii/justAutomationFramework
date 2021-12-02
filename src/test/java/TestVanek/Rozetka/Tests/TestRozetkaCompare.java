package TestVanek.Rozetka.Tests;

import ClasesToAllUs.TestInit;
import TestVanek.Rozetka.Pages.ComparePage;
import TestVanek.Rozetka.Pages.GoodsPage;
import TestVanek.Rozetka.Pages.StartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRozetkaCompare extends TestInit {
    StartPage startPage;
    GoodsPage goodsPage;
    ComparePage comparePage;
    @Test
    public void testRozetkaCompare(){
        startPage = new StartPage(driver);
        goodsPage = new GoodsPage(driver);
        comparePage = new ComparePage(driver);
        int comparesGoods = 2;

        openUrl("https://rozetka.com.ua/");
        startPage.searchInput().sendKeys("Whisky");
        startPage.searchBtn().click();
        String firstProduct = goodsPage.goodsTitles().get(0).getText();
        String secondProduct = goodsPage.goodsTitles().get(1).getText();
        goodsPage.ageAssertBtn().click();
        for(int i = 0; i < comparesGoods; i++){
            goodsPage.compareButtons().get(i).click();
        }
        startPage.comparePageBtn().click();
        comparePage.compareLink().click();
        Assert.assertEquals(firstProduct, comparePage.goodsTitles().get(1).getText());
        Assert.assertEquals(secondProduct, comparePage.goodsTitles().get(0).getText());
    }
}
