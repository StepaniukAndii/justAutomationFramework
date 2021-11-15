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
    public WebElement getApplyNowString(){
        return driver.findElement(By.xpath("//a[contains(text(),'Apply Now')]"));

    }
    public WebElement getCityAppleton(){
        return driver.findElement(By.xpath("//option[contains(text(),'Appleton')]"));

    }
    public WebElement getApplyInYourCityField(){
        return driver.findElement(By.xpath("//select[contains(@onchange, 'location')]"));

    }
    public WebElement getDriverAppletonString(){
        return driver.findElement(By.xpath("//span[contains(@class,'page-title')]"));

    }
    public WebElement getCareersBtn(){
        return driver.findElement(By.xpath("//a[@ui-sref='careers']"));

    }
    public WebElement getAllJobsTable(){
        return driver.findElement(By.xpath("//div[@class='careers-listing-container']"));

    }

}
