package YevtushenkoVova.Rozetka;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }


    public WebElement input() {
        return findElement("//input[@name=\"q\"]");
    }

    public WebElement homut() {
        return findElement("//div[@class=\"result_p\"]/a[@href=\"/xomut-12-22-mm-nerzhaveyusshij-norma\"]");
    }

    public List<WebElement> btnPay() {
        return findElementsByXpath("//button[@class=\"btn btn-info add\"]");
    }

    public boolean isElementPresent(String locator) {
        List<WebElement> elements = driver.findElements(By.xpath(locator));
        return elements.size() > 15;
    }

    public WebElement signIn() {
        return findElement("//div[@id=\"vhod\"][1]");
    }

    public WebElement inputEmail() {
        return findElement("//input[@name=\"email\"]");
    }

    public void openLPG() {
        driver.get("https://lpgtech.ua/");
    }

    public WebElement btnSignIn() {
        return findElement("//input[@name=\"submit\"]");
    }

    public WebElement inputPassword() {
        return findElement("//input[@name=\"password\"]");
    }

    public WebElement tapKomplectGbo() {
        return findElement("//li/a[@href=\"/komplektu-gbo/\"]");
    }

    public WebElement tapKomplect4Pok() {
        return findElement("//li/a[@href=\"/komplekty-gbo-4-pokoleniya/\"]");
    }

    public WebElement filtreStag() {
        return findElement("//label[@for=\"filter_7\"]");
    }

    public List<WebElement> filterStagYes() {
        return driver.findElements(By.xpath("//img[contains(@title,\" STAG\")]"));
    }

    public boolean isElementPresentFilter() {
        List<WebElement> elements = driver.findElements(By.xpath("//div[@id=\"list_article\"]"));
        return elements.size() > 7;
    }
    public WebElement miniKomplect(){
        return findElement("//a[@href=\"/komplekty-gbo/minikomplekty-gbo-4-pokoleniya-0/\"]");
    }
    public WebElement btnCheckout(){
        return findElement("//button[@class=\"btn btn-info\"][2]");
    }
    public WebElement forsunki(){
        return findElement("//a[@href=\"/forsunki/gazovye-forsunki\"]");
    }
    public WebElement hanaBox(){
        return findElement("//label[@for=\"filter_10\"]");
    }
    public WebElement selectSort(){
        return findElement("//select[@id=\"sort-count\"]");
    }
    public WebElement sort20(){
        return findElement("//option[@value=\"20\"]");
    }
    public WebElement fastOrder(){
        return findElement("//button[@class=\"btn btn-info quick\"]");
    }
    public WebElement barracuda(){
        return findElement("//a[@href=\"/forsunki-barracuda/\"]");
    }
    public WebElement windowPhone(){
        return findElement("//input[@name=\"phone\"]");
    }
}
