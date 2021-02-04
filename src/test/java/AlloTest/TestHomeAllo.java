package AlloTest;

import org.testng.annotations.Test;

public class TestHomeAllo extends TestInitAllo {

    PageHomeAllo pageHomeAllo;

    @Test
    public void checkAuthenticationButtonRegister(){
        pageHomeAllo = new PageHomeAllo(driver);
        pageHomeAllo.singIn().click();
        pageHomeAllo.loginTab().click();
        pageHomeAllo.enterName().sendKeys("Sergey");
        pageHomeAllo.enterNumber().sendKeys("123456789");
        pageHomeAllo.enterEmail().sendKeys("sergey1234567@gmail");
        pageHomeAllo.enterPassword().sendKeys("qwerty");
        pageHomeAllo.testComplite();
    }

    @Test
    public void checkCategories(){
        pageHomeAllo = new PageHomeAllo(driver);
        pageHomeAllo.logo().click();
        sleep(1);
        pageHomeAllo.categoriesClick().click();
        pageHomeAllo.telefonItems().click ();
        sleep(1);
        pageHomeAllo.categoriesClick().click();
        pageHomeAllo.telefonItems ().click ();
        sleep(1);
        pageHomeAllo.categoriesClick().click();
        pageHomeAllo.appLiancesItems().click();
        sleep(1);
        pageHomeAllo.categoriesClick().click();
        pageHomeAllo.carsItems().click();
        sleep(1);
        pageHomeAllo.categoriesClick().click();
        pageHomeAllo.sportItems().click();
        pageHomeAllo.testComplite();
    }

    @Test
    public void testSerch(){

    }
}
