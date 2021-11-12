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

    public WebElement getCulinaryBtn() {
        return driver.findElement(By.xpath("//label[@for='Culinary']"));
    }

    public WebElement getMadisonCity() {
        return driver.findElement(By.xpath("//option[contains(text(),'Madison, WI')]"));
    }

    public WebElement getCurdNerd() {
        return driver.findElement(By.xpath("//span[contains(@class,'record-title')]"));
    }

    public WebElement getSearchJobsField() {
        return driver.findElement(By.xpath("//input[@placeholder='Search Jobs']"));
    }
}