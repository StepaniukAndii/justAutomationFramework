package YevtushenkoVova.Tests;

import ClasesToAllUs.TestInit;
import YevtushenkoVova.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

    public class Footer extends TestInit {

        @Test
        public void elementsFooterEatStreet(){
            HomePage homePage = new HomePage(driver);
            homePage.openQa2HomePage();
            homePage.buttonGotIt().click();

                Assert.assertTrue(homePage.careers().isDisplayed());
                Assert.assertTrue(homePage.blog().isDisplayed());
                Assert.assertTrue(homePage.aboutUs().isDisplayed());
                Assert.assertTrue(homePage.contactUs().isDisplayed());
            }

            @Test
            public void forCustomers(){
                HomePage homePage = new HomePage(driver);
                homePage.openQa2HomePage();
                homePage.buttonGotIt().click();
                homePage.lincForCustomer().click();
                homePage.btnAboutUs().click();
                ArrayList<String> tabs2 = new ArrayList<>(driver.getWindowHandles());
                driver.switchTo().window(tabs2.get(1));

                Assert.assertTrue(homePage.assertAbout().isDisplayed());
            }

            @Test
            public void accessibility(){
                HomePage homePage = new HomePage(driver);
                homePage.openQa2HomePage();
                homePage.buttonGotIt().click();
                homePage.accessibility().click();

                Assert.assertTrue(homePage.assertAccessibility().isDisplayed());
            }

            @Test
            public void errorSingUp() {
                HomePage homePage = new HomePage(driver);
                homePage.openQa2HomePage();
                homePage.buttonGotIt().click();
                homePage.enterSignUpEmail().sendKeys("32r23dd");
                homePage.btnSignUp().click();
                sleep(1);

                Assert.assertTrue(homePage.errorWindow().isDisplayed());
            }
        }

