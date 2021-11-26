package ATymoshenko.tests;

import ATymoshenko.pages.HomePage;
import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testMyAccount extends TestInit {
    @Test
    public void checkRequiredFields0Pieces(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.getGoItBtn().click();
        homePage.addSignInBtnOnHeader().click();
        homePage.addEmailField().sendKeys("alextymoshenko81@gmail.com");
        homePage.addPasswordField().sendKeys("rterterteywyw");
        homePage.addSignInBtnOnPopUpWindow().click();
        sleep(2);
        homePage.myAccountIcon().click();
        sleep(2);
        homePage.addNewAddressBtn().click();
        homePage.addStreetAddressField().sendKeys("Octobers str");
        homePage.addAptSuiteField().sendKeys("123");
        homePage.addBuildingNameField().sendKeys("321");
        homePage.addCityField().sendKeys("NY");
        homePage.addStateField().sendKeys("New York");
        homePage.addZipField().sendKeys("333");
        homePage.addSaveBtnInAddANewAddressWindow().click();
        sleep(2);
        Assert.assertTrue(homePage.getListRequired().size()==0);
    }
    @Test
    public void test1RequiredField1Pieces(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.getGoItBtn().click();
        homePage.addSignInBtnOnHeader().click();
        homePage.addEmailField().sendKeys("alextymoshenko81@gmail.com");
        homePage.addPasswordField().sendKeys("rterterteywyw");
        homePage.addSignInBtnOnPopUpWindow().click();
        sleep(2);
        homePage.myAccountIcon().click();
        sleep(2);
        homePage.addNewAddressBtn().click();
        homePage.addAptSuiteField().sendKeys("123");
        homePage.addBuildingNameField().sendKeys("321");
        homePage.addCityField().sendKeys("NY");
        homePage.addStateField().sendKeys("New York");
        homePage.addZipField().sendKeys("333");
        homePage.addSaveBtnInAddANewAddressWindow().click();
        sleep(2);
        Assert.assertTrue(homePage.getListRequired().size()==1);
    }
    @Test
    public void test2RequiredField1Pieces(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.getGoItBtn().click();
        homePage.addSignInBtnOnHeader().click();
        homePage.addEmailField().sendKeys("alextymoshenko81@gmail.com");
        homePage.addPasswordField().sendKeys("rterterteywyw");
        homePage.addSignInBtnOnPopUpWindow().click();
        sleep(2);
        homePage.myAccountIcon().click();
        sleep(2);
        homePage.addNewAddressBtn().click();
        homePage.addAptSuiteField().sendKeys("123");
        homePage.addBuildingNameField().sendKeys("321");
        homePage.addStateField().sendKeys("New York");
        homePage.addZipField().sendKeys("333");
        homePage.addSaveBtnInAddANewAddressWindow().click();
        sleep(2);
        Assert.assertTrue(homePage.getListRequired().size()==2);
    }
    @Test
    public void testRequiredField3Pieces(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.getGoItBtn().click();
        homePage.addSignInBtnOnHeader().click();
        homePage.addEmailField().sendKeys("alextymoshenko81@gmail.com");
        homePage.addPasswordField().sendKeys("rterterteywyw");
        homePage.addSignInBtnOnPopUpWindow().click();
        sleep(2);
        homePage.myAccountIcon().click();
        sleep(2);
        homePage.addNewAddressBtn().click();
        homePage.addAptSuiteField().sendKeys("123");
        homePage.addBuildingNameField().sendKeys("321");
        homePage.addZipField().sendKeys("333");
        homePage.addSaveBtnInAddANewAddressWindow().click();
        sleep(2);
        Assert.assertTrue(homePage.getListRequired().size()==3);
    }
    @Test
    public void testRequiredField4Pieces(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.getGoItBtn().click();
        homePage.addSignInBtnOnHeader().click();
        homePage.addEmailField().sendKeys("alextymoshenko81@gmail.com");
        homePage.addPasswordField().sendKeys("rterterteywyw");
        homePage.addSignInBtnOnPopUpWindow().click();
        sleep(2);
        homePage.myAccountIcon().click();
        sleep(2);
        homePage.addNewAddressBtn().click();
        homePage.addAptSuiteField().sendKeys("123");
        homePage.addBuildingNameField().sendKeys("321");
        homePage.addSaveBtnInAddANewAddressWindow().click();
        sleep(2);
        Assert.assertTrue(homePage.getListRequired().size()==4);
    }
    @Test
    public void testRequiredMessageAboutNameInAddANewCard(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.getGoItBtn().click();
        homePage.addSignInBtnOnHeader().click();
        homePage.addEmailField().sendKeys("alextymoshenko81@gmail.com");
        homePage.addPasswordField().sendKeys("rterterteywyw");
        homePage.addSignInBtnOnPopUpWindow().click();
        sleep(2);
        homePage.myAccountIcon().click();
        sleep(2);
        homePage.addNewCardBtn().click();
        homePage.addOkayBtnInAddNewCard().click();
        sleep(2);
        Assert.assertTrue(homePage.nameOnCreditCardIsRequiredMessege().isDisplayed());
        //Assert.assertTrue(homePage.creditCardNumberIsRequiredMessage().isDisplayed());
    }
    @Test
    public void testRequiredMessageAboutCardNumberInAddANewCard(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.getGoItBtn().click();
        homePage.addSignInBtnOnHeader().click();
        homePage.addEmailField().sendKeys("alextymoshenko81@gmail.com");
        homePage.addPasswordField().sendKeys("rterterteywyw");
        homePage.addSignInBtnOnPopUpWindow().click();
        sleep(2);
        homePage.myAccountIcon().click();
        sleep(2);
        homePage.addNewCardBtn().click();
        homePage.addNameOfCardholderField().sendKeys("Симбочка-пимбочка");
        homePage.addOkayBtnInAddNewCard().click();
        sleep(2);
        Assert.assertTrue(homePage.creditCardNumberIsRequiredMessage().isDisplayed());
    }
    @Test
    public void testRequiredMessageAboutCVVInAddANewCard() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.getGoItBtn().click();
        homePage.addSignInBtnOnHeader().click();
        homePage.addEmailField().sendKeys("alextymoshenko81@gmail.com");
        homePage.addPasswordField().sendKeys("rterterteywyw");
        homePage.addSignInBtnOnPopUpWindow().click();
        sleep(2);
        homePage.myAccountIcon().click();
        sleep(2);
        homePage.addNewCardBtn().click();
        homePage.addNameOfCardholderField().sendKeys("Симбочка-пимбочка");
        homePage.addCardNumberField().sendKeys("1234123412341234");
        homePage.addOkayBtnInAddNewCard().click();
        sleep(2);
        Assert.assertTrue(homePage.creditCardCVVIsRequiredMessage().isDisplayed());
    }
    @Test
    public void testRequiredMessageAboutCardExpirationDateInAddANewCard() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.getGoItBtn().click();
        homePage.addSignInBtnOnHeader().click();
        homePage.addEmailField().sendKeys("alextymoshenko81@gmail.com");
        homePage.addPasswordField().sendKeys("rterterteywyw");
        homePage.addSignInBtnOnPopUpWindow().click();
        sleep(2);
        homePage.myAccountIcon().click();
        sleep(2);
        homePage.addNewCardBtn().click();
        homePage.addNameOfCardholderField().sendKeys("Симбочка-пимбочка");
        homePage.addCardNumberField().sendKeys("1234123412341234");
        homePage.addCVVField().sendKeys("7777");
        homePage.addOkayBtnInAddNewCard().click();
        sleep(2);
        Assert.assertTrue(homePage.cardExpirationDateIsRequiredMessage().isDisplayed());
    }
    @Test
    public void testRequiredMessageAboutCardAddressInAddANewCard(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.getGoItBtn().click();
        homePage.addSignInBtnOnHeader().click();
        homePage.addEmailField().sendKeys("alextymoshenko81@gmail.com");
        homePage.addPasswordField().sendKeys("rterterteywyw");
        homePage.addSignInBtnOnPopUpWindow().click();
        sleep(2);
        homePage.myAccountIcon().click();
        sleep(2);
        homePage.addNewCardBtn().click();
        homePage.addNameOfCardholderField().sendKeys("Симбочка-пимбочка");
        homePage.addCardNumberField().sendKeys("1234123412341234");
        homePage.addCVVField().sendKeys("7777");
        homePage.addExpDateOnCardField().sendKeys("122022");
        homePage.addOkayBtnInAddNewCard().click();
        sleep(2);
        Assert.assertTrue(homePage.anAddressIsRequiredForThisCreditCardMessage().isDisplayed());
    }
    @Test
    public void testRequiredMessageAboutZipInAddANewCard(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.getGoItBtn().click();
        homePage.addSignInBtnOnHeader().click();
        homePage.addEmailField().sendKeys("alextymoshenko81@gmail.com");
        homePage.addPasswordField().sendKeys("rterterteywyw");
        homePage.addSignInBtnOnPopUpWindow().click();
        sleep(2);
        homePage.myAccountIcon().click();
        sleep(2);
        homePage.addNewCardBtn().click();
        homePage.addNameOfCardholderField().sendKeys("Симбочка-пимбочка");
        homePage.addCardNumberField().sendKeys("1234123412341234");
        homePage.addCVVField().sendKeys("7777");
        homePage.addExpDateOnCardField().sendKeys("122022");
        homePage.addAddressOnCardField().sendKeys("NY");
        homePage.addOkayBtnInAddNewCard().click();
        sleep(2);
        Assert.assertTrue(homePage.aZipCodeIsRequiredForThisCreditCardMessage().isDisplayed());
    }
    @Test
    public void testMessageAboutCardIsInvalidInAddANewCard(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.getGoItBtn().click();
        homePage.addSignInBtnOnHeader().click();
        homePage.addEmailField().sendKeys("alextymoshenko81@gmail.com");
        homePage.addPasswordField().sendKeys("rterterteywyw");
        homePage.addSignInBtnOnPopUpWindow().click();
        sleep(2);
        homePage.myAccountIcon().click();
        sleep(2);
        homePage.addNewCardBtn().click();
        homePage.addNameOfCardholderField().sendKeys("Симбочка-пимбочка");
        homePage.addCardNumberField().sendKeys("1234123412341234");
        homePage.addCVVField().sendKeys("777");
        homePage.addExpDateOnCardField().sendKeys("122022");
        homePage.addAddressOnCardField().sendKeys("NY");
        homePage.addZipField().sendKeys("1234");
        homePage.addOkayBtnInAddNewCard().click();
        sleep(2);
        Assert.assertTrue(homePage.theCardThatWasEnteredIsInvalidMessage().isDisplayed());
    }
    @Test
    public void testDeactivateAccountBtnNoVariant(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.getGoItBtn().click();
        homePage.addSignInBtnOnHeader().click();
        homePage.addEmailField().sendKeys("alextymoshenko81@gmail.com");
        homePage.addPasswordField().sendKeys("rterterteywyw");
        homePage.addSignInBtnOnPopUpWindow().click();
        sleep(2);
        homePage.myAccountIcon().click();
        sleep(2);
        homePage.addDeactevateAccountBtn().click();
        homePage.addNoBtnInDeactivateAccountWindow().click();

        Assert.assertTrue(homePage.myAccountIcon().isDisplayed());
    }
    @Test
    public void testDeactivateAccountBtnYesVariant(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.getGoItBtn().click();
        homePage.addSignInBtnOnHeader().click();
        homePage.addEmailField().sendKeys("alextymoshenko81@gmail.com");
        homePage.addPasswordField().sendKeys("rterterteywyw");
        homePage.addSignInBtnOnPopUpWindow().click();
        sleep(2);
        homePage.myAccountIcon().click();
        sleep(2);
        homePage.addDeactevateAccountBtn().click();
        homePage.addYesBtnInDeactivateAccountWindow().click();
        homePage.addOkayBtnInDeactivatedAccountWindjw().click();

        Assert.assertTrue(homePage.addSignInBtnOnHeader().isDisplayed());
    }
    @Test
    public  void testMessegeAboutRequiredInfoInEditYourInfoBtn(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://eatstreet.com/");
        homePage.getGoItBtn().click();
        homePage.addSignInBtnOnHeader().click();
        homePage.addEmailField().sendKeys("alextymoshenko81@gmail.com");
        homePage.addPasswordField().sendKeys("rterterteywyw");
        sleep(2);
        homePage.addSignInBtnOnPopUpWindow().click();
        sleep(2);
        homePage.myAccountIcon().click();
        sleep(2);
        homePage.addEditYourInfoBtn().click();
//        homePage.addFirstNameFieldInChangeAccountInfoWindow().sendKeys("Clint");
//        homePage.addLastNameFieldInChangeAccountInfoWindow().sendKeys("Eastwood");
//        sleep(2);
//        homePage.addPhoneNumberFieldInChangeAccountInfoWindow().sendKeys("+1 202 679 45 01");
        homePage.addSaveBtnInChangeAccountInfoWindow().click();
        sleep(2);

        Assert.assertTrue(homePage.addRequiredMessegeInChangeAccountInfoWindow().size()==3);
    }
    @Test
    public  void test2MessegeAboutRequiredInfoInEditYourInfoBtn(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://eatstreet.com/");
        homePage.getGoItBtn().click();
        homePage.addSignInBtnOnHeader().click();
        homePage.addEmailField().sendKeys("alextymoshenko81@gmail.com");
        homePage.addPasswordField().sendKeys("rterterteywyw");
        sleep(2);
        homePage.addSignInBtnOnPopUpWindow().click();
        sleep(2);
        homePage.myAccountIcon().click();
        sleep(2);
        homePage.addEditYourInfoBtn().click();
        homePage.addFirstNameFieldInChangeAccountInfoWindow().sendKeys("Clint");
//        homePage.addLastNameFieldInChangeAccountInfoWindow().sendKeys("Eastwood");
//        sleep(2);
//        homePage.addPhoneNumberFieldInChangeAccountInfoWindow().sendKeys("+1 202 679 45 01");
        homePage.addSaveBtnInChangeAccountInfoWindow().click();
        sleep(2);

        Assert.assertTrue(homePage.addRequiredMessegeInChangeAccountInfoWindow().size()==2);
    }
    @Test
    public  void test1MessegeAboutRequiredInfoInEditYourInfoBtn(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://eatstreet.com/");
        homePage.getGoItBtn().click();
        homePage.addSignInBtnOnHeader().click();
        homePage.addEmailField().sendKeys("alextymoshenko81@gmail.com");
        homePage.addPasswordField().sendKeys("rterterteywyw");
        sleep(2);
        homePage.addSignInBtnOnPopUpWindow().click();
        sleep(2);
        homePage.myAccountIcon().click();
        sleep(2);
        homePage.addEditYourInfoBtn().click();
        homePage.addFirstNameFieldInChangeAccountInfoWindow().sendKeys("Clint");
        homePage.addLastNameFieldInChangeAccountInfoWindow().sendKeys("Eastwood");
        sleep(2);
//        homePage.addPhoneNumberFieldInChangeAccountInfoWindow().sendKeys("+1 202 679 45 01");
        homePage.addSaveBtnInChangeAccountInfoWindow().click();
        sleep(2);

        Assert.assertTrue(homePage.addRequiredMessegeInChangeAccountInfoWindow().size()==1);
    }
    @Test
    public  void testAbsentMessegeAboutRequiredInfoInEditYourInfoBtn() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://eatstreet.com/");
        homePage.getGoItBtn().click();
        homePage.addSignInBtnOnHeader().click();
        homePage.addEmailField().sendKeys("alextymoshenko81@gmail.com");
        homePage.addPasswordField().sendKeys("rterterteywyw");
        sleep(2);
        homePage.addSignInBtnOnPopUpWindow().click();
        sleep(2);
        homePage.myAccountIcon().click();
        sleep(2);
        homePage.addEditYourInfoBtn().click();
        homePage.addFirstNameFieldInChangeAccountInfoWindow().clear();
        homePage.addLastNameFieldInChangeAccountInfoWindow().clear();
        homePage.addPhoneNumberFieldInChangeAccountInfoWindow().clear();
        homePage.addFirstNameFieldInChangeAccountInfoWindow().sendKeys("Clint");
        homePage.addLastNameFieldInChangeAccountInfoWindow().sendKeys("Eastwood");
        homePage.addPhoneNumberFieldInChangeAccountInfoWindow().sendKeys("+1 202 679 45 01");
        homePage.addSaveBtnInChangeAccountInfoWindow().click();
        sleep(2);

        Assert.assertTrue(homePage.addRequiredMessegeInChangeAccountInfoWindow().size() == 0);
    }
    @Test
    public  void testMessegeRequiredAboutEMailInfoInEditYourInfoBtn() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://eatstreet.com/");
        homePage.getGoItBtn().click();
        homePage.addSignInBtnOnHeader().click();
        homePage.addEmailField().sendKeys("alextymoshenko81@gmail.com");
        homePage.addPasswordField().sendKeys("rterterteywyw");
        sleep(2);
        homePage.addSignInBtnOnPopUpWindow().click();
        sleep(2);
        homePage.myAccountIcon().click();
        sleep(2);
        homePage.addEditYourInfoBtn().click();
        homePage.addFirstNameFieldInChangeAccountInfoWindow().clear();
        homePage.addLastNameFieldInChangeAccountInfoWindow().clear();
        homePage.addPhoneNumberFieldInChangeAccountInfoWindow().clear();
        homePage.addEMailFieldInChangeAccountInfoWindow().clear();
        homePage.addFirstNameFieldInChangeAccountInfoWindow().sendKeys("Clint");
        homePage.addLastNameFieldInChangeAccountInfoWindow().sendKeys("Eastwood");
        homePage.addPhoneNumberFieldInChangeAccountInfoWindow().sendKeys("+1 202 679 45 01");
        homePage.addSaveBtnInChangeAccountInfoWindow().click();
        sleep(2);
        Assert.assertTrue(homePage.addRequiredMessegeInChangeAccountInfoWindow().size() == 1);
        }
    @Test
    public void testMessegeInvalidAboutEMailInfoInEditYourInfoBtn() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://eatstreet.com/");
        homePage.getGoItBtn().click();
        homePage.addSignInBtnOnHeader().click();
        homePage.addEmailField().sendKeys("alextymoshenko81@gmail.com");
        homePage.addPasswordField().sendKeys("rterterteywyw");
        sleep(2);
        homePage.addSignInBtnOnPopUpWindow().click();
        sleep(2);
        homePage.myAccountIcon().click();
        sleep(2);
        homePage.addEditYourInfoBtn().click();
        homePage.addFirstNameFieldInChangeAccountInfoWindow().clear();
        homePage.addLastNameFieldInChangeAccountInfoWindow().clear();
        homePage.addPhoneNumberFieldInChangeAccountInfoWindow().clear();
        homePage.addEMailFieldInChangeAccountInfoWindow().clear();
        homePage.addFirstNameFieldInChangeAccountInfoWindow().sendKeys("Clint");
        homePage.addLastNameFieldInChangeAccountInfoWindow().sendKeys("Eastwood");
        homePage.addPhoneNumberFieldInChangeAccountInfoWindow().sendKeys("+1 202 679 45 01");
        homePage.addEMailFieldInChangeAccountInfoWindow().sendKeys("11111111111111111111111111111111");
        homePage.addSaveBtnInChangeAccountInfoWindow().click();
        sleep(2);
        Assert.assertTrue(homePage.addInvalidMessegeInChangeAccountInfoWindow().size() == 1);
    }
}