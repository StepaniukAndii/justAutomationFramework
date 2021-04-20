package TestRozetka;

import ClasesToAllUs.TestInit;
import TestRozetka.Pages.HomePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCompare extends TestInit {

    @Test
    public void testCompare() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://rozetka.com.ua");
        homePage.searchField().sendKeys("ноутбук\n");
        StringBuilder textGoods = new StringBuilder();

        for (int i = 0; i < 5; i++) {
            textGoods.append(homePage.getGoodsTileHeading().get(i).getText());
        }

        int i = 1;

        for (WebElement element : homePage.getCompareButtons()) {
            element.click();
            if (i == 5) {
                break;
            }
            i++;
        }

        homePage.getHeaderButton().get(2).click();
        homePage.getComparisonModalLink().click();

        for (int j = 0; j < 5; j++) {
            if (!textGoods.toString().contains(homePage.getProductHeading().get(j).getText())) {
                Assert.fail();
            }
        }
    }
}