package SerhiiBondar.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountPageEatstreet extends BasePage {
    public MyAccountPageEatstreet(WebDriver driver) {
        super(driver);
    }
    public WebElement getDeactivateAccountBtn(){
        return driver.findElement(By.xpath("//a[contains (text(),'Deactivate Account')]"));
    }
    public WebElement getDeactivationAccountBtnYes(){
        return driver.findElement(By.xpath("//a[@id='confirm-modal-btn']"));
    }

    public WebElement getOkayBtn() {
        return driver.findElement(By.xpath("//a[@id='confirm-modal-btn']"));
    }
}
