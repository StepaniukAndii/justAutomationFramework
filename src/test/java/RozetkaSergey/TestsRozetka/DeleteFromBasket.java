package RozetkaSergey.TestsRozetka;

import ClasesToAllUs.TestInit;
import RozetkaSergey.RozetkaPages.RozetkaPages5_34;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteFromBasket extends TestInit {
        @Test
        public void deleteFromBasket(){
            RozetkaPages5_34 rozetkaPages5_34 = new RozetkaPages5_34(driver);
            rozetkaPages5_34.enterToRozetka("https://rozetka.com.ua/");
            rozetkaPages5_34.clickCatalog().click();
            rozetkaPages5_34.goToMainMenu().get(0).click();
            rozetkaPages5_34.chooseComp().get(0).click();
            rozetkaPages5_34.addToCard().get(0).click();
            sleep(1);
            rozetkaPages5_34.goToBasket().click();
            sleep(1);
            rozetkaPages5_34.clickButtonDelete().click();
            sleep(1);
            rozetkaPages5_34.affirmDelete().click();
            String allDeleted = rozetkaPages5_34.returnWords().getText();
            Assert.assertEquals(allDeleted,"Корзина пуста");
        }
    }

