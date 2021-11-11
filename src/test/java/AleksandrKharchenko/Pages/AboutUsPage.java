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

    public WebElement getInTheNewsBtn() {
        return driver.findElement(By.xpath("//button[contains(text(),'In the news')]"));
    }

    public WebElement getInTheNewsShowMoreBtn() {
        return driver.findElement(By.xpath("//button[contains(@class,'visible_focus')]"));
    }

    public WebElement getTextInNewsBtn() {
        return driver.findElement(By.xpath("//button[contains(text(),'Show Less')]"));
    }

    public WebElement getPressReleasesBtn() {
        return driver.findElement(By.xpath("//button[contains(text(),'Press Releases')]"));
    }

    public WebElement getShowMoreBtnPressReleases(){
        return driver.findElements(By.xpath("//button[contains(text(),'Show More')]")).get(1);
    }
}
