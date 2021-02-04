import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageRozetka extends BasePage {
    public HomePageRozetka(WebDriver driver) {
        super(driver);
    }

    public WebElement surchFild() {
        return findElement("//input[@name='search']");

    }

    public WebElement getRefrigerator() {
       return findElement("//span[@class='goods-tile__title']");

    }

    public WebElement addInBaskets() {
        return findElement("//button[@class='buy-button button button_with_icon button_color_green button_size_large']");
    }


}
