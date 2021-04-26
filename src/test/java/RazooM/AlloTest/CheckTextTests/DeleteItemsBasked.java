package RazooM.AlloTest.CheckTextTests;

import RazooM.AlloTest.Pages.PageHomeAllo;
import ClasesToAllUs.TestInit;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.List;

public class DeleteItemsBasked extends TestInit {

    PageHomeAllo pageHomeAllo;

    @Test
    public void testAddItemsInBasket(){
        pageHomeAllo = new PageHomeAllo (driver);
        openUrl("https://allo.ua/ru/");

        addTwoItem();
        addSryItem();
        checkBasked();
    }
    private void checkBasked() {
        pageHomeAllo.basked().click();
        int numBer = pageHomeAllo.itemListInBasked().size();
        for(int i =0;i<numBer;i++){
        List<WebElement> tempButton = pageHomeAllo.closeButtonListInBasked();
            WebElement url = tempButton.get(i);
            url.click ();
        }
    }
    private void addSryItem() {
        pageHomeAllo.serchFild().sendKeys("Телевизор");
        pageHomeAllo.buttonSerch().click();
        moveMouseToElement (pageHomeAllo.mousToTwoItem ());
        pageHomeAllo.oneItem().click();
        pageHomeAllo.buttonBay().click();
        pageHomeAllo.bayWindowClose().click();
        pageHomeAllo.aLotOfItems().click();
    }
    private void addTwoItem() {
        pageHomeAllo.serchFild().sendKeys("Наушники");
        pageHomeAllo.buttonSerch().click();
        moveMouseToElement (pageHomeAllo.oneItem ());
        pageHomeAllo.oneItem().click();
        pageHomeAllo.buttonBay().click();
        pageHomeAllo.bayWindowClose().click();
        pageHomeAllo.aLotOfItems().click();
    }
    private void addOneItem() {
        pageHomeAllo.serchFild().sendKeys("Холодильник");
        pageHomeAllo.buttonSerch().click();
        moveMouseToElement (pageHomeAllo.oneItem ());
        pageHomeAllo.oneItem().click();
        pageHomeAllo.buttonBay().click();
        pageHomeAllo.bayWindowClose().click();
        pageHomeAllo.aLotOfItems().click();
    }
}