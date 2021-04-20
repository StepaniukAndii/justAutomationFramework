package AlloTest.AssertElementsOnPages;

import AlloTest.Pages.TextLocators;
import ClasesToAllUs.TestInit;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AgreementTestUaText extends TestInit {

    TextLocators locators;
    String word;
     boolean myBooleon;

    @Test
    public void agreementTestUaText(){
        locators = new TextLocators (driver);
        openUrl("https://allo.ua");
        getCheckAssert();
        resultCheckAseert();
        System.out.println (myBooleon);
        Assert.assertTrue (myBooleon);
    }
    private void resultCheckAseert() {
        String myUaWord = "Умови угоди користувача";
        if (myUaWord.equals(word)){
            myBooleon = true;
        }else {
            myBooleon =false;
        }
    }
    private void getCheckAssert() {
        locators.buttonEntrance ().click();
        locators.logIn().click();
        locators.buttonRegistration ().click();
        locators.buttonAgreement ().click();
        WebElement element = locators.assertWord();
        word = element.getText ();
    }
}