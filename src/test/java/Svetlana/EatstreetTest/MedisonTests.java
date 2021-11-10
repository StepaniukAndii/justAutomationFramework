package Svetlana.EatstreetTest;
import ClasesToAllUs.TestInit;
import Svetlana.EatstreetPage.*;
import org.testng.Assert;
import org.testng.annotations.Test;
public class MedisonTests extends TestInit {



    @Test
    public void testOpenCityMedison() {
        driver.get("https://eatstreet.com");
        HomePage homePage=new HomePage(driver);
        homePage.getAddressInput().sendKeys("Medison");
        homePage.getPressFedBtn().click();
        Assert.assertTrue(homePage.getH1().getText().contains("Medison"));
    }
    @Test
    public void listRestsFirst() {
        driver.get("https://eatstreet.com");
        HomePage homePage = new HomePage(driver);
        homePage.getAddressInput().sendKeys("Medison");
        homePage.getFedBtn().click();
        homePage.checkPopup();
        homePage.getFedBtn().click();
        driver.manage().window().fullscreen();
        AllRestsPage allRestsPage= new AllRestsPage(driver);
        allRestsPage.getAllRests().get(2).click();
        RestPage restPage= new RestPage(driver);
        sleep(3);
        Assert.assertTrue(restPage.nameOfRest().isDisplayed());
}
    @Test
    public void SignInPositivTest(){
        driver.get("https://eatstreet.com");
        HomePage homePage=new HomePage(driver);
        homePage.getSignIn().click();
        SignInPage signInPage=new SignInPage(driver);
        signInPage.EnterEmail().sendKeys("prutasveta@gmail.com");
        signInPage.EnterPassword().sendKeys("centik-1234");
        signInPage.pressGoItBtn().click();
        signInPage.pressSignInBtn().click();
        sleep(5);
        Assert.assertTrue(homePage.CheckHomePage().isDisplayed());
    }
    @Test
    public void SignUpNegTestEmailWithout(){
        driver.get("https://eatstreet.com");
        HomePage homePage=new HomePage(driver);
        homePage.getSignIn().click();
        SignInPage signInPage=new SignInPage(driver);
        signInPage.pressSignUpLink().click();
        SignUpPage signUpPage=new SignUpPage(driver);
        signUpPage.enterEmail().sendKeys("prutasvetagmail.com");
        signUpPage.enterPassword().sendKeys("A1234567");
        signUpPage.enterPasswordAgain().sendKeys("A1234567");
        signInPage.pressGoItBtn().click();
        signUpPage.pressSignUpBtn().click();
        sleep(3);
        Assert.assertTrue(signUpPage.checkValidationEmail().isDisplayed());
    }
    @Test
    public void signUpNegTestEmailContains30Char(){
        driver.get("https://eatstreet.com");
        HomePage homePage=new HomePage(driver);
        homePage.getSignIn().click();
        SignInPage signInPage=new SignInPage(driver);
        signInPage.pressSignUpLink().click();
        SignUpPage signUpPage=new SignUpPage(driver);
        signUpPage.enterEmail().sendKeys("Prutas@hjkkjkghgll2556694223698741236fgfgjfhgfsehtssssg");
        signUpPage.enterPassword().sendKeys("centik-1234");
        signUpPage.enterPasswordAgain().sendKeys("centik-1234");
        signInPage.pressGoItBtn().click();
        signUpPage.pressSignUpBtn().click();
        Assert.assertTrue(signUpPage.checkValidationEmail().isDisplayed());
    }
    @Test
    public void signUpNegTestPasswordContains7Char(){
        driver.get("https://eatstreet.com");
        HomePage homePage=new HomePage(driver);
        homePage.getSignIn().click();
        SignInPage signInPage=new SignInPage(driver);
        signInPage.pressSignUpLink().click();
        SignUpPage signUpPage=new SignUpPage(driver);
        signUpPage.enterEmail().sendKeys("Prutasveta@gmail.com");
        signUpPage.enterPassword().sendKeys("cent-12");
        signUpPage.enterPasswordAgain().sendKeys("cent-12");
        signInPage.pressGoItBtn().click();
        signUpPage.pressSignUpBtn().click();
        Assert.assertTrue(signUpPage.checkValidationPassword().isDisplayed());
    }

    @Test
    public void signUpNegTestPasswordIsEmpty(){
        driver.get("https://eatstreet.com");
        HomePage homePage=new HomePage(driver);
        homePage.getSignIn().click();
        SignInPage signInPage=new SignInPage(driver);
        signInPage.pressSignUpLink().click();
        SignUpPage signUpPage=new SignUpPage(driver);
        signUpPage.enterEmail().sendKeys("Prutasveta@gmail.com");
        signUpPage.enterPassword().sendKeys("");
        signUpPage.enterPasswordAgain().sendKeys("");
        signInPage.pressGoItBtn().click();
        signUpPage.pressSignUpBtn().click();
        Assert.assertTrue(signUpPage.checkValidationPassword().isDisplayed());
    }



}

