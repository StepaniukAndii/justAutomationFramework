package Julia.EatStreet.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getAdressInput() {
        return findElementByXpath("//input[@ng-model='searchParam']");
    }

    public WebElement getGoItBtn() {
        return findElementByXpath("//button[@class='btn']");
    }

    public WebElement getFedBtn() {
        return findElementByXpath("//a[@id='find-restaurants']");
    }

    public List<WebElement> getPageNumberList() {
        return findElementsByXpath("//ul[@class='pagination__pages']//a");
    }

    public List<WebElement> getAllRest() {
        return findElementsByXpath("//ul[@id='all-rests']/li");
    }

    public void getSelectPageRest() {
        if (getPageNumberList().size() > 0) {
            sleep(5);
            getPageNumberList().get(getPageNumberList().size() - 1).click();
        }
    }

    public void getSelect70Rest() {
        if (getPageNumberList().size() > 0) {
            getPageNumberList().get(1).click();
            getAllRest().get(19).click();
        } else {
            getAllRest().get(getAllRest().size() - 1).click();
        }
    }

    public List<WebElement> getSearchAttempt() {
        return findElementsByXpath("//button[@class='btn']");
    }

    public WebElement restName() {
        return findElement("//a[contains(text(), 'York City')]");
    }

    public WebElement clickSignInBtn() {
        return findElementByXpath("//a[@id='menu-signin']");
    }

    public WebElement clickSingInWithGoogle() {
        return driver.findElement(By.xpath("//div[@id='uniqueid']"));
    }

    public WebElement selectAccountWithGoogle() {
        return driver.findElement(By.xpath("//span[contains(text(), 'Вход')]"));
    }

    public WebElement getNewToEatstreetText() {
        return findElementByXpath("//span[contains(text(), 'New to EatStreet?')]");
    }

    public WebElement clickSingInWithFacebook() {
        return driver.findElement(By.xpath("//a[@class='btn btn-facebook btn-facebook__sign-in full-width ng-scope']"));
    }

    public WebElement enterEmailWithFacebook() {
        return driver.findElement(By.xpath("//input[@name='email']"));
    }

    public WebElement enterPassWithFacebook() {
        return findElementByXpath("//input[@id='password']");
    }

    public WebElement selectCityMuncie() {
        return findElementByXpath("//a[contains(text(), 'Muncie, IN')]");
    }

    public WebElement selectCategoryLateNightFood() {
        return findElementByXpath("//li[@class='cuisine-types__item']");
    }

    public WebElement selectRestInCity() {
        return findElementByXpath("//a[@class='restaurant-header restaurant-header--rest-list ng-binding']");
    }

    public WebElement clickSearchMenu() {
        return findElementByXpath("//input[@placeholder='Search Menu']");
    }

    public WebElement checkTextDeluxPizza() {
        return findElementByXpath("//span[contains(text(), 'Deluxe Pizza')]");
    }

    public WebElement clickSignUpLink() {
        return driver.findElement(By.xpath("//a[contains(text(), 'Sign Up')]"));
    }

    public WebElement enterEmailField() {
        return driver.findElement(By.xpath("//input[@name='email']"));
    }

    public WebElement enterPassField() {
        return driver.findElement(By.xpath("//input[@name='password']"));
    }

    public WebElement enterPassAgainField() {
        return driver.findElement(By.xpath("//input[@name='passwordAgain']"));
    }

    public WebElement clickSignUpBtn() {
        return driver.findElement(By.xpath("//button[@id='signup']"));
    }

    public WebElement clickBtnLiveChat() {
        return driver.findElement(By.xpath("//span[@class ='ng-binding']"));
    }

    public WebElement enterMessageLiveChat() {
        return driver.findElement(By.xpath("//div[@id='liveAgentChatInput']/textarea"));
    }

    public WebElement clickBtnSend() {
        return driver.findElement(By.xpath("//button[@title='Send']"));
    }

    public WebElement answerBotLiveChat() {
        return driver.findElement(By.xpath("//div[contains(text(), 'EatStreet Bot')]"));
    }

    public void checkAndClousePopUpWindow() {
        if (getSearchAttempt().size() > 0) {
            sleep(2);
            getSearchAttempt().get(0).click();
        }
    }

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public WebElement btnApplyNow() {
        return driver.findElement(By.xpath("//a[contains(text(), 'Apply Now')]"));
    }

    public WebElement applyCity() {
        return driver.findElement(By.xpath("//option[contains(text(), 'Apply in Your City')]"));
    }

    public WebElement fieldApplyInYourCity() {
        return driver.findElement(By.xpath("//option[contains(text(), 'Madison, WI.')]"));
    }

    public WebElement getDeliveryDriver() {
        return driver.findElement(By.xpath("//span[contains(text(), 'Delivery Driver - Madison, WI.')]"));
    }

    public WebElement btnGetHelp() {
        return driver.findElement(By.xpath("//a[contains(text(), 'Get Help')]"));
    }

//    public WebElement getHelpBot() {
//        return driver.findElement(By.xpath("//div[contains(text(), 'EatStreet Bot')]"));
//    }

    public WebElement clickContactUs() {
        return driver.findElement(By.xpath("//a[@ui-sref='contact']"));
    }

    public WebElement getEmailFromContactUs() {
        return driver.findElement(By.xpath("//a[contains(text(), 'customer.service@eatstreet.com')]"));
    }

    public WebElement googleAppLink() {
        return driver.findElement(By.xpath("//a[@class='app-btn-android']"));
    }

    public WebElement getAppGooglePlay() {
        return driver.findElement(By.xpath("//a[contains(text(), 'EatStreet')]"));
    }

    public WebElement btnAPI() {
        return driver.findElement(By.xpath("//a[contains(text(), 'API')]"));
    }

    public WebElement getRestInNY() {
        return findElementByXpath("//span[contains(text(), 'NY')]");
    }

    public WebElement btnBlog() {
        return driver.findElement(By.xpath("//a[contains(text(), 'Blog')]"));
    }

    public WebElement clickResentPost() {
        return driver.findElement(By.xpath("//section[@id='recent-posts']/article[@id='post-11918']"));

    }

    public WebElement selectCityDetroyd() {
        return driver.findElement(By.xpath("//a[contains(text(),'Detroit')]"));
    }

    public WebElement selectAsianCousin() {
        return driver.findElement(By.xpath("//button[contains(text(),'Asian')]"));
    }


    public WebElement tabBetterbin() {
        return driver.findElement(By.xpath("//a[contains(text(),'Betterbin')]"));
    }

    public WebElement getAsianFood() {
        return driver.findElement(By.xpath("//span[contains(text(),'Bangladeshi')]"));
    }

    public List<WebElement> getAdressSearchAttempt() {
        return driver.findElements(By.xpath("//div[@class='modal-footer']"));
    }

    public void checkAndClouseAdressSearchAttempt() {
        if (getAdressSearchAttempt().size() > 0) {
            getAdressSearchAttempt().get(1).click();
        }
        else {getFedBtn().click();
        }
    }

    public List<WebElement> getItalianFoodLabel() {
        return findElementsByXpath("//ul[@class='filters-section_checkoxes']//label");
    }

    public WebElement getItalianFood() {
        return findElementByXpath("//span[contains(text(),'Italian Food')]");
    }

    public WebElement getForCustomers() {
        return driver.findElement(By.xpath("//a[contains(text(), 'For Customers')]"));
    }

    public WebElement btnAssebilityStatement() {
        return driver.findElement(By.xpath("//a[contains(text(), 'Accessibility Statement')]"));
    }

    public WebElement btnPrivasyPolicy() {
        return driver.findElement(By.xpath("//a[contains(text(), 'Privacy Policy')]"));
    }

    public void goToTheSecondWindowTab(WebDriver driver, Integer seconds) {
        waitForNewTabOpened(seconds);
        ArrayList<String> tabs = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }

    public void waitForNewTabOpened(Integer seconds) {
        for (int a = 0; a < seconds * 2; a++) {
            ArrayList<String> tabs2 = new ArrayList(driver.getWindowHandles());
            if (tabs2.size() > 1) {
                break;
            }
        }
    }

    public WebElement clickBtnTermsUse() {
        return driver.findElement(By.xpath("//a[contains(text(),'Terms of Use')]"));
    }

    public WebElement btnRestTerms() {
        return driver.findElement(By.xpath("//a[contains(text(),'Restaurant Terms')]"));
    }

    public WebElement btnRestDashboard() {
        return driver.findElement(By.xpath("//a[contains(text(), 'Restaurant Dashboard')]"));
    }

    public WebElement btnCreateFreeAccount() {
        return driver.findElement(By.xpath("//a[contains(text(), 'Create a free account')]"));
    }

    public WebElement getSignUpDashboard() {
        return driver.findElement(By.xpath("//h1[contains(text(), 'Sign Up')]"));
    }

    public WebElement getBackToOrlando() {
        return driver.findElement(By.xpath("//a[contains(text(),'Back to Orlando, FL Restaurants')]"));
    }

    public WebElement getBackToCorvallis() {
        return driver.findElement(By.xpath("//a[contains(text(),'Back to Corvallis, OR Restaurants')]"));
    }

    public WebElement getBackBeverlyHills() {
        return driver.findElement(By.xpath("//a[contains(text(),'Back to Los Angeles, CA Restaurants')]"));
    }

    public WebElement getBackToLakewood() {
        return findElementByXpath("//a[contains(text(), 'Back to Lakewood, CO Restaurants')]");
    }

    public WebElement btnCareers() {
        return driver.findElement(By.xpath("//a[contains(text(), 'Careers')]"));
    }

    public WebElement btnTech() {
        return driver.findElement(By.xpath("//label[contains(text(),'Tech')]"));
    }

    public WebElement btnCreative() {
        return driver.findElement(By.xpath("//label[contains(text(),'Creative')]"));
    }

    public WebElement btnCulinary() {
        return driver.findElement(By.xpath("//label[contains(text(),'Culinary')]"));
    }

    public WebElement btnBusiness() {
        return driver.findElement(By.xpath("//label[contains(text(),'Business')]"));
    }

    public WebElement btnDelivery() {
        return driver.findElement(By.xpath("//label[contains(text(),'Delivery')]"));
    }

    public WebElement allJobs() {
        return driver.findElement(By.xpath("//h2[contains(text(),'All Jobs')]"));
    }

    public WebElement clickDeliveryBtn() {
        return driver.findElement(By.xpath("//label[contains(text(),'Delivery')]"));
    }

    public WebElement clickTakeOutBtn() {
        return findElementByXpath("//label[contains(text(),'Takeout')]");
    }

    public List<WebElement> getDesertLabel() {
        return findElementsByXpath("//ul[@class='cuisine-types__list']//li");
    }

    public WebElement getBaltimoreCity() {
        return findElementByXpath("//a[contains(text(),'Baltimore')]");
    }

    public WebElement getDeKalb() {
        return findElementByXpath("//a[contains(text(),'DeKalb, IL')]");
    }

    public WebElement getViewAllRestDeKalb() {
        return findElementByXpath("//a[contains(text(), 'View All DeKalb Restaurants')]");
    }

    public WebElement btnSpecialist() {
        return findElementByXpath("//label[contains(text(),'Specials')]");
    }

    public WebElement btnOpenNow() {
        return findElementByXpath("//label[contains(text(),'Open Now')]");
    }

    public WebElement btnOrderAhead() {
        return findElementByXpath("//label[contains(text(),'Order Ahead')]");
    }
    public List<WebElement> enterFieldMyAnswer() {
        return driver.findElements(By.xpath("//div[@jsname='LwH6nd']"));
    }

    public List<WebElement> getbtnFiltrSection() {
        return findElementsByXpath("//ul[@class='filters-section_checkoxes']//label");
    }

    public WebElement getSectionFiltrAllRestInCity() {
        return driver.findElement(By.xpath("//div[@id='filters']"));
    }

    public WebElement fieldSearchMenu() {
        return driver.findElement(By.xpath("//input[@placeholder='Search Menu']"));
    }

    public WebElement h2YourOrder() {
        return driver.findElement(By.xpath("//div[@class='widget-header--menu__cart__header']/h2"));
    }

    public List<WebElement> sectionMenu() {
        return findElementsByXpath("//div[@class='list list--menu list--menu--scale']/section");
    }

    public WebElement addThisItem() {
        return findElementByXpath("//button[@id='quantity--adds']");
    }

    public WebElement btnAddToCard() {
        return findElementByXpath("//a[@id='confirm-options']");
    }

    public WebElement ecqualsCard() {
        return driver.findElement(By.xpath("//span[@class='navbar__cart-count ng-binding ng-scope']"));
    }

    public List<WebElement> deleteItemInYourOrder() {
        return driver.findElements(By.xpath("//div//table//a[@id='remove-item']"));

    }

    public List<WebElement> clickFiltrSection() {
        return findElementsByXpath("//div[@class='row filters-section ng-scope']//label");
    }

    public List<WebElement> activeFiltr() {
        return driver.findElements(By.xpath("//div/span[@class='active_filter ng-binding ng-scope']"));
    }

    public List<WebElement> closeActiveFiltr() {
        return driver.findElements(By.xpath("//span/button[@class='active_filter_remove']"));
    }
    public WebElement getTheApp() {
        return driver.findElement(By.xpath("//a[contains(text(), 'Get The App')]"));
    }

    public List<WebElement> clickSortByBtn() {
        return driver.findElements(By.xpath("//button[@class='custom_dropdown_button']/span"));
    }

    public WebElement clickSortByIMGBtn() {
        return driver.findElement(By.xpath("//button[@class='custom_dropdown_button']/img"));
    }

    public WebElement clickSortByETABtn() {
        return driver.findElement(By.xpath("//button[contains(text(), 'ETA')]"));
    }

    public WebElement clickSortByDistanceBtn() {
        return driver.findElement(By.xpath("//button[contains(text(), 'Distance')]"));

    }

    public WebElement clickSortByRatingBtn() {
        return driver.findElement(By.xpath("//button[contains(text(), 'Rating')]"));
    }

    public WebElement clickSortDeliveryFreeBtn() {
        return driver.findElement(By.xpath("//button[contains(text(), 'Delivery Fee')]"));
    }

    public WebElement selectOneDropDownWindow() {
        return findElementByXpath("//div//label[@class='checkbox-input']");
    }

    public WebElement clickBtnProcesedToCheckout() {
        return findElementByXpath("//a[@id='click-checkout']");
    }

    public WebElement btnAboutUs() {
        return driver.findElement((By.xpath("//a[contains(text(), 'About Us')]")));
    }

    public WebElement getAdressHeaderInput() {
        return driver.findElement((By.xpath("//input[@id='address-input']")));
    }

    public List<WebElement> btnShowMore() {
        return findElementsByXpath("//button[contains(text(), 'Show More')]");
    }

    public List<WebElement> getMenuLink() {
        return driver.findElements(By.xpath("//ul[@class='press__nav__list']//button"));
    }

    public List<WebElement> connectMenu() {
        return findElementsByXpath("//ul[@class='connect__list']/li");
    }

    public List<WebElement> getMenuLinkBlog() {
        return driver.findElements(By.xpath("//ul[@class='press__nav__list']//li"));
    }

    public WebElement getLinkInTextAssebilityStatement() {
        return driver.findElement(By.xpath("//a[@ng-click='trackLinkClick($event)']"));
    }

    public WebElement openRestHoney() {
        return driver.findElement(By.xpath("//h1[contains(text(),'Honey Baked Ham Company')]"));
    }

    public List<WebElement> btnMoreInfo() {
        return findElementsByXpath("//a[contains(text(), 'More Info')]");
    }

    public WebElement btnViewAllJobListings() {
        return findElementByXpath("//a[contains(text(), 'View All Job Listings')]");
    }

    public WebElement linkStripeServiceAgreement() {
        return findElementByXpath("//a[contains(text(),'Stripe Services Agreement')]");
    }

    public WebElement linkPageContactUs() {
        return findElementByXpath("//div[@class='col-6']/p/a");
    }

    public WebElement singIn() {
        return findElementByXpath("//div[@class='user-flow__content']/span");
    }

    public WebElement getRadioBtnTakeOut() {
        return findElementByXpath("//input[@id='filters-checkbox-takeout']");
    }
    public WebElement explicitWaitClickable(String locator){
        return new WebDriverWait(driver, 10)
                .until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
    }

    public WebElement getViewAllRestBaltimoreCity() {
        return findElementByXpath("//a[contains(text(), 'View All Baltimore Restaurants')]");
    }

    public WebElement getBaltimoreTitle() {
        return findElementByXpath("//h1[contains(text(), 'Baltimore Restaurants That Deliver & Takeout')]");
    }


    public WebElement btnSingIn() {
        return findElementByXpath("//button[@id='signin']");
    }

    public WebElement isIncorrectText() {
        return findElementByXpath("//span[contains(text(), 'The login information you entered is incorrect.')]");
    }

    public WebElement getRestInHouston() {
        return findElementByXpath("//h1[contains(text(), 'Mi Casa De Sabor Bar & Grill')]");
    }

    public WebElement getBackToPhoenix() {
        return findElementByXpath("//a[contains(text(), 'Back to Phoenix, AZ Restaurants')]");
    }

    public WebElement getTryAnotherPasswordText() {
        return findElementByXpath("//div[@id='password-validation-tag']");
    }
}
