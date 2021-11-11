package Svetlana.EatstreetPage;
import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
public class AllRestsPage extends BasePage {

    public AllRestsPage (WebDriver driver){
            super(driver);
        }
        public List<WebElement> getAllRests() {
            return findElementsByXpath("//li[@ng-repeat='restaurant in $page']");
        }
        public WebElement getTacoRoyale(){
            return findElementByXpath("//a[contains(text(),'Taco Royale - Wausau')]");
        }
        public WebElement getRoyalDeli (){
            return findElementByXpath("//a[contains(text(),'Royal Deli')]");
        }
        public WebElement pressLoadMoreBtn(){
            return findElementByXpath("//button[@class='btn btn--orange']");
        }




    }

