package RozetkaSergey.TestsRozetka;

import ClasesToAllUs.TestInit;
import RozetkaSergey.RozetkaPages.RozetkaPages5_34;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddGoodsInBasket extends TestInit {
    @Test
    public void deleteFromBasket() {
        RozetkaPages5_34 rozetkaPages5_34 = new RozetkaPages5_34(driver);
        rozetkaPages5_34.enterToRozetka("https://rozetka.com.ua/");
        rozetkaPages5_34.clickCatalog().click();
        sleep(1);
        driver.findElement(By.xpath("//div[@class='menu__hidden-column']//a[@class='menu__hidden-title' and contains(text(),'Ноутбуки')]")).click();
        sleep(3);
        rozetkaPages5_34.addToCard().get(0).click();
        sleep(1);
        rozetkaPages5_34.goToBasket().click();
        String prise = rozetkaPages5_34.takePrice().getText();
        String justPriceString = prise.split(" ")[0];
        int justPriceInt = Integer.parseInt(justPriceString);
        rozetkaPages5_34.addMore().get(1).click();
        sleep(1);
        rozetkaPages5_34.addMore().get(1).click();
        sleep(1);
        String sume = rozetkaPages5_34.takeSume().getText();
        String justSumeString = sume.split(" ")[0];
        int justSumeInt = Integer.parseInt(justSumeString);
        Assert.assertEquals(justPriceInt,justSumeInt/3);
        System.out.println(justPriceInt);
        System.out.println(justSumeInt);
        sleep(1);
    }
}
