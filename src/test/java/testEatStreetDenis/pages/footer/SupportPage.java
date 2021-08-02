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

    public WebElement getHelpOrderSelect() {            //for future assertion test
        return findElementByXpath("//select [@id='order']");
    }

    public WebElement submit() {
        return findElementByXpath("//button [@id='submit']");
    }
}
