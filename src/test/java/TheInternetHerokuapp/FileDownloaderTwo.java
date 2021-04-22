package TheInternetHerokuapp;

import ClasesToAllUs.TestInit;
import TheInternetHerokuapp.Locators.Locators;
import org.testng.annotations.Test;

public class FileDownloaderTwo extends TestInit {

    Locators locators;

    @Test
    public void fileDownloaderTwo(){
        locators = new Locators (driver);
        driver.get("http://the-internet.herokuapp.com/");
        locators.fileUpload().click();
        getFile();
    }
    private void getFile(){
          String filePath = "C:/Users/38068/Downloads/evening.png";
          locators.fileDownloadFild().sendKeys(filePath);
    }
}