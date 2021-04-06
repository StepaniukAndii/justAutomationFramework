package TestRozetka;

import ClasesToAllUs.TestInit;
import TestRozetka.Pages.HomePageRozetka;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.LinkedList;
import java.util.List;

public class TestRozetkaFilter extends TestInit {

    @Test
    public void testRozetkaFilter() {
        HomePageRozetka homePageRozetka = new HomePageRozetka(driver);
        openUrl("https://rozetka.com.ua");
        homePageRozetka.searchFild().click();
        homePageRozetka.searchFild().sendKeys("холодильник\n");
        homePageRozetka.catalogSettingzSorting().click();
        homePageRozetka.catalogSettingzSortingChildren().stream().skip(1).findFirst().get().click();
        List<Integer> list = new LinkedList<>();
        sleep(4);
        for (WebElement element : homePageRozetka.allGoolsCost()) {
            String str = element.getText();
            while (str.contains(" ")) {
                str = str.replace(" ", "");
            }
            int i = Integer.parseInt(str);
            list.add(i);
        }
        if (list.get(1)>list.get(49)) {
            Assert.fail();
        }
    }
}
