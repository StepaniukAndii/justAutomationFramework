package SergKokan.Page;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DobavitEsheTovarPage extends BasePage {
    public DobavitEsheTovarPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getDobavitEsheTovar() {
        return findElement("//button[contains(text(), 'Продовжити покупки')]");
    }
}
