package TestAnton.Oniks;

import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestQuestionsAndAnswers extends TestInit {

    @Test
    public void testQuestionsAndAnswers(){
        OniksPage homePage = new OniksPage(driver);
        driver.get("https://oniks.ua");
        homePage.getQuestionsAndAnswersBtn().click();
        Assert.assertEquals(homePage.getQuestionsAndAnswersText().getText(), "Вопросы-ответы");
    }
}