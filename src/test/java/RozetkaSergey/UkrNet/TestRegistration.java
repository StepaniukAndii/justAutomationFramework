package RozetkaSergey.UkrNet;

import ClasesToAllUs.TestInit;
import RozetkaSergey.UkrNetPages.UkrNetPages;
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
