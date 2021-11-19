package AleksandrKharchenko.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForCustomersPage extends BasePage {
    public ForCustomersPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getGetFedLinkForCustomers(){
        return findElementByXpath("//a[@id='1' and contains(text(),'Get Fed')]");
    }

    public WebElement getContactUsLinkForCustomers() {
        return driver.findElement(By.xpath("//a[@id='9']"));
    }
}
