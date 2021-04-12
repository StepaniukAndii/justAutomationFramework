package RozetkaSergey.VijarPages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VijarPages1_4 extends BasePage {

    private String login = "grinred69@gmail.com";
    private String pass = "23112010vi";

    public VijarPages1_4(WebDriver driver) {
        super(driver);
    }

    public void enterToGoogle(String site) {
        driver.get(site);
    }

    public WebElement googleField() {
        return getElement("//input[@class='gLFyf gsfi']");
    }

    public WebElement goToVijar() {
        return getElement(
                "//*[@class='LC20lb DKV0Md' and text()='Вияр - интернет-магазин мебельной фурнитуры. Все ...']");
    }

    public WebElement closeAdverb() {
        return getElement("//img[@src='/img/close_white-24px.svg']");
    }

    public WebElement goToEnter() {
        return getElement("//div[@class='login-in']//a[@id='modal_ancor']");
    }

    public WebElement getLogin() {
        return getElement("//input[@class='flat_input login']");
    }

    public String getterLogin() {
        return login;
    }

    public WebElement getPass() {
        return getElement("//input[@class='flat_input password']");
    }

    public String getterPass() {
        return pass;
    }

    public WebElement clickEnter() {
        return getElement("//input[@class='login_btn']");
    }

}
