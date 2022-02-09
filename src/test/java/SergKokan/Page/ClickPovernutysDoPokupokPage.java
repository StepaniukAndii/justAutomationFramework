package SergKokan.Page;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClickPovernutysDoPokupokPage extends BasePage {
    public ClickPovernutysDoPokupokPage(WebDriver driver){
        super(driver);
    }

    public WebElement getClickPovernutysDoPokupok() {
        return findElement("//a[contains(text(), 'повернутися до покупок')]");
    }
}







