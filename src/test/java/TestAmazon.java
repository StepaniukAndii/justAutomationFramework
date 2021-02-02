import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestAmazon extends TestInit{



    @Test
    public void testCart(){
        HomePageAmazon homePageAmazon = new HomePageAmazon(driver);
        openUrl("https://www.amazon.com/");
        homePageAmazon.tapToSearchField().sendKeys("Caps");
        pushBtnReturn();
    }
}
