package RozetkaSergey.TestsRozetka;

import ClasesToAllUs.TestInit;
import RozetkaSergey.RozetkaPages.RozetkaPages5_34;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestCheckContact extends TestInit {
    String stringToComp = "044 537 02 22";
    RozetkaPages5_34 rozetkaPages5_34;
    boolean myBooleon;
    @Test
    public void checkContact () {
        rozetkaPages5_34 = new RozetkaPages5_34(driver);
        rozetkaPages5_34.enterToRozetka("https://rozetka.com.ua/");
        closeAdIfExist();
        rozetkaPages5_34.contactButton().click();
        closeAdIfExist();
        String tel = rozetkaPages5_34.listOfTelefonNumbers().get(0).getText();
        Assert.assertEquals(stringToComp, tel);
    }


}
