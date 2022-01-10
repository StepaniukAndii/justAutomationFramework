package TestRozetkaAndDOU.DOU;

import ClasesToAllUs.TestInit;
import TestRozetkaAndDOU.BaseDate;
import TestRozetkaAndDOU.DOU.PagesDOU.CalendarPage;
import TestRozetkaAndDOU.DOU.PagesDOU.HomePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCalendarPage extends TestInit {

    @Test
    public void testContentMenu() {
        openUrl(BaseDate.BASE_URL_DOU);
        HomePage homePage = new HomePage(driver);
        CalendarPage calendarPage = new CalendarPage(driver);
        homePage.getHeaderButton().get(6).click();
        calendarPage.getEvents().isDisplayed();
        Assert.assertEquals(calendarPage.getEvents().getText(), "События");
        calendarPage.getArchive().isDisplayed();
        Assert.assertEquals(calendarPage.getArchive().getText(), "Архив");
        calendarPage.getArchive().click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://dou.ua/calendar/archive/");
        calendarPage.getArchive().click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://dou.ua/calendar/");
    }

    @Test
    public void testFormSelect() {
        openUrl(BaseDate.BASE_URL_DOU);
        HomePage homePage = new HomePage(driver);
        CalendarPage calendarPage = new CalendarPage(driver);
        homePage.getHeaderButton().get(6).click();
        calendarPage.getSelectCity().isDisplayed();
        calendarPage.getSelectAllTags().isDisplayed();
        for (int i = 1; i < calendarPage.getSelectCityChildren().size(); i++) {
            calendarPage.getSelectCity().click();
            calendarPage.getSelectCityChildren().get(i).click();
        }

        for (int i = 0; i < calendarPage.getSelectAllTagsChildren().size(); i++) {
            calendarPage.getSelectAllTags().click();
            calendarPage.getSelectAllTagsChildren().get(i).click();
        }
    }
}
