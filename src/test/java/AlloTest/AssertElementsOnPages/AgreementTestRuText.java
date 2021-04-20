package AlloTest.AssertElementsOnPages;

import AlloTest.Pages.TextLocators;
import ClasesToAllUs.TestInit;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AgreementTestRuText extends TestInit {

    TextLocators locators;
    String word;
    boolean myBooleon;

    @Test
    public void  agreementTestRuText(){
        locators = new TextLocators (driver);
        openUrl("https://allo.ua/ru/");
        getCheckAssert();
        resultCheckAseert();
        System.out.println (myBooleon);
        Assert.assertTrue (myBooleon);
    }
    private void resultCheckAseert() {
        String myRuWord = "Условия пользовательского соглашения";
        if (myRuWord.equals(word)){
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
