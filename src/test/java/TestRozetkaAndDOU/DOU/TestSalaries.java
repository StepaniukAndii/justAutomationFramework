package TestRozetkaAndDOU.DOU;

import ClasesToAllUs.TestInit;
import TestRozetkaAndDOU.BaseDate;
import TestRozetkaAndDOU.DOU.PagesDOU.HomePage;
import TestRozetkaAndDOU.DOU.PagesDOU.SalariesPage;
import org.testng.annotations.Test;

public class TestSalaries extends TestInit {

    @Test
    public void testSalaries() {
        HomePage homePage = new HomePage(driver);
        SalariesPage salariesPage = new SalariesPage(driver);
        openUrl(BaseDate.BASE_URL_DOU);
        homePage.getHeaderButton().get(4).click();
        for (int i = 0; i < salariesPage.getSelectCityChildren().size(); i++) {
            salariesPage.getSelectCity().click();
            salariesPage.getSelectCityChildren().get(i).click();
        }
        for (int i = 0; i < salariesPage.getSelectLanguageChildren().size(); i++) {
            salariesPage.getLanguage().click();
            salariesPage.getSelectLanguageChildren().get(i).click();
        }
        for (int i = 0; i < salariesPage.getSelectPositionChildren().size()-1; i++) {
            salariesPage.getSelectPosition().click();
            salariesPage.getSelectPositionChildren().get(i).click();
        }
    }
}