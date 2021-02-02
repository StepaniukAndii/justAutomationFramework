import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageAmazon extends BasePage{

    public HomePageAmazon(WebDriver driver){
        super(driver);
    }

    public WebElement tapToSearchField(){
        return (WebElement) driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
    }
}
