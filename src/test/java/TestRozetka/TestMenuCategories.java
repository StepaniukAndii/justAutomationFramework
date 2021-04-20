package TestRozetka;

import ClasesToAllUs.TestInit;
import TestRozetka.Pages.HomePage;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestMenuCategories extends TestInit {

    @Test
    public void testMenuCategories() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://rozetka.com.ua");
        homePage.getProductCatalog().click();
        for (WebElement element : homePage.getMenuCategories()) {
            moveMouseToElement(element);
        }
    }
}