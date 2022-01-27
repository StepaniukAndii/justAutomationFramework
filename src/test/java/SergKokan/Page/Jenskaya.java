package SergKokan.Page;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Jenskaya extends BasePage {
    public WebElement btnJenskaya(){
        return findElementByXpath("//div[@class='header_nav-list_mob']//a[contains(text(), 'ЖІНОЧЕ ВЗУТТЯ')]");
    }

    public Jenskaya(WebDriver driver) {
        super(driver);

    }

    public WebElement textJenskaya() {
        return findElementByXpath("//h1[contains(text(), 'Жіноче взуття')]");
    }
}
