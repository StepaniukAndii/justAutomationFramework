import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class TestRozetka extends TestInit{
    @Test
    public void testRozetka() {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        HomePageRozetka homePageRozetka = new HomePageRozetka(driver);
        openUrl("https://rozetka.com.ua");
        homePageRozetka.searchFild().click();
        homePageRozetka.searchFild().sendKeys("холодильник\n");
        homePageRozetka.getRefrigerator().click();
        homePageRozetka.addCart().click();
        Assert.assertTrue((homePageRozetka.findElement("//a[@class='cart-product__title']")).isDisplayed());
    }
}
