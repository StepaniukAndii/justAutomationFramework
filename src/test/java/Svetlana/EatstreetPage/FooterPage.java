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
    public WebElement clickRestaurantDashboard(){
        return findElementByXpath("//a[contains(text(),'Restaurant Dashboard')]");
    }
    public WebElement inputEmailSignIn(){
        return findElementByXpath("//input[@id='identifier']");
    }
    public WebElement inputPasswordSignIn(){
        return findElementByXpath("//*[@id=\"password\"]");
    }
    public WebElement clickSignIn(){
        return findElementByXpath("//button[contains(text(),' Sign In')]");
    }
    public WebElement clickForgotPassword(){
        return findElementByXpath("/html/body/div[2]/div/div/div/div/div[2]/div[3]/a");
    }
    public WebElement inputNewPassword(){
        return findElementByXpath("//*[@id=\"email\"]");
    }
    public WebElement clickResetPassword(){
        return findElementByXpath("//*[@id=\"confirm-modal-btn\"]");
    }
    public WebElement checkResetPassword(){
        return findElementByXpath("//*[@id=\"exp-confirm-modal\"]/div[2]/div[2]");
    }
    public WebElement clickSignUp(){
        return findElementByXpath("/html/body/div[2]/div/div/div/div/div[1]/a[2]");
    }
    public WebElement inputAddress(){
        return findElementByXpath("/html/body/div[2]/div/div/div/div/div[3]/div[1]/div/input");
    }
    public WebElement selectAddress(){
        return findElementByXpath("/html/body/div[2]/div/div/div/div/div[3]/div[1]/ul/li");
    }
    public WebElement clickConfirmRestuar(){
        return findElementByXpath("//button[contains(text(),'Confirm Restaurant')]");
    }
    public WebElement checkPopup(){
        return findElementByXpath("//*[@id=\"exp-confirm-modal\"]/div[2]/div[2]");
    }
    public WebElement clickPrivacyPolicy(){
        return findElementByXpath("//a[contains(text(),'Privacy Policy')]");
    }
    public WebElement inputEmailPrivacyPolicy(){
        return findElementByXpath("//*[@id=\"email\"]");
    }
    public WebElement selectRemove(){
        return findElementByXpath("//*[@id=\"REQUEST_DELETION\"]");
    }
    public WebElement checkPrivacyPolicyOpened(){
        return findElementByXpath("//h2[contains(text(),'Privacy Policy')]");
    }
    public WebElement checkPrivacyPolicySendForm(){
        return findElementByXpath("/html/body/div[4]/div/div/div[1]/secure-action-tracker/main/div/div/div/div[1]");
    }
    public WebElement clickTermsOfUs(){
        return findElementByXpath("//a[contains(text(),'Terms of')]");
    }
    public WebElement clickLinkPP(){
        return findElementByXpath("//*[@id=\"main_content\"]/div/div/div/div[2]/p[64]/a");
    }
    public WebElement clickRestaurantTerms(){
        return findElementByXpath("//a[contains(text(),'Restaurant Terms')]");
    }
}