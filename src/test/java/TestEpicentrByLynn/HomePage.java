package TestEpicentrByLynn;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class HomePage extends BasePage {
public HomePage(WebDriver driver) {super(driver);}
    public WebElement popupWindow() {
        return  findElement("//span[@class='_2qGxAC']"); }
    public WebElement searchField() {
        return findElement("//input[@class='field-container__field']");}
    public List<WebElement> buyBtns() {
        return findElementsByXpath("//button[@class='add-product card__button " +
                "btn btn--yellow  js-btn--buy ']");}
    public WebElement continueShopping() {
        return findElement("//button[@class='btn btn--3 btn--white ']");}
    public List<WebElement> priceList() {
        return findElementsByXpath("//p[@class='basket-product__price-main']");}
    public WebElement cartBtn() {
        return findElement("//span[@class='header__cart-icon']");}
}
