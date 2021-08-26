package TestAnton.Prom.HomePage;

import ClasesToAllUs.TestInit;
import TestAnton.Prom.PromPage;
import org.testng.annotations.Test;

public class TestSpecialForYou extends TestInit {

    @Test
    public void testSpecialForYou(){
        PromPage homePage = new PromPage(driver);
        driver.get("https://prom.ua/ua/");
        homePage.getSpecialForYouBtn().click();
        homePage.getTextIntoSpecialForYouPage().getText().contains("Ми зібрали для вас все, що може вам сподобатися");
    }
}
