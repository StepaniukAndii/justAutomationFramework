package Svetlana.EatstreetPage;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FooterPage extends BasePage {

    public FooterPage(WebDriver driver) {
        super(driver);
    }

    public WebElement openContactUs() {
        return findElementByXpath("//a[@ui-sref='contact']");
    }

    public WebElement checkOpenContactAs() {
        return findElementByXpath("//h1[@class='page-title page-title--dashed']");
    }

    public WebElement clickCareers() {
        return findElementByXpath("//a[@ui-sref='careers']");
    }

    public WebElement inputSerchField() {
        return findElementByXpath("//input[@type='text']");
    }

    public WebElement checkSerchField() {
        return findElementByXpath("//span[contains(text(),'Director')]");
    }

    public List<WebElement> getClickCategories() {
        return findElementsByXpath("//div[@class='checkbox-filters-container filter-control']//label");
    }

    public WebElement getClickDelivery() {
        return findElementByXpath("//span[contains(text(),'Delivery')]");
    }

    public WebElement clickBlog() {
        return findElementByXpath("//a[contains(text(),'Blog')]");
    }

    public List<WebElement> clickMenuPage() {
        return findElementsByXpath("//ul[@id='menu-default-1']//li");
    }

    public WebElement clickDriver() {
        return findElementByXpath("//a[contains(text(),'Become a Driver!')]");
    }

    public WebElement getClickAddress() {
        return findElementByXpath("//div[@id='referral'\n]");
    }

    public List<WebElement> getClickCity() {
        return findElementsByXpath("//option[contains(text(),Ames )]");
    }

    public List<WebElement> clickApplyHere() {
        return findElementsByXpath("//button[contains(text(),'Apply Here')]");
    }

    public WebElement inputFerstName() {
        return findElementByXpath("//input[@id='application_form_first_name']");
    }

    public WebElement inputLastName() {
        return findElementByXpath("//input[@id='application_form_last_name']");
    }

    public WebElement inputEmail() {
        return findElementByXpath("//input[@id='application_form_email']");
    }
    public WebElement inputNumber() {
        return findElementByXpath("//input[@id='application_form_phone_number']");
    }
    public WebElement clickSubmit(){
        return findElementByXpath("//button[contains(text(),'Submit')]");
    }
    public WebElement checkFhoneValidation(){
        return findElementByXpath("//small[contains(text(),'The phone number is not valid')]");
    }
    public WebElement clickForCostumers(){
        return findElementByXpath("//a[contains(text(),'For Customers')]");
    }
    public WebElement clickCouponQuestions(){
        return findElementByXpath("//div[contains(text(),'Coupon Questions')]");
    }
    public WebElement checkCouponQuestions(){
        return findElementByXpath("//h2[contains(text(),'How do I add a coupon to my order')]");
    }
    public WebElement clickPaymentQuestions(){
        return findElementByXpath("//div[contains(text(),'Payment Questions')]");
    }
    public WebElement checkPaymentQuestions(){
        return findElementByXpath("//h2[contains(text(),'How do I u')]");
    }
    public WebElement clickAccessibilityStatement(){
        return findElementByXpath("//a[contains(text(),'Accessibility Statement')]");
    }
    public WebElement clickLinknternetAccessibility(){
        return findElementByXpath("/html/body/div[4]/div/div/div[1]/main/div/div/div/div[2]/p[3]/a");
    }



}