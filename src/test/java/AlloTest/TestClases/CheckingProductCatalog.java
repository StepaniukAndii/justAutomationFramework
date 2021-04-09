package AlloTest.TestClases;

import AlloTest.Pages.CheckingProductCatalogLocators;
import ClasesToAllUs.TestInit;
import org.testng.annotations.Test;

public class CheckingProductCatalog extends TestInit {

    @Test
    public void checkingProductCatalog(){
        CheckingProductCatalogLocators locators = new CheckingProductCatalogLocators (driver);
        openUrl("https://allo.ua/ru/");

    }
}
