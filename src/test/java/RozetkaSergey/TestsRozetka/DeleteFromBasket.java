package RozetkaSergey.TestsRozetka;

import ClasesToAllUs.TestInit;
import RozetkaSergey.RozetkaPages.RozetkaPages1_4;
import RozetkaSergey.RozetkaPages.RozetkaPages8_12;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteFromBasket extends TestInit {
        @Test
        public void deleteFromBasket(){
            RozetkaPages8_12 rozetkaPages8_12 = new RozetkaPages8_12(driver);
            rozetkaPages8_12.enterToRozetka("https://rozetka.com.ua/");
            rozetkaPages8_12.pickMainMenu().click();
            rozetkaPages8_12.goToMainMenu().get(0).click();
            rozetkaPages8_12.chooseComp().get(0).click();
            rozetkaPages8_12.addToCard().get(0).click();
            sleep(1);
            rozetkaPages8_12.goToBasket().click();
            sleep(1);
            rozetkaPages8_12.clickButtonDelete().click();
            sleep(1);
            rozetkaPages8_12.affirmDelete().click();
            String allDeleted = rozetkaPages8_12.returnWords().getText();
            Assert.assertEquals(allDeleted,"Корзина пуста");
           sleep(1);
        }
    }

