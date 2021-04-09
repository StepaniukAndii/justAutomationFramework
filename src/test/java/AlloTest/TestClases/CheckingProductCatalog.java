package AlloTest.TestClases;

import AlloTest.Pages.CheckingProductCatalogLocators;
import AlloTest.Pages.PageHomeAllo;
import ClasesToAllUs.TestInit;
import org.testng.annotations.Test;

import java.util.List;

public class CheckingProductCatalog extends TestInit {

    @Test
    public void checkingProductCatalog(){
        CheckingProductCatalogLocators locators = new CheckingProductCatalogLocators (driver);
        openUrl("https://allo.ua/ru/");

    }
}
