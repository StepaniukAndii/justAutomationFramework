package TestCocaColaByDmitriyUl.Page;

import ClasesToAllUs.BasePage;
import ClasesToAllUs.TestInit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage  extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }
    public void navigateHomePage() {driver.get("https://www.coca-cola.ua/");}
    public WebElement closeCookie() {return findElementByXpath("//button[contains(text(), 'Відхилити все')]");}
    public WebElement navigateBar() {return findElementByXpath("//div[@class=\"navbar-toggler collapsed\"]");}
    public WebElement clickLogo() {return findElementByXpath("//img[@class=\"d-none d-lg-block\"]\n");}
}
