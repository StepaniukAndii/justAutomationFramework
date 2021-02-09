package TestRozetka;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.LinkedList;
import java.util.List;

public class HomePageRozetka extends BasePage {

    public String gools = "Холодильник";

    public HomePageRozetka(WebDriver driver) {
        super(driver);
    }

    public WebElement searchFild() {
        return getElement("//input[@name='search']");
    }

    public WebElement getRefrigerator() {
        return getElement("//span[@class='goods-tile__title']");
    }

    public WebElement addCart() {
        return getElement("//button[@class='buy-button button button_with_icon button_color_green button_size_large']");
    }

    public WebElement getButtonFild() {
        return getElement("//button[@class='button button_color_green button_size_medium search-form__submit']");
    }

    public WebElement filterGamer() {
        return getElement("//a[@class='menu-categories__link js-menu-categories__link menu-categories__link_state_hovered']");
    }

    public WebElement productCatalog() {
        return getElement("//span[@class='menu-toggler__text']");
    }


    public List<WebElement> getElementsRefrigerator() {
        return getElements("//div[@class='goods-tile__inner']/a[contains(@title,'Холодильник')]");
    }

    public void checkCorrectElements() {
        LinkedList<String> listElements = new LinkedList<String>();
        for (WebElement element : getElementsRefrigerator()) {
             listElements.add(element.getAttribute("title"));
        }

        for (String elem : listElements) {
            if (elem.contains("Машина")) {
                System.out.println("");
            } else {
                System.out.println("dfsf");
            }
        }

    }
}
