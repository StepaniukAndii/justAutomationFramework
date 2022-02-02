package SergKokan.Page;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BosonogkiPage extends BasePage {
    public BosonogkiPage(WebDriver driver){
        super(driver);
    }
//    public WebElement btnGenskaya(){
//        return findElementByXpath("//div[@class='header_nav-list_mob']//a[contains(text(), 'ЖІНОЧЕ ВЗУТТЯ')]");
//    }
    public WebElement btnBosonogki(){
        return findElementByXpath("//span[contains(text(), 'Босоніжки')]");
    }

    public WebElement TextBosonogki() {
        return findElementByXpath("//h1[contains(text(), 'Босоніжки')]");
    }
}
