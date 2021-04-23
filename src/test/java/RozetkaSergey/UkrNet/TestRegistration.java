package RozetkaSergey.UkrNet;

import ClasesToAllUs.TestInit;
import RozetkaSergey.UkrNetPages.UkrNetPages;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;

public class TestRegistration extends TestInit {
    String mail = "suspiciosfox";
    String pass = "23112010Ukrnet";
    String name = "Вася";
    String  secondName = "Пупкин";
    String date = "23";
    String yearOfBirth = "1980";

    @Test
    public void testEnterToAccount(){
        UkrNetPages ukrNetPages = new UkrNetPages(driver);
        ukrNetPages.enterToUkrNet("https://www.ukr.net/ua");
        driver.switchTo().frame(getElement("//iframe[@name='mail widget']"));
        ukrNetPages.makeNewAccount().click();
        List<String> windows = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(1));
        ukrNetPages.newNameForAccountField().sendKeys(mail);
        ukrNetPages.newPassField().sendKeys(pass);
        ukrNetPages.repeatPassField().sendKeys(pass);
        ukrNetPages.firstNameField().sendKeys(name);
        ukrNetPages.secondNameField().sendKeys(secondName);
        ukrNetPages.dateOfMonth().sendKeys(date);
        ukrNetPages.year().sendKeys(yearOfBirth);
        ukrNetPages.sexRadioButton().get(0).click();
    }
}
