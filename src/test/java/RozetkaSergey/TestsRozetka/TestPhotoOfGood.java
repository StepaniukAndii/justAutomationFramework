package RozetkaSergey.TestsRozetka;

import ClasesToAllUs.TestInit;
import RozetkaSergey.RozetkaPages.RozetkaPages5_34;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestPhotoOfGood extends TestInit {
    RozetkaPages5_34 rozetkaPages5_34;
    private boolean photo;

    @Test
    public void photoOfGood() {
        rozetkaPages5_34 = new RozetkaPages5_34(driver);
        rozetkaPages5_34.enterToRozetka("https://rozetka.com.ua/");
        closeAdIfExist();
        rozetkaPages5_34.buttonBytovajaTexnika().click();
        rozetkaPages5_34.buttonBoilrs().click();
        closeAdIfExist();
        rozetkaPages5_34.listOfBoilers().get(0).click();
        rozetkaPages5_34.buttonPhotoOfBoiler().click();
        photo = rozetkaPages5_34.isExistPhotoOfGood().isDisplayed();
        Assert.assertEquals(photo, true);
        sleep(1);
    }
}
