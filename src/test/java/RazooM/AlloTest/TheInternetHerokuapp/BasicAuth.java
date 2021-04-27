package RazooM.AlloTest.TheInternetHerokuapp;

import ClasesToAllUs.TestInit;
import RazooM.AlloTest.TheInternetHerokuapp.Locators.Locators;
import org.testng.annotations.Test;

public class BasicAuth extends TestInit {

    Locators locators;

    @Test
    public void basicAuth(){
        locators = new Locators (driver);
        driver.get ("http://the-internet.herokuapp.com/");
        locators.basicAuth().click();
        driver.navigate().to("http://admin:admin@the-internet.herokuapp.com/basic_auth");
    }
}