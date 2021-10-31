package Svetlana;

import ClasesToAllUs.BasePage;
import org.kohsuke.rngom.parse.host.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.reporters.jq.BasePanel;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver){
        super(driver);
    }
    public WebElement getAddressInput(){
        return driver.findElement(By.xpath("//input[contains(@class, 'enter-address')]"));
    }
    public WebElement getPressFedBtn(){
        return driver.findElement(By.xpath("//a[contains(@id, 'find-restaurants')]"));
    }
}
