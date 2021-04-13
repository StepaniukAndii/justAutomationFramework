package RozetkaSergey.TestsVijar;

import ClasesToAllUs.TestInit;
import RozetkaSergey.VijarPages.VijarPages1_4;
import org.testng.annotations.Test;

@Test
public class TestVijarLoginTest extends TestInit {
    public void loginTest() {
        VijarPages1_4 vijarPages1_4 = new VijarPages1_4(driver);
        vijarPages1_4.enterToGoogle("https://www.google.com");
        vijarPages1_4.googleField().sendKeys("Вияр");
        enter();
        vijarPages1_4.goToVijar().click();
        vijarPages1_4.closeAdverb().click();
        vijarPages1_4.goToEnter().click();
        vijarPages1_4.getLogin().sendKeys(vijarPages1_4.getterLogin());
        vijarPages1_4.getPass().sendKeys(vijarPages1_4.getterPass());
        vijarPages1_4.clickEnter().click();
        vijarPages1_4.closeAdverb().click();
        System.out.println("Sehr gut!");

    }
}