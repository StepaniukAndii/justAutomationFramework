package AlloTest.CheckTextTests;

import AlloTest.Pages.PageHomeAllo;
import ClasesToAllUs.TestInit;
import org.testng.annotations.Test;

public class CheckCategories extends TestInit {

    @Test
    public void  checkCategories(){
        PageHomeAllo pageHomeAllo = new PageHomeAllo (driver);
        openUrl("https://allo.ua/ru/");
        pageHomeAllo.logo().click();
        pageHomeAllo.categoriesClick().click();
        pageHomeAllo.telefonItems().click();
        pageHomeAllo.categoriesClick().click();
        pageHomeAllo.toolsItem().click();
        pageHomeAllo.categoriesClick().click();
        pageHomeAllo.appLiancesItems().click();
        pageHomeAllo.categoriesClick().click();
        pageHomeAllo.carsItems().click();
        pageHomeAllo.categoriesClick().click();
        pageHomeAllo.sportItems().click();
    }
}