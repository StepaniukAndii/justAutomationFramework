package testEatStreetDenis.pages.footer;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import testEatStreetDenis.pages.content.LandingContentPage;

import java.util.List;

public class SupportPage extends BasePage {
    public SupportPage(WebDriver driver) {
        super(driver);
    }

    public FooterPage footerPage() {
        return new FooterPage(driver);
    }

    public LandingContentPage landingContentPage() {
        return new LandingContentPage(driver);
    }

    //Get Help section

    public WebElement getHelpFirstName() {
        return findElementByXpath("//input [@id='firstName']");
    }

    public WebElement getHelpLastName() {
        return findElementByXpath("//input [@id='lastName']");
    }

    public WebElement getHelpEmail() {
        return findElementByXpath("//input [@id='email']");
    }

    public WebElement getHelpPhone() {
        return findElementByXpath("//input [@id='phone']");
    }

    public WebElement getHelpSubject() {
        return findElementByXpath("//select [@id='subject']");
    }

    public List<WebElement> getHelpSubjectList() {
        return findElementsByXpath("//option [@ng-repeat='option in subjectOptions']");
    }

    public WebElement getHelpMessage() {
        return findElementByXpath("//textarea [@name='message']");
    }

    public WebElement getHelpChargeAmount() {
        return findElementByXpath("//input [@name='chargeAmount']");
    }

    public WebElement getHelpChargeDate() {
        return findElementByXpath("//input [@id='chargeDate']");
    }

    public WebElement getHelpNameOnCard() {
        return findElementByXpath("//input [@id='chargeName']");
    }

    public WebElement submit() {
        return findElementByXpath("//button [@id='submit']");
    }

    //For Customers section

    public WebElement forCustomersLogo() {
        return findElementByXpath("//div [@class='logoImage']");
    }

    public WebElement forCustomersGetFed() {
        return findElementByXpath("//a [@id='1']");
    }

    public WebElement forCustomersFindAnswers() {
        return findElementByXpath("//button [@aria-expanded]");
    }

    public List<WebElement> forCustomersQuestions() {
        return findElementsByXpath("//a [@role='menuitem']");
    }

    public WebElement forCustomersContactUs() {
        return findElementByXpath("//button [contains(@class, 'contact')]");
    }

    public List<WebElement> forCustomersTopics() {
        return findElementsByXpath("//div [@class='topicContent']");
    }
}
