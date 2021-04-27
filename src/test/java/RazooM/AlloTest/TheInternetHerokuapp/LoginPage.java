package RazooM.AlloTest.TheInternetHerokuapp;

import ClasesToAllUs.TestInit;
import RazooM.AlloTest.TheInternetHerokuapp.Locators.Locators;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPage extends TestInit {

    Locators locators;
    GettersAndSetors setAndGet;
    boolean logout;

    @Test
    public void loginPage(){
        locators = new Locators (driver);
        setAndGet = new GettersAndSetors ();
        driver.get("http://the-internet.herokuapp.com/");
        locators.formAuthentication().click();
        getPasswordAndName();
        inputNameAndPass();
        checkAuthorizatioт();
        Assert.assertTrue(true ,"AAA");
    }
    private void checkAuthorizatioт() {
        locators.formAuthenticationButton().click();
        String getWord = locators.formAuthenticationCheck().getText();
        String checkWord ="You logged into a secure area!";
        if(getWord.contains (checkWord)){
            logout =true;
            locators.formAuthenticationLogout().click();
        }
    }
    private void getPasswordAndName() {
        setAndGet.setName ("tomsmith");
        setAndGet.setPassword("SuperSecretPassword!");
    }
    private void inputNameAndPass() {
        locators.formAuthenticationUseName().sendKeys(setAndGet.getName());
        locators.formAuthenticationUsePassword().sendKeys(setAndGet.getPassword());
    }
}