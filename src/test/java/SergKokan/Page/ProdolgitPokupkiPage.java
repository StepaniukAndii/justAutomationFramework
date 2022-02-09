package SergKokan.Page;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProdolgitPokupkiPage extends BasePage {
    public ProdolgitPokupkiPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getProdolgitPokupki() {
        return findElement("//button[contains(text(), 'Продовжити покупки')]");
    }
}
