package TestAmazon.AllTest;


import ClasesToAllUs.TestInit;
import TestAmazon.Pages.HomePage.HomePageAmazon;
import org.testng.Assert;
import org.testng.annotations.Test;
public class TestAmazonCart extends TestInit {

    /**
     * @This my new test
     */

    @Test
    public void testCart(){
        HomePageAmazon homePageAmazon = new HomePageAmazon(driver);
        openUrl("https://www.amazon.com/");
        homePageAmazon.tapToSearchField().sendKeys("caps");
        pushBtnReturn();
        homePageAmazon.chooseItem().get(0).click();
        homePageAmazon.chooseSize().click();
        homePageAmazon.chooseSizeLargeX().click();
        moveMouseToElement(homePageAmazon.addItemToCard()); //In this method we move mouse
        sleep(3);
        homePageAmazon.addItemToCard().click();
        sleep(3);
        homePageAmazon.openCard();
        sleep(3);
        Assert.assertTrue(homePageAmazon.getElement(homePageAmazon.bigLocator).isDisplayed());
        System.out.println("If you see this text, it means that the test - Well Done!");
    }
}
