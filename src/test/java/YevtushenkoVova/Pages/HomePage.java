package YevtushenkoVova.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
    public WebElement privacyText(){
        return driver.findElement(By.xpath("//h2[contains(text(),'Privacy Policy')]"));
    }
    public WebElement linkTermsofUse(){
        return driver.findElement(By.xpath("//a[@href='/terms']"));
    }
    public WebElement termsText(){
        return driver.findElement(By.xpath("//h2[contains(text(),'Terms of Use')]"));
    }
    public WebElement linkRestaurantTerms(){
        return driver.findElement(By.xpath("//a[@ui-sref='restaurant-terms-of-service']"));
    }
    public WebElement merchantTerms(){
        return driver.findElement(By.xpath("//h2[contains(text(),'Merchant Terms')]"));
    }
    public WebElement btnGooglePlay(){
        return driver.findElement(By.xpath("//a[@class='app-btn-android']"));
    }
    public WebElement googlePlayLinkEatSt(){
        return driver.findElement(By.xpath("//a[@href='/store/apps/developer?id=EatStreet']"));
    }
    public WebElement btnAppStory(){
        return driver.findElement(By.xpath("//a[@class='app-btn-iphone']"));
    }
    public WebElement appStoryLinkEatSt(){
        return driver.findElement(By.xpath("//a[@href='https://apps.apple.com/us/developer/eatstreet/id664697936']"));
    }
    public WebElement w3BtnJava(){
        return driver.findElement(By.xpath("//a[@href='/java/default.asp' and contains(@class,'w3-button tut')]"));
    }
    public WebElement w3BtnSubmit(){
        return driver.findElement(By.xpath("//button"));
    }
    public WebElement w3BtnHome(){
        return driver.findElement(By.xpath("//span[@class='menubtn fa fa-home']"));
    }
    public WebElement w3Website(){
        return driver.findElement(By.xpath("//a[@title='Get Your Own Website With W3Schools Spaces']"));
    }
}

