package RozetkaSergey;
import ClasesToAllUs.TestInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;

public class UkrNetTest extends TestInit {

    @Test
    public void startUkrNettest() {
        driver.get("https://ukr.net");
        sleep(1);
        WebElement frame =driver.findElement(By.xpath("//iframe[@id='sinoptik_container']"));
        driver.switchTo().frame(frame);
        driver.findElement(By.xpath("//img[@src='//pinformer.sinoptik.ua/img/t.gif']")).click();
        driver.switchTo().defaultContent();
        List<String> windows = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(1));
        driver.findElement(By.xpath("//a[@class='sLogo']")).click();
        driver.findElement(By.xpath("//a[@class='otherCity']")).click();

    }

}
