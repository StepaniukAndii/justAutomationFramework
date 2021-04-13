package RozetkaSergey.TestsVijar;

import ClasesToAllUs.TestInit;
import RozetkaSergey.HomePageVijar;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class CheckSchedule extends TestInit {
    @Test
    public void checkSchedule () {
        HomePageVijar homePageVijar = new HomePageVijar(driver);
        homePageVijar.enterToVijar("https://viyar.ua/");
        homePageVijar.closeAdverb().click();
        homePageVijar.clickOnStatusOfOrder().click();
        homePageVijar.closeAdverb().click();
        List<String> listFromSchedule = getElementsText(homePageVijar.getDigit());
        String firsDigitFromTable = listFromSchedule.get(0);
        String dateFromSchedule = firsDigitFromTable.split("\n")[0];
        SimpleDateFormat formater = new SimpleDateFormat("(dd.MM)");
        System.out.println(dateFromSchedule);
        System.out.println(formater);
    }
}
