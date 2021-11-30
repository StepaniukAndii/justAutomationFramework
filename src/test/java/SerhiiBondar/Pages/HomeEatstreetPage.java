package SerhiiBondar.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomeEatstreetPage extends BasePage {


    public HomeEatstreetPage(WebDriver driver) {
        super(driver);

    }
    public WebElement getSignInBtn(){
        return driver.findElement(By.xpath("//a[@id='menu-signin']"));

    }
    public List<WebElement> getMyAccountBtn(){
        return driver.findElements(By.xpath("//a[@id='menu-my-account']"));

    }
    public WebElement myAccountBtn(){
        return driver.findElement(By.xpath("//a[@id='menu-my-account']"));

    }
    public WebElement getGoItBtn(){
        return  driver.findElement(By.xpath("//button[@class='btn']"));

    }
    public WebElement getPartnerWithUsBtn(){
        return driver.findElement(By.className("partners-link"));

    }
    public WebElement getApplyNowLink(){
        return driver.findElement(By.xpath("//a[contains(text(),'Apply Now')]"));

    }
    public WebElement getCityAppleton(){
        return driver.findElement(By.xpath("//option[contains(text(),'Appleton')]"));

    }
    public WebElement getApplyInYourCityField(){
        return driver.findElement(By.xpath("//select[contains(@onchange, 'location')]"));

    }
    public WebElement getDriverInCityString(){
        return driver.findElement(By.xpath("//span[contains(@class,'page-title')]"));

    }
    public WebElement getCareersBtn(){
        return driver.findElement(By.xpath("//a[@ui-sref='careers']"));

    }
    public WebElement getAllJobsTable(){
        return driver.findElement(By.xpath("//div[@class='careers-listing-container']"));

    }
    public WebElement getBurgers(){
        return driver.findElement(By.xpath("//button[contains(text(),'View all Burger options')]"));

    }
    public WebElement getAtlanta(){
        return driver.findElement(By.xpath("//a[contains(text(),'Atlanta')]"));

    }
    public WebElement getForCustomersLink(){
        return driver.findElement(By.xpath("//a[contains(text(),'For Customers')]"));

    }
    public WebElement getFAQsLink(){
        return driver.findElement(By.xpath("//div[contains(text(),'FAQs')]"));

    }
    public WebElement getGiftCardQuestionLink(){
        return driver.findElement(By.xpath("//h2[contains(text(),'gift card')]"));

    }
    public WebElement getGiftCardQuestion(){
        return driver.findElement(By.xpath("//h1[contains(text(),'gift card')]"));

    }
    public WebElement getAnswer(){
        return driver.findElement(By.xpath("//span[contains(text(),'Answer')]"));

    }
    public WebElement getEnterYourAddressLink(){
        return driver.findElement(By.xpath("//input[@id='input-food-search']"));

    }
    public WebElement getFedBtn(){
        return driver.findElement(By.xpath("//a[@id='find-restaurants']"));

    }
    public List<WebElement> addressSearchAttempModalWindow(){
        return driver.findElements(By.xpath("//div[@class='modal-content']"));

    }
    public WebElement getEnterAddressBtn(){
        return driver.findElement(By.xpath("//a[@id='enter-address-btn']"));

    }
    public void passModalWindow(){
        if (addressSearchAttempModalWindow().size()>0){
            getEnterAddressBtn().click();}
        else{getFedBtn().click();}
    }
    public WebElement getTheAppLink(){
        return driver.findElement(By.xpath("//a[contains(text(),'Get The App')]"));

    }
    public WebElement getLogoBtn(){
        return driver.findElement(By.xpath("//img[@class='logo-alternate']"));

    }
    public WebElement getContactUsLink(){
        return driver.findElement(By.xpath("//a[contains(text(),'Contact Us')]"));

    }
}
