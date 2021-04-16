package RozetkaSergey.TestsRozetka;

import ClasesToAllUs.TestInit;
import RozetkaSergey.RozetkaPages.RozetkaPages8_12;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddGoodsInBasket extends TestInit {
    @Test
    public void deleteFromBasket() {
        RozetkaPages8_12 rozetkaPages8_12 = new RozetkaPages8_12(driver);
        rozetkaPages8_12.enterToRozetka("https://rozetka.com.ua/");
        rozetkaPages8_12.clickCatalog().click();
        sleep(1);
        driver.findElement(By.xpath("//div[@class='menu__hidden-column']//a[@class='menu__hidden-title' and contains(text(),'Ноутбуки')]")).click();
        sleep(3);
        rozetkaPages8_12.addToCard().get(0).click();
        sleep(1);
        rozetkaPages8_12.goToBasket().click();
        String prise = rozetkaPages8_12.takePrice().getText();
        String justPriceString = prise.split(" ")[0];
        int justPriceInt = Integer.parseInt(justPriceString);
        rozetkaPages8_12.addMore().get(1).click();
        sleep(1);
        rozetkaPages8_12.addMore().get(1).click();
        sleep(1);
        String sume =rozetkaPages8_12.takeSume().getText();
        String justSumeString = sume.split(" ")[0];
        int justSumeInt = Integer.parseInt(justSumeString);
        Assert.assertEquals(justPriceInt,justSumeInt/3);
        System.out.println(justPriceInt);
        System.out.println(justSumeInt);
        sleep(1);
    }
}
