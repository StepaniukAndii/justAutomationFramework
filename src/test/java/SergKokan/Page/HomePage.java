package SergKokan.Page;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver){
        super(driver);
    }
    public WebElement PersonalAccount(){
        return findElementByXpath("//span[contains(text(), 'Особистий кабінет')]");
    }
    public WebElement CloseModalWindow(){
        return findElementByXpath("//a[@class='bingc-active-close-button']");
    }
    public WebElement Dostavka(){
        return findElementByXpath("//div[@class='header-top']//a[contains(text(), 'Доставка')]");
    }
    public WebElement Oplata(){
        return findElementByXpath("//div[@class='header-top']//a[contains(text(), 'Оплата')]");
    }
    public WebElement GarantiaVozvrat(){
        return findElementByXpath("//div[@class='header-top']//a[contains(text(), 'Гарантія та повернення')]");
    }
    public WebElement NashiMagaziny(){
        return findElementByXpath("//div[@class='header-top']//a[contains(text(), 'Наші магазини')]");
    }
    public WebElement Blog(){
        return findElementByXpath("//div[@class='header-top']//a[contains(text(), 'Блог')]");
    }
    public WebElement Obrane(){
        return findElementByXpath("//span[contains(text(), 'Обране')]");
    }
    public WebElement Korzina(){
        return findElementByXpath("//span[@id='cartPreviewTrigger']");
    }

}
