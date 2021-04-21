package RozetkaSergey.TestsRozetka;

import ClasesToAllUs.TestInit;
import RozetkaSergey.RozetkaPages.RozetkaPages5_34;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFilterNewOrUsed extends TestInit  {
    @Test
    public void  newOrOld (){
        RozetkaPages5_34 rozetkaPages5_34 = new RozetkaPages5_34(driver);
        Actions actions = new Actions(driver);
        rozetkaPages5_34.enterToRozetka("https://rozetka.com.ua/");
        rozetkaPages5_34.searchField().sendKeys("бойлер");
        enter();
        closeAdIfExist();
        actions.moveToElement(rozetkaPages5_34.buttonUsedGood()).perform();
        sleep(1);
        rozetkaPages5_34.buttonUsedGood().click();
        String textFromSeitImage = rozetkaPages5_34.listOfUsedWords().get(1).getText();
        Assert.assertEquals(textFromSeitImage,"Б/У");
    }
}
