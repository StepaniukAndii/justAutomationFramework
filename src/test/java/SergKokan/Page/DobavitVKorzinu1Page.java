package SergKokan.Page;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DobavitVKorzinu1Page extends BasePage {
    public DobavitVKorzinu1Page(WebDriver driver){
        super(driver);
    }

    public WebElement getClickKorzina() {
        return findElement("//span[@id='cartPreviewTrigger']");
    }
}
