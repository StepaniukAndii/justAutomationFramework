package testEatStreetDenis.tests.footer.support;

import ClasesToAllUs.TestInit;
import org.testng.annotations.Test;
import testEatStreetDenis.pages.footer.SupportPage;

public class ForCustomersTest extends TestInit {

    SupportPage supportPage;

    @Test
    public void forCustomers() {
        supportPage = new SupportPage(driver);
        openUrl("https://eatst.force.com/customers/s/");
        supportPage.forCustomersFindAnswers().click();
        for (int i = 0; i < supportPage.forCustomersQuestions().size(); i++) {
            supportPage.forCustomersQuestions().get(i).click();
            sleep(1); //for proper page load
            supportPage.forCustomersFindAnswers().click();
        }
        supportPage.forCustomersLogo().click();
        supportPage.forCustomersContactUs().click();
        driver.navigate().back();
        for (int i = 0; i < supportPage.forCustomersTopics().size(); i++) {
            supportPage.forCustomersTopics().get(i).click();
            sleep(1);
            driver.navigate().back();
        }
        supportPage.forCustomersGetFed().click();
    }
}
