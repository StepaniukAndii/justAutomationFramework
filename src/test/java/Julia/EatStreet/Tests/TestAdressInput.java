package Julia.EatStreet.Tests;

import ClasesToAllUs.TestInit;
import Julia.EatStreet.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAdressInput extends TestInit {
    HomePage homePage = new HomePage(driver);

    public void getSelectPageRest() {
        if (homePage.getPageNumberList().size() > 0) {
            sleep(5);
            homePage.getPageNumberList().get(homePage.getPageNumberList().size() - 1).click();
        }
    }

    private void novigateEatStreet() {
        driver.get("https://eatstreet.com/");
    }

    public void getSelect70Rest() {
        if (homePage.getPageNumberList().size() > 0) {
            homePage.getPageNumberList().get(1).click();
            homePage.getAllRest().get(19).click();
        } else {
            homePage.getAllRest().get(homePage.getAllRest().size() - 1).click();
        }
    }

    @Test
    public void testEatStreet1() {
        novigateEatStreet();
        homePage.getGoItBtn().click();
        homePage.getAdressInput().sendKeys("new york");
        homePage.getFedBtn().click();
        sleep(5);
        driver.manage().window().fullscreen();
        getSelectPageRest();
        sleep(3);
        getSelect70Rest();
        Assert.assertEquals(homePage.restName(), "Real Kung Fu Little Steamed Buns Ramen - 8th Ave.");
    }
}
