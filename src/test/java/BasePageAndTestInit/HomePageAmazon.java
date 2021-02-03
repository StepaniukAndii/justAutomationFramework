package BasePageAndTestInit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePageAmazon extends BasePage{

    public HomePageAmazon(WebDriver driver){
        super(driver);
    }
    public WebElement tapToSearchField(){
        return driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
    }
    public WebElement addItemToCard() {
        return driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
    }
    public WebElement chooseSize() {
        return driver.findElement
                (By.xpath("//span[@id='dropdown_selected_size_name']"));
    }
    public WebElement chooseSizeLargeX(){
        return driver.findElement(By.xpath("//a[@id='native_dropdown_selected_size_name_4']"));
    }
    public List<WebElement> chooseItem() {
        return driver.findElements(By.xpath("//div[@class='a-section aok-relative s-image-square-aspect']"));
    }

    public WebElement openCard() {
        return driver.findElement(By.xpath("//a[@id='hlb-view-cart-announce']"));
    }

    public List<WebElement> itemsInCard() {
        return driver.findElements(By.xpath("//div[@style='padding-left:190px']"));
    }
}
