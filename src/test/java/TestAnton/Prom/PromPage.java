package TestAnton.Prom;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PromPage extends BasePage {
    public PromPage(WebDriver driver) {super(driver);}

    public WebElement signUpBtn() {return findElementByXpath("//a[contains(@data-qaid,'qa_register_btn')]");}
    public WebElement enterYourNameFirstField() {return findElementByXpath("//input[contains(@name,'vertical-name')]");}
    public WebElement enterEmailFirstField() {return findElementByXpath("//input[contains(@name,'vertical-email')]");}
    public WebElement enterPasswordFirstField() {return findElementByXpath("//input[contains(@name,'vertical-password')]");}
    public WebElement clickSubmitFirstBtn() {return findElementByXpath("//button[contains(@class,'theme_blue')]");}
    public WebElement deleteProfileBtn() {return findElementByXpath("//span[contains(text(),'ида')]");}
    public WebElement signInBtn() {return findElementByXpath("//a[contains(@data-qaid,'sign-in')]");}
    public WebElement signInCustomerBtn() {return findElementByXpath("//a[contains(@data-qaid,'customer')]");}
    public WebElement signInInputField() {return findElementByXpath("//input[contains(@data-qaid,'input_field')]");}
    public WebElement confirmSignInBtn() {return findElementByXpath("//button[contains(text(),'ві')]");}
    public List<WebElement> nowPopularList() {return findElementsByXpath("//li[contains(@class,'season')]");}
    public WebElement backOnHomePageLogoBtn() {return findElementByXpath("//div[contains(@class,'e ek-grid_indent-x_xxs ')]");}
    public WebElement behindTheRatingBtn() {return findElementByXpath("//button[contains(@class,'1pPUv')]");}
    public WebElement nowPopularText() {return findElementByXpath("//span[contains(text(),'араз')]");}
    public WebElement getSearchHomePage() {return findElementByXpath("//input[contains(@class,'earch')]");}
    public WebElement getSearchBtn() {return findElementByXpath("//button[contains(text(),'найти')]");}
    public WebElement getNameGoods() {return findElementByXpath("//span[contains(text(),'«неокуб»')]");}
    public WebElement getChangeRuLangBtn() {return findElementByXpath("//span[@data-qaid='ru_lang']");}
    public WebElement getSignInRuText() {return findElementByXpath("//a[contains(text(),'ойти')]");}
    public WebElement getChangeUaLangBtn() {return findElementByXpath("//span[@data-qaid='ua_lang']");}
    public WebElement getSignInUaText() {return findElementByXpath("//a[contains(text(),'вій')]");}
    public WebElement getSpecialForYouBtn() {return findElementByXpath("//a[@data-qaid='special_for_you']");}
    public WebElement getHelpBtnOnHomePage() {return findElementByXpath("//a[contains(text(),'опо')]");}
    public WebElement getMobileAppBtn() {return findElementByXpath("//a[contains(text(),'обільний')]");}
    public WebElement getCreateCompanyBtn() {return findElementByXpath("//a[@data-qaid='create_company']");}
    public WebElement getVoiceSearch() {return findElementByXpath("//button[contains(@class,'earch')]");}
    public WebElement getChangeRegions() {return findElementByXpath("//button[@data-qaid='qa_regions_dd']");}
    public WebElement getFavouriteBtnOnHomePage() {return findElementByXpath("//button[@data-qaid='favorite_cabinet_button']");}
    public WebElement getMessageBtnOnHomePage() {return findElementByXpath("//button[@data-qaid='messages']");}
    public WebElement getCartBtnOnHomePage() {return findElementByXpath("//button[@data-qaid='shopping_cart']");}
}
