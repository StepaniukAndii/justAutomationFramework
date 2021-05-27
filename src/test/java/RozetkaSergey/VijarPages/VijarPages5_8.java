package RozetkaSergey.VijarPages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class VijarPages5_8 extends BasePage {
    private String login = "grinred69@gmail.com";
    private String pass = "23112010vi";

    public VijarPages5_8(WebDriver driver) {
        super(driver);
    }

    public void enterToVijar(String site) {
        driver.get(site);
    }

    public WebElement closeAdverb() {
        return findElementByXpath("//img[@src='/img/close_white-24px.svg']");
    }

    public WebElement findSearchFiel() {
        return findElementByXpath("//input[@id='title-search-input']");
    }

    public WebElement clickOnFind() {
        return findElementByXpath("//input[@name='s' and @value='Найти' ]");
    }

    public List<WebElement> getElementsEgger() {
        return findElementsByXpath("//div[@class='product_prewiew']/a");
    }

    public WebElement clickToOpenFindPhonNumber() {
        return findElementByXpath("//*[@id=\"site_panel\"]/header/nav[2]/ul/li[7]/a");
    }

    public WebElement chosePhone() {
        return findElementByXpath("//p[@class='work_time']//a[@class='c-tel']");
    }

    public WebElement switchToUa() {
        return findElementByXpath("//a[@href='/ua/']");
    }

    public WebElement scrollDown() {
        return findElementByXpath("//button[@class='proezd']");
    }

    public WebElement scrollFastUpButton() {
        return findElementByXpath("//img[@src='/img/up.svg']");
    }

    public WebElement goToEnter() {
        return findElementByXpath("//div[@class='login-in']//a[@id='modal_ancor']");
    }

    public WebElement getLogin() {
        return findElementByXpath("//input[@class='flat_input login']");
    }

    public WebElement getPass() {
        return findElementByXpath("//input[@class='flat_input password']");
    }

    public WebElement clickEnter() {
        return findElementByXpath("//input[@class='login_btn']");
    }

    public String getterLogin() {
        return login;
    }

    public String getterPass() {
        return pass;
    }

    public WebElement goToProfil() {
        return findElementByXpath("//div[@id='comp_3d516dd61c87243ff4c44464480b12fd']");
    }

    public WebElement getSurname() {
        return findElementByXpath("//input[@placeholder='Фамилия']");
    }

    public WebElement getName() {
        return findElementByXpath("//input[@placeholder='Имя']");
    }

}
