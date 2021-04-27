package TestRozetkaAndDOU.DOU;

import ClasesToAllUs.TestInit;
import TestRozetkaAndDOU.BaseDate;
import TestRozetkaAndDOU.DOU.PagesDOU.CalendarPage;
import TestRozetkaAndDOU.DOU.PagesDOU.HomePage;
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
        Assert.assertEquals(calendarPage.getEvents().getText(),"События");
        calendarPage.getArchive().isDisplayed();
        Assert.assertEquals(calendarPage.getArchive().getText(),"Архив");
        calendarPage.getArchive().click();
        Assert.assertEquals(driver.getCurrentUrl(),"https://dou.ua/calendar/archive/");
        calendarPage.getArchive().click();
        Assert.assertEquals(driver.getCurrentUrl(),"https://dou.ua/calendar/");
    }
}
