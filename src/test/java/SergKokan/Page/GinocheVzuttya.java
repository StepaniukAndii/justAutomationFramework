package SergKokan.Page;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GinocheVzuttya extends BasePage {
    public GinocheVzuttya(WebDriver driver) {
        super(driver);
    }
    public WebElement tovarVKorzine(){
        return findElement("//div[@class='cart-dropdown-item__img']");
    }

    public WebElement btnGinocheVzuttya() {
        return findElement("//div[@class='footer__column-item']//a[contains(text(), 'ЖІНОЧЕ ВЗУТТЯ')]");
    }
}
