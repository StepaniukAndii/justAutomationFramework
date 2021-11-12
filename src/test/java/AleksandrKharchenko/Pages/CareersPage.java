package AleksandrKharchenko.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CareersPage extends BasePage {
    public CareersPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getLinkLearnMore() {
        return driver.findElement(By.xpath("//a[@class='learn-more-link']"));
    }

    public WebElement getTechBtn() {
        return driver.findElement(By.xpath("//label[@for='Tech']"));
    }

    public WebElement getAllLocationsLink() {
        return driver.findElement(By.xpath("//select[contains(@class,'ng-pristine')]"));
    }

    public WebElement getAmesCity() {
        return driver.findElement(By.xpath("//option[contains(text(),'Ames, IA')]"));
    }

    public WebElement getTextInSectionAllJobs() {
        return driver.findElement(By.xpath("//p[contains(text(),'match your search.')]"));
    }
}