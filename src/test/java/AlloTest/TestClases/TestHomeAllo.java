package AlloTest.TestClases;

import AlloTest.Pages.PageHomeAllo;
import AlloTest.HelpClases.PersonSingIn;
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
        PersonSingIn person = new PersonSingIn ();
        person.setName("Sergey");
        person.setTell ("0682223344");
        person.setEmail ("sergey1234@gmail.com");
        person.setPassword ("qwerty");
        pageHomeAllo.enterName().sendKeys (person.getName());
        pageHomeAllo.enterNumber().sendKeys(person.getTell());
        pageHomeAllo.enterEmail().sendKeys(person.getEmail());
        pageHomeAllo.enterPassword().sendKeys(person.getPassword());
        pageHomeAllo.showPass().click();
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

           int x = pageHomeAllo.itemListInBasked().size();
           if (x==2){
               System.out.println ("В корзине сейчас " + x );
           } else {
               System.out.println ("В корзине сейчас не два элемента а " + x );
           }
    }
}