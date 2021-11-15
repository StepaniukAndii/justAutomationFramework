package AleksandrKharchenko.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FoodPage extends BasePage {
    public FoodPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getAddAnyFood() {
        return driver.findElement(By.xpath("//section[@class=\"li li--menu ng-scope\"]"));
    }

    public WebElement getJapaneseFoodVegasBtn() {
        return driver.findElement(By.xpath("//button[contains(text(),'Japanese Food')]"));
    }
}