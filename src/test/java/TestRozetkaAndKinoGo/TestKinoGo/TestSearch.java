package TestRozetkaAndKinoGo.TestKinoGo;

import ClasesToAllUs.TestInit;
import TestRozetkaAndKinoGo.BaseDate;
import TestRozetkaAndKinoGo.TestKinoGo.Pages.HomePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class TestSearch extends TestInit {

    String inputInSearch = "фильм";
    String inputInSearchSecond = "ФиЛьМ";

    @Test
    public void testSearch() {
        HomePage homePage = new HomePage(driver);
        openUrl(BaseDate.BASE_URL_KINO_GO);
        homePage.getSearchField().sendKeys(inputInSearch);
        pushBtnReturn();
        List<WebElement> listFilmsFirst = homePage.getFilmTitle();
        String str = listFilmsFirst.get(0).getText();
        for (WebElement element:listFilmsFirst) {
            if(!element.getText().toLowerCase().contains(inputInSearch)) {
                Assert.fail();
            }
        }
        homePage.getSearchField().sendKeys(inputInSearchSecond);
        pushBtnReturn();
        sleep(5);
        List<WebElement> listFilmsSecond = homePage.getFilmTitle();
        if (!listFilmsSecond.get(0).getText().contains(str)) {
            Assert.fail();
        }
    }
}