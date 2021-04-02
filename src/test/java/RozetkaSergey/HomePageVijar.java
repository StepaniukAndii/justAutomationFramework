package RozetkaSergey;

import ClasesToAllUs.BasePage;
import TestAmazon.Pages.HomePage.HomePageAmazon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageVijar extends BasePage {
    private String login = "grinred69@gmail.com";
    private String pass = "23112010vi";

    public HomePageVijar(WebDriver driver) {
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

    public WebElement getPass() {
         return getElement("//input[@class='flat_input password']");
    }
    public WebElement clickEnter() {
        return getElement("//input[@class='login_btn']");
    }
    public String getterPass() {
        return pass;
    }
    public String getterLogin() {
        return login;
    }
}
