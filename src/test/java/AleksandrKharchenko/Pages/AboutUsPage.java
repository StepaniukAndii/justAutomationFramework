package AleksandrKharchenko.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AboutUsPage extends BasePage {
    public AboutUsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getAboutUsBtn() {
        return driver.findElement(By.xpath("//button[contains(text(),'About Us')]"));
    }

    public WebElement getTextAboutUs() {
        return driver.findElement(By.xpath("//p[contains(text(),'in the Consumer Technology')]"));
    }

    public WebElement getLeadershipBtn() {
        return driver.findElement(By.xpath("//button[contains(text(),'Leadership')]"));
    }

    public WebElement getTextLeadership() {
        return driver.findElement(By.xpath("//h4[contains(text(),'Matt Howard')]"));
    }
}
