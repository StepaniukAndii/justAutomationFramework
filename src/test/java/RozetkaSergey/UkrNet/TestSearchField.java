package RozetkaSergey.UkrNet;

import ClasesToAllUs.TestInit;
import RozetkaSergey.UkrNetPages.UkrNetPages;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TestSearchField extends TestInit {
    String word = "Політика";

    @Test
    public void searchField() {
        UkrNetPages ukrNetPages = new UkrNetPages(driver);
        ukrNetPages.enterToUkrNet("https://www.ukr.net/ua");
        ukrNetPages.searchFieldWindow().sendKeys("Політика");
        enter();
        List<String> windows = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(1));
        String add = ukrNetPages.listOfRequest().get(0).getText().split(" ")[0];
        Assert.assertEquals(word, add);
    }
}
