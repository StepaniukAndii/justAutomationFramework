package TestCocaColaByDmitriyUl.Page;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavigationBar extends BasePage {
    public NavigationBar(WebDriver driver) {
        super(driver);
    }
    public WebElement golovna() {return findElementByXpath("//a[contains(text(), ' Головна ')]");}
    public WebElement ourBrands() {return findElementByXpath("//a[@href=\"/our-brands\"][contains(text(), 'Наші бренди')]");}
    public WebElement fun() {return findElementByXpath("//a[contains(text(), ' Розважайся ')]");}
    public WebElement liveDrive() {return findElementByXpath("//a[contains(text(), ' Живи драйвово ')]");}
    public WebElement doGood() {return findElementByXpath("//a[contains(text(), ' Змінюй на краще ')]");}
    public WebElement getPrizes() {return findElementByXpath("//a[contains(text(), ' Отримуй призи ')]");}
    public WebElement knowUsBetter() {return findElementByXpath("//a[contains(text(), ' Дізнайся про нас')]");}
}
