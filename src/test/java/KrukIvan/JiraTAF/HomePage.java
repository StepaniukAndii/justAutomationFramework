package KrukIvan.JiraTAF;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends BasePage {
    public List<WebElement> addFood(){
        return findElementsByXpath("//div[@class='is-clickable product-container']");
    }

    public HomePage(WebDriver driver){
        super(driver);
    }
    public WebElement clickButtonGotIt() {
       return findElement("//button[@class='btn']");
    }

    public WebElement inputEmail() {
        return driver.findElement(By.xpath("//input[@id='email']"));
    }

    public WebElement inputPassword() {
        return driver.findElement(By.xpath("//input[@id='password']"));
    }

    public WebElement getSignInBTN() {
        return driver.findElement(By.xpath("//button[@id='signin']"));
    }
    public WebElement getErrorMSG(){
        return driver.findElement(By.xpath("//span[contains(text(),'is incorrect.')]"));
    }

    public WebElement clickBTNSignInWithFacebook() {
        return driver.findElement(By.xpath("//a[@class='btn btn-facebook btn-facebook__sign-in full-width ng-scope']"));
    }
    public WebElement writeAddress(){
        return driver.findElement(By.xpath("//input[@class='enter-address__input input-default border-none ng-valid ng-valid-required']"));
    }
    public WebElement searchField(){
        return driver.findElement(By.xpath("//input[@id='search-autocomplete']"));
    }
    public WebElement bTNLoadMoreRestaurants(){
        return driver.findElement(By.xpath("//button[@class='btn btn--orange']"));
    }
    public WebElement bTNEnterAddress(){
      return  findElement("//a[@id='enter-address-btn']");
    }
    public WebElement bTNGetFed(){
        return findElement("//a[@id='find-restaurants']");
    }
    public WebElement assertBTNAddress(){
        return findElement("//a[@id='confirm-modal-btn']");
    }
    public WebElement clickBTNSignInOnHomePage(){
        return findElement("//a[@id='menu-signin']");
    }
    public WebElement clickTextSignUp(){
        return findElement("//a[@ng-click='signinCtrl.recordCreateAccount()']");
    }
    public WebElement enterEmailInSignUp(){
        return  findElement("//input[@id='email']");
    }
    public WebElement enterPasswordInSignUp(){
        return  findElement("//input[@id='password']");
    }
    public WebElement enterPasswordAgain(){
        return findElement("//input[@id='passwordAgain']");
    }
    public WebElement wrongEmailMSG(){
        return findElement("//div[@id='email-validation-tag']");
    }
    public List <WebElement> getRestaurant(){
        return findElementsByXpath("//li[@class='li li--rest-list border-bottom-last-1 ng-scope ng-isolate-scope']");
    }
    public List <WebElement> getFoodInRestaurant(){
        return findElementsByXpath("//div[@class='is-clickable product-container']");
    }
    public WebElement addToCart(){
        return findElement("//a[@id='confirm-options']");
    }
    public List<WebElement> clickAdditionalInformation(){
        return findElementsByXpath("//div[@class='options-radio-buttons-items radio ng-scope']");
    }
    public WebElement bTNCheckout(){
        return findElement("//a[@id='click-checkout']");
    }
    public List <WebElement> clickAdditionalInformationABTSize(){
        return findElementsByXpath("//option[@value='8377587']");
    }
    public WebElement clickOnMainPageOnDetroitCity(){
        return findElement("//a[@href='/detroit-mi/home']");
    }
    public WebElement getInformationAboutDetroitRestaurants(){
        return findElementByXpath("//h1[contains(text(),'Order Food Delivery & Takeout in Detroit, MI')]");
    }
    public List<WebElement> addFilters(){
        return findElementsByXpath("//div[@class='checkbox checkbox_blue']");
    }
    public List<WebElement> filtersAreVisible(){
        return findElementsByXpath("//span[@class='active_filter ng-binding ng-scope']");
    }

    public List<WebElement> getList() {
        return findElementsByXpath("//ul[contains(@class, 'filters-section_checkoxes')]//input[contains(@class, 'ng-not-empty')]");
    }
    public WebElement filterTakeout(){
        return findElementByXpath("//input[@id='filters-checkbox-takeout']");
    }
    public WebElement filterTakeoutIsOn(){
        return driver.findElement(By.xpath("//input[contains(@value, 'free')]"));
    }
    public List<WebElement> typesOfCuisine(){
        return findElementsByXpath("//li[@class='cuisine-types__item']");
    }
    public WebElement getInformationABTAsianFood(){
        return findElementByXpath("//h1[contains(text(), 'Asian Food')]");
    }
    public WebElement bTNTakeOut(){
        return findElementByXpath("//label[@for='home-checkbox-takeout']");
    }
    public WebElement bTNTakeOutIsOn(){
        return findElementByXpath("//input[@id='home-checkbox-takeout']");
    }
    public WebElement viewAllDetroitRests(){
        return findElementByXpath("//a[@class='btn btn-primary margin-top-25 ng-binding']");
    }
    public WebElement detroitRestsAreOn(){
        return findElementByXpath("//h1[@class='restaurants-list_header ng-binding ng-scope']");
    }
    public WebElement signUpWithFacebook(){
        return findElementByXpath("//a[@class='btn btn-facebook full-width margin-bottom-10']");
    }
    public WebElement signUpWithGoogle(){
        return findElementByXpath("//div[@class='btn btn-google btn-google--sign-in full-width ng-binding']");
    }
    public List<WebElement> bTNGetHelp(){
        return findElementsByXpath("//a[@ng-click=\"getHelp()\"]");
    }
    public WebElement partnerWithUsBTN(){
        return findElementByXpath("//a[@class=\"partners-link ng-scope\"]");
    }
    public WebElement assertBTNPartnerWithUs(){
        return findElementByXpath("//div[@id=\"partners\"]");
    }
    public WebElement sortByBTN(){
        return findElementByXpath("//button[@class=\"custom_dropdown_button\"]");
    }
    public List <WebElement> sortByARAndOther(){
        return findElementsByXpath("//button[@class=\"custom_dropdown_content_option\"]");
    }
    public WebElement getReviews(){
        return findElementByXpath("//label[@for=\"reviews\"]");
    }
    public WebElement assertReviews(){
        return findElementByXpath("//h2[@class=\"widget-header widget-header--menu-more-info widget-header--reviews-header margin-bottom-20 ng-binding\"]");
    }
    public WebElement getTheAppAndroid(){
        return findElementByXpath("//a[@class=\"app-btn-android\"]");
    }
    public WebElement getTheAppIOS(){
        return findElementByXpath("//a[@class=\"app-btn-iphone\"]");
    }
    public  List<WebElement> becomeADriverLink(){
        return findElementsByXpath("//a[@class=\"how-it-works_link\"]");
    }
    public WebElement bTNOrderAhead(){
        return findElementByXpath("//label[@for=\"filter-Order Ahead\"]");
    }
}

