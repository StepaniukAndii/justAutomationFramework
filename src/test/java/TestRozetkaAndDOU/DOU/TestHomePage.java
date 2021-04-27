package TestRozetkaAndDOU.DOU;

import ClasesToAllUs.TestInit;
import TestRozetkaAndDOU.BaseDate;
import TestRozetkaAndDOU.DOU.PagesDOU.HomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestHomePage extends TestInit {

    String inputInSearch = "QA";
    String inputInSearchSecond = "qA";

    @Test
    public void testSearch() {
        HomePage homePage = new HomePage(driver);
        openUrl(BaseDate.BASE_URL_DOU);
        homePage.getSearchField().sendKeys(inputInSearch);
        pushBtnReturn();
        List<WebElement> listFilmsFirst = homePage.getLinkTitle();
        String str = listFilmsFirst.get(0).getText();
        for (int i = 0; i < listFilmsFirst.size() - 3; i += 2) {
            if (!listFilmsFirst.get(i).getText().contains(inputInSearch)) {
                Assert.fail(listFilmsFirst.get(i).getText());
            }
        }
        homePage.getSearchBox().clear();
        homePage.getSearchBox().sendKeys(inputInSearchSecond);
        pushBtnReturn();
        sleep(5);
        List<WebElement> listFilmsSecond = homePage.getLinkTitle();
        if (!listFilmsSecond.get(0).getText().contains(str)) {
            Assert.fail();
        }
    }

    @Test
    public void testIndexLinks() {
        openUrl(BaseDate.BASE_URL_DOU);
        HomePage homePage = new HomePage(driver);
        for (int i = 0; i < 7; i++) {
            homePage.getIndexLinks().get(i).isDisplayed();
        }
        for (int i = 0; i < 7; i++) {
            homePage.getIndexLinks().get(i).click();
            driver.navigate().back();
        }
    }
}