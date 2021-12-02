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
    public WebElement signInInputField() {return findElementByXpath("//*[@id='phone_email']");}
    public WebElement confirmSignInBtn() {return findElementByXpath("//*[@data-qaid='submit_btn']");}
    public List<WebElement> nowPopularList() {return findElementsByXpath("//li[contains(@class,'season')]");}
    public WebElement backOnHomePageLogoBtn() {return findElementByXpath("//div[contains(@class,'e ek-grid_indent-x_xxs ')]");}
    public WebElement behindTheRatingBtn() {return findElementByXpath("//button[contains(@class,'1pPUv')]");}
    public WebElement nowPopularText() {return findElementByXpath("//span[contains(text(),'араз')]");}
    public WebElement getSearchHomePage() {return findElementByXpath("//input[contains(@class,'earch')]");}
    public WebElement getSearchBtn() {return findElementByXpath("//button[contains(text(),'найти')]");}
    public WebElement getNameGoods() {return findElementByXpath("//span[contains(text(),'«неокуб»')]");}
    public WebElement getChangeRuLangBtn() {return findElementByXpath("//span[@data-qaid='ru_lang']");}
    public WebElement getSignInRuText() {
        return findElementByXpath("//a[contains(text(),'ойти')]");}
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
    public WebElement getSignInEnterPasswordField() {return findElementByXpath("//input[@id='enterPassword']");}
    public WebElement getNowPopularText() {return findElementByXpath("//span[contains(text(),'араз')]");}
    public WebElement getSpecialForYouText() {return findElementByXpath("//span[contains(text(),'пеці')]");}
    public WebElement getWhatLookingText() {return findElementByXpath("//h3[contains(text(),'шук')]");}
    public WebElement getBuyersText() {
        return findElementByXpath("//span[contains(text(),'окупцям')]");
    }
    public WebElement getSellersText() {
        return findElementByXpath("//span[contains(text(),'одавцям')]");
    }
    public WebElement getAboutUsText() {
        return findElementByXpath("//span[contains(text(),'ро нас')]");
    }
    public WebElement getPartnersText() {
        return findElementByXpath("//span[contains(text(),'артнери')]");
    }
    public WebElement getAndroidAppFooterHomePage() {
        return findElementByXpath("//a[@data-qaid='android_app']");
    }
    public WebElement getAppleAppFooterHomePage() {
        return findElementByXpath("//a[@data-qaid='apple_app']");
    }
    public WebElement getHuaweiAppFooterHomePage() {
        return findElementByXpath("//a[@data-qaid='huawei_app']");
    }
    public WebElement getYoutubeFooterHomePage() {
        return findElementByXpath("//a[@data-qaid='youtube']");
    }
    public WebElement getFacebookFooterHomePage() {
        return findElementByXpath("//a[@data-qaid='facebook']");
    }
    public List<WebElement> getBuyButtons(){
        return findElementsByXpath("//*[contains(@class,'ek-button_padding-left_none')]");
    }
    public WebElement getDeleteFromCartBtn(){
        return findElementByXpath("//*[@data-qaid,'delete_icon']");
    }
    public WebElement getOpenCartBtn(){
        return findElementByXpath("//*[contains(@data-qaid,'shopping_cart')]");
    }
    public WebElement getCartIsEmptyText(){
        return findElementByXpath("//*[contains(text(),'емає')]");
    }
    public WebElement getCloseCartBtn(){
        return findElementByXpath("//*[contains(@data-qaid,'close')]");
    }
    public WebElement getPriceRangeFirstBlock(){
        return findElementByXpath("//input[@data-qaid='price_local__gte']");
    }
    public WebElement getPriceRangeSecondBlock(){
        return findElementByXpath("//input[@data-qaid='price_local__lte']");
    }
    public WebElement getPriceRangeOkBtn(){
        return findElementByXpath("//div[contains(@class,'ek-box_margin-top_xs ek-box_margin-bottom_xs')]//descendant::button");
    }
    public List<WebElement> getGoodsPrices(){
        return findElementsByXpath("//span[@data-qaid='product_price']");
    }

    public List<WebElement> getAddToFavourite(){
        return findElementsByXpath("//*[@data-qaid='add_favorite']");
    }

    public WebElement getFavouriteCabinetBtn(){
        return findElementByXpath("//*[@data-qaid='favorite_cabinet_button']");
    }

    public WebElement getBuyBtnInFavourite(){
        return findElementByXpath("//button[@data-qaid='shopping_cart_btn']");
    }

    public WebElement getDeleteItemFromFavourite(){
        return findElementByXpath("//*[@data-qaid='delete_icon']");
    }

    public WebElement getShoppingBtnInFavourite(){
        return findElementByXpath("//*[contains(@class,'blue')]");
    }

    public WebElement getTextIntoSpecialForYouPage(){
        return findElementByXpath("//*[contains(text(),'зібрали')]");
    }

    public WebElement getTextOnHelpPage(){
        return findElementByXpath("//*[contains(text(),'им ми')]");
    }

    public WebElement getGoogleAppBtn(){
        return findElementByXpath("//div[contains(@class,'main__intro--1De7h')]//a[1]");
    }

    public WebElement getAppleAppBtn(){
        return findElementByXpath("//div[contains(@class,'main__intro--1De7h')]//a[2]");
    }

    public WebElement getMessagePopUp(){
        return findElementByXpath("//div[contains(@class,'besida-dropdown__root--p4uAJ')]");
    }

    public WebElement getActiveChatsBtn(){
        return findElementByXpath("//div[contains(text(),'Активні чати')]");
    }

    public WebElement getChatArchiveBtn(){
        return findElementByXpath("//div[contains(text(),'Архів чатів')]");
    }

    public WebElement getBlockedChatsBtn(){
        return findElementByXpath("//div[contains(text(),'Заблоковані чати')]");
    }

    public WebElement getCloseMessageWindowBtn(){
        return findElementByXpath("//span[@data-qaid='close_chat_btn']");
    }
}
