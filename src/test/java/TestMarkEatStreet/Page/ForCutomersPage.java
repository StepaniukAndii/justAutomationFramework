package TestMarkEatStreet.Page;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForCutomersPage extends BasePage{
    public ForCutomersPage(WebDriver driver){super(driver);}
    public WebElement gettoknowusbtn(){return findElementByXpath("//div[contains(@class,'topicContent')]//*[contains(text(),'Get To Know')]");}
    public WebElement faqsbtn(){return findElementByXpath("//div[contains(@class,'topicContent')]//*[contains(text(),'FAQs')]");}
    public WebElement accquestionsbtn(){return findElementByXpath("//div[contains(@class,'topicContent')]//*[contains(text(),'Acc')]");}
    public WebElement orderhelpbtn(){return findElementByXpath("//div[contains(@class,'topicContent')]//*[contains(text(),'Order')]");}
}
