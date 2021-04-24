package TheInternetHerokuapp;

import ClasesToAllUs.TestInit;
import TheInternetHerokuapp.Locators.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileDownloader extends TestInit {

    Locators locators;
    String token;
    boolean getFile;

    @Test
    public void fileDownloader(){
        locators = new Locators (driver);
        driver.get("http://the-internet.herokuapp.com/");
        locators.fileUpload().click();
        getFile();
        checkFile();
        clickLonden();
    }
    private void clickLonden() {
        String nameFile ="evening.png";
        if (token.contains (nameFile)){
            System.out.println (token + " Загрузило файл");
            getFile = true;
            locators.fileDownloadSubmit().click();
        } else {
            Assert.assertTrue(false);
        }

    }
    private void checkFile() {
        WebElement element = locators.fileDownloadInput();
        token = element.getAttribute ("value");
    }
    private void getFile() {
        By fileInput = By.cssSelector("input[type=file]");
        String filePath = "C:/Users/38068/Downloads/evening.png";
        driver.findElement(fileInput).sendKeys(filePath);
    }
}