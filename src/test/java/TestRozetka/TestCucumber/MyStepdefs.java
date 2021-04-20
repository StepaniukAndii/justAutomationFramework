package TestRozetka.TestCucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepdefs {

    WebDriver driver;

    @Given("Launch the browser")
    public void launchTheBrowser() {
        System.setProperty("webdriver.chrome.driver", "src/test/drivers/chromedriver_88_linux");
        driver = new ChromeDriver();
    }

    @When("Open browser")
    public void openBrowser() {
        driver.get("https://google.com");
    }

    @And("Enter {string} in the search text box.")
    public void enterInTheSearchTextBox(String arg0) {
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(arg0+"\n");
    }

    @Then("Close Browser")
    public void closeBrowser() {
        driver.quit();
    }
}
