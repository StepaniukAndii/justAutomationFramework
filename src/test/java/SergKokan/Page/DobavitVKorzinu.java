package SergKokan.Page;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DobavitVKorzinu extends BasePage {
    public DobavitVKorzinu(WebDriver driver){
        super(driver);
    }

    public WebElement getDobavitVKorzinu() {
        return findElementByXpath("//div[@class='price-wrap']//span[contains(text(), 'Купити')]");
    }

    public WebElement tovarVKorzine() {
        return findElementByXpath("//h5[@class='cart-dropdown-item__title']");
    }

    public WebElement tovarVKorzine1() {
        return findElementByXpath("//h5[contains(text(), 'Черевики класичні зимові prego')]");
    }
}
