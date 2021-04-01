package AlloTest;

import ClasesToAllUs.TestInit;
import org.testng.annotations.Test;

public class TestHomeAllo extends TestInit {

    PageHomeAllo pageHomeAllo;

    @Test
    public void checkAuthenticationRegister(){
        pageHomeAllo = new PageHomeAllo(driver);
        openUrl("https://allo.ua/ru/");
        pageHomeAllo.singIn().click();
        pageHomeAllo.loginTab().click();
        pageHomeAllo.enterName().sendKeys("Sergey");
        pageHomeAllo.enterNumber().sendKeys("0682223344");
        pageHomeAllo.enterEmail().sendKeys("sergey1234567@gmail.com");
        pageHomeAllo.enterPassword().sendKeys("qwerty12345");
        pageHomeAllo.showPass ().click ();
        pageHomeAllo.testComplite();
    }

    @Test
    public void checkCategories(){
        pageHomeAllo = new PageHomeAllo(driver);
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
        pageHomeAllo.testComplite();
    }

    @Test
    public void testAddItemsInBasket(){
        pageHomeAllo = new PageHomeAllo (driver);
        openUrl("https://allo.ua/ru/");
        pageHomeAllo.serchFild().sendKeys("Холодильник");
        pageHomeAllo.buttonSerch().click();
        pageHomeAllo.oneItem().click();
        pageHomeAllo.buttonBay().click();
        pageHomeAllo.bayWindowClose().click();
        pageHomeAllo.aLotOfItems().click();
        pageHomeAllo.serchFild().sendKeys("Наушники");
        pageHomeAllo.buttonSerch().click();
        pageHomeAllo.oneItem().click();
        pageHomeAllo.buttonBay().click();
        pageHomeAllo.bayWindowClose().click();
        pageHomeAllo.aLotOfItems().click();
        pageHomeAllo.basked().click();

       int x = pageHomeAllo.itemListInBasked().size ();
       if (x==2){
           System.out.println ("В корзине сейчас " + x );
       } else {
           System.out.println ("В корзине сейчас не два элемента а " + x );
       }
    }
}
