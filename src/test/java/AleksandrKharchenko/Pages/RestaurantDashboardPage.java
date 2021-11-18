package AleksandrKharchenko.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RestaurantDashboardPage extends BasePage {
    public RestaurantDashboardPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getPasswordDashboardField() {
        return driver.findElement(By.xpath("//input[@id='password']"));
    }

    public WebElement getSignInDashboardBtn() {
        return driver.findElement(By.xpath("//button[@id='signin']"));
    }

    public WebElement getDashboardRequiredMSG() {
        return driver.findElement(By.xpath("//div[contains(text(),'Required')]"));
    }

    public WebElement getEmailDashboardField() {
        return driver.findElement(By.xpath("//input[@id='identifier']"));
    }

    public WebElement getPasswordDashboardRequiredMSG() {
        return driver.findElement(By.xpath("//div[@id='password-validation-tag']"));
    }
}