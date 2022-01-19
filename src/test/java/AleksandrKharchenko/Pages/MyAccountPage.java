package AleksandrKharchenko.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountPage extends BasePage {
    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getAddNewAddressBtn() {
        return findElementByXpath("//a[@id='add-new-address']");
    }

    public WebElement getAptNumberField() {
        return driver.findElement(By.xpath("//input[@id='aptNumber']"));
    }

    public WebElement getBuildingNameField() {
        return driver.findElement(By.xpath("//input[@id='buildingName']"));
    }

    public WebElement getCityField() {
        return driver.findElement(By.xpath("//input[@id='city']"));
    }

    public WebElement getStateField() {
        return driver.findElement(By.xpath("//input[@id='state']"));
    }

    public WebElement getZipField() {
        return driver.findElement(By.xpath("//input[@id='zip']"));
    }

    public WebElement getAddressLabelField() {
        return driver.findElement(By.xpath("//input[@id='name']"));
    }

    public WebElement getSaveBtnAddress() {
        return driver.findElement(By.xpath("//input[@id='confirm-modal-btn']"));
    }

    public WebElement getStreetAddressRequiredMSG() {
        return findElementByXpath("//div[@id='streetAddress-validation-tag']");
    }

    public WebElement getStreetAddressField() {
        return driver.findElement(By.xpath("//input[@id='streetAddress']"));
    }

    public WebElement getCityRequiredMSG() {
        return driver.findElement(By.xpath("//div[@id='city-validation-tag']"));
    }

    public WebElement getStateRequiredMSG() {
        return driver.findElement(By.xpath("//div[@id='state-validation-tag']"));
    }

    public WebElement getZipRequiredMSG() {
        return driver.findElement(By.xpath("//div[@id='zip-validation-tag']"));
    }
}