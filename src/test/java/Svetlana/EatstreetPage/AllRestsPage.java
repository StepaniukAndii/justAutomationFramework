package Svetlana.EatstreetPage;
import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
public class AllRestsPage extends BasePage {

    public AllRestsPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getAllRests() {
        return findElementsByXpath("//li[@ng-repeat='restaurant in $page']");
    }

    public WebElement getTacoRoyale() {
        return findElementByXpath("//a[contains(text(),'Taco Royale - Wausau')]");
    }

    public WebElement getRoyalDeli() {
        return findElementByXpath("//a[contains(text(),'Royal Deli')]");
    }

    public WebElement pressLoadMoreBtn() {
        return findElementByXpath("//button[@class='btn btn--orange']");
    }

    public List<WebElement> selectCategoryVegetarian() {
        return findElementsByXpath("//label[@for='filter-cuisine-Vegetarian']");
    }
    public List<WebElement> getAllPageRests() {
        return findElementsByXpath("//ul[@class='pagination__pages']//a");
    }
    public List<WebElement> getTypeOfPurchase(){
        return findElementsByXpath("//label[@class='filters_radio_container_label']");
    }
    public WebElement checkAllRests(){
        return findElementByXpath("//p[@class='ng-binding ng-scope']");
    }
    public WebElement getRaiting4(){
        return findElementByXpath("//label[@class='ng-binding']");
    }
    public WebElement getOpenNow(){
        return findElementByXpath("//label[@for='filter-Open Now']");
    }
    public WebElement checkOpenNow(){
        return findElementByXpath("//span[@class='active_filter ng-binding ng-scope']");
    }
    public List<WebElement> getOpenCoffeeAndTea(){
        return findElementsByXpath("//div[@class='cuisine-types__item__image-container']");
    }
    public WebElement checkCoffeeTea(){
        return findElementByXpath("//h1[contains(text(),'Coffee & Tea' )]");
    }

}

