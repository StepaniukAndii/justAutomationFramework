package TestRozetka;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContacsPageRozetka extends BasePage {

    public ContacsPageRozetka(WebDriver driver) {
        super(driver);
    }

    WebDriverWait wait = new WebDriverWait(driver, 10);

    public WebElement numberRozetkaFirst() {
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='tel:044 537 02 22']")));
    }

    public WebElement numberRozetkaSecond() {
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='tel:044 503 80 80']")));
    }

    public WebElement numberOtherSellers() {
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='tel:044 502 10 79']")));
    }

    public WebElement numberExpertOnTheCall() {
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='tel:044 364 83 65']")));
    }
}
