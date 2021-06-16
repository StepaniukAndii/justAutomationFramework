package TestAsosByLynn;

import ClasesToAllUs.TestInit;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAddItemToCart extends TestInit {
    @Test
    public void AddItemsToCart() {
        AsosPages homePage = new AsosPages(driver);
        driver.get("https://www.asos.com/");
        homePage.searchField().sendKeys("dress\n");
        homePage.itemsSocks().get(1).click();
        String nameOfTheChosenProduct = homePage.nameOfTheChosenProduct().getText();
        Select sizeSelect = new Select(homePage.sizeSelect());
        sizeSelect.selectByIndex(1);
        homePage.addToBagBtn().click();
        homePage.cartBtn().click();
        homePage.bagLink().click();
        String nameOfTheChosenProductInCart = homePage.nameOfTheChosenProductInCart().getText();
        Assert.assertEquals(nameOfTheChosenProduct, nameOfTheChosenProductInCart);
    }
}
