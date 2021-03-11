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
        sleep (2);
        pageHomeAllo.loginTab().click();
        pageHomeAllo.enterName().sendKeys("Sergey");
        pageHomeAllo.enterNumber().sendKeys("123456789");
        pageHomeAllo.enterEmail().sendKeys("sergey1234567@gmail.com");
        pageHomeAllo.enterPassword().sendKeys("qwerty12345");
        sleep (2);
        pageHomeAllo.loginTab().click();
        pageHomeAllo.showPass ().click ();
        pageHomeAllo.testComplite();
    }

    @Test
    public void checkCategories(){
        pageHomeAllo = new PageHomeAllo(driver);
        openUrl("https://allo.ua/ru/");
        pageHomeAllo.logo().click();
        sleep(1);
        pageHomeAllo.categoriesClick().click();
        pageHomeAllo.telefonItems().click();
        sleep(1);
        pageHomeAllo.categoriesClick().click();
        pageHomeAllo.toolsItem().click();
        sleep(1);
        pageHomeAllo.categoriesClick().click();
        pageHomeAllo.appLiancesItems().click();
        sleep(1);
        pageHomeAllo.categoriesClick().click();
        pageHomeAllo.carsItems().click();
        sleep(1);
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
        sleep (2);
        pageHomeAllo.oneItem().click();
        pageHomeAllo.buttonBay().click();
        pageHomeAllo.buttonComeback().click();
        pageHomeAllo.serchFild().sendKeys("Наушники");
        pageHomeAllo.buttonSerch().click();
        sleep (2);
        pageHomeAllo.oneItem().click();
        pageHomeAllo.buttonBay().click();
        pageHomeAllo.buttonComeback().click();
    }
}
