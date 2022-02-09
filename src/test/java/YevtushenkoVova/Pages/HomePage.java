package YevtushenkoVova.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement buttonGotIt() {
        return findElement("//button[@class='btn']");
    }

    public WebElement openPageSingIn() {
        return findElement("//a[@id='menu-signin']");
    }

    public WebElement getMyAccound() {
        return driver.findElement(By.xpath("//a[@id='menu-my-account']"));
    }

    public void openQa2HomePage() {
        driver.get("https://qa2.eatstreet.com");
    }

    public WebElement aboutUs() {
        return driver.findElement(By.xpath("//a[@ui-sref='about-us']"));
    }

    public WebElement contactUs() {
        return driver.findElement(By.xpath("//a[@ui-sref='contact']"));
    }

    public WebElement careers() {
        return driver.findElement(By.xpath("//a[@ui-sref='careers']"));
    }

    public WebElement blog() {
        return driver.findElement(By.xpath("//a[@href='http://blog.eatstreet.com/']"));
    }

    public WebElement linkPrivacyPolicy() {
        return driver.findElement(By.xpath("//a[@ui-sref='privacy']"));
    }

    public WebElement privacyText() {
        return driver.findElement(By.xpath("//h2[contains(text(),'Privacy Policy')]"));
    }

    public WebElement linkTermsofUse() {
        return driver.findElement(By.xpath("//a[@href='/terms']"));
    }

    public WebElement termsText() {
        return driver.findElement(By.xpath("//h2[contains(text(),'Terms of Use')]"));
    }

    public WebElement linkRestaurantTerms() {
        return driver.findElement(By.xpath("//a[@ui-sref='restaurant-terms-of-service']"));
    }

    public WebElement merchantTerms() {
        return driver.findElement(By.xpath("//h2[contains(text(),'Merchant Terms')]"));
    }

    public WebElement btnGooglePlay() {
        return driver.findElement(By.xpath("//a[@class='app-btn-android']"));
    }

    public WebElement googlePlayLinkEatSt() {
        return driver.findElement(By.xpath("//a[@href='/store/apps/developer?id=EatStreet']"));
    }

    public WebElement btnAppStory() {
        return driver.findElement(By.xpath("//a[@class='app-btn-iphone']"));
    }

    public WebElement appStoryLinkEatSt() {
        return driver.findElement(By.xpath("//a[@href='https://apps.apple.com/us/developer/eatstreet/id664697936']"));
    }

    public WebElement w3BtnJava() {
        return driver.findElement(By.xpath("//a[@href='/java/default.asp' and contains(@class,'w3-button tut')]"));
    }

    public WebElement w3BtnSubmit() {
        return driver.findElement(By.xpath("//button"));
    }

    public WebElement w3BtnHome() {
        return driver.findElement(By.xpath("//span[@class='menubtn fa fa-home']"));
    }

    public WebElement w3Website() {
        return driver.findElement(By.xpath("//a[@title='Get Your Own Website With W3Schools Spaces']"));
    }

    public WebElement inputEetSt() {
        return driver.findElement(By.xpath("//input[@id='input-food-search']"));
    }

    public WebElement nyRest() {
        return driver.findElement(By.xpath("//a[@href='/new-york-city-ny/home']"));
    }

    public WebElement takeoutFilter() {
        return driver.findElement(By.xpath("//input[@id='filters-checkbox-takeout']"));
    }

    public WebElement takeCheckBox() {
        return driver.findElement(By.xpath("//input[contains(@class,'ng-valid-parse')]"));
    }

   public WebElement btnEnterAddress() {
        return findElement("//a[@id='enter-address-btn']");
        }

    public WebElement btnGetFet(){
        return findElement("//a[@id='find-restaurants']");
    }
    public List<WebElement> checkBoxBBQ(){
        return driver.findElements(By.xpath("//label[@for=\"filter-cuisine-BBQ\"]"));
    }
    public WebElement sanFrancisko(){
        return findElement("//a[@href=\"/san-francisco-ca/home\"]");
    }
    public WebElement sanDiego(){
        return findElement("//a[@href=\"/san-diego-ca/home\"]");
    }
    public WebElement sanJose(){
        return findElement("//a[@href=\"/sunnyvale-ca/home\"]");
    }
    public WebElement lincForCustomer(){
        return findElement("//a[@href=\"https://eatst.force.com/customers\"]");
    }
    public WebElement btnAboutUs(){
        return findElement("//a[@href=\"https://eatstreet.com/about-us\"]");
    }
    public WebElement assertAbout(){
        return findElement("//button[contains(text(),'About Us')]");
    }
    public WebElement w3GetFree(){
        return findElement("//button[@class=\"_1VfsI _OD95i _3_H0V mobb\"]");
    }
    public  WebElement accessibility(){
        return findElement("//a[@ui-sref=\"accessibility\"]");
    }
    public WebElement assertAccessibility(){
        return findElement("//h2[contains(text(),'Accessibility Statement')]");
    }
    public WebElement enterSignUpEmail(){
        return findElement("//input[@id=\"new-email\"]");
    }
    public WebElement btnSignUp(){
        return findElement("//button[@type=\"submit\"]");
    }
    public WebElement errorWindow(){
        return findElement("//div[@class=\"modal-body ng-binding\"]");
    }
}
