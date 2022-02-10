package SergKokan.Page;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ClouseModalWindow extends BasePage {

    public ClouseModalWindow(WebDriver driver) {
        super(driver);
    }

    public WebElement btnClouseModalWindow() {
        return driver.findElement(By.xpath("//div[@id='button_cross']"));
    }
}
