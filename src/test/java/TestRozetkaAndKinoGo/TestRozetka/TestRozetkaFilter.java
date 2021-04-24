package TestRozetkaAndKinoGo.TestRozetka;

import ClasesToAllUs.TestInit;
import TestRozetkaAndKinoGo.Pages.HomePage;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.LinkedList;
import java.util.List;

public class TestRozetkaFilter extends TestInit {

    @Test
    public void testRozetkaFilter() {
        HomePage homePageRozetka = new HomePage(driver);
        openUrl("https://rozetka.com.ua");
        homePageRozetka.searchField().click();
        homePageRozetka.searchField().sendKeys("холодильник\n");
        homePageRozetka.catalogSettingzSorting().click();
        homePageRozetka.catalogSettingzSortingChildren().stream().skip(1).findFirst().get().click();
        List<String> list = new LinkedList<>();
        sleep(4);
        for (WebElement element : homePageRozetka.allGoodsCost()) {
            list.add(element.getText());
        }
        System.out.println(list);
    }
}
