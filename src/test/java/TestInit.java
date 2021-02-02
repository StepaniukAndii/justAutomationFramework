import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TestInit {
    WebDriver driver;

    @BeforeTest
    public void setapDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
}
