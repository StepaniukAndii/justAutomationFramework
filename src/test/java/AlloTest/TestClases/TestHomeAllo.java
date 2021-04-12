package AlloTest.TestClases;

import AlloTest.Pages.PageHomeAllo;
import ClasesToAllUs.TestInit;
import org.testng.annotations.Test;

public class TestHomeAllo extends TestInit {

    PageHomeAllo pageHomeAllo;

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