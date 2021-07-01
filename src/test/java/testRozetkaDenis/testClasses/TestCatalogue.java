package testRozetkaDenis.testClasses;

import ClasesToAllUs.TestInit;
import org.testng.annotations.Test;
import testRozetkaDenis.pages.CataloguePage;

public class TestCatalogue extends TestInit {

    @Test
    public void catalogue() {
        CataloguePage cataloguePage = new CataloguePage(driver);
        openUrl("https://rozetka.com.ua/");
        cataloguePage.categories().get(0).click();
        cataloguePage.detailedCategories().get(0).click();
        checkIfProductsAreValid(cataloguePage);
    }

    private void checkIfProductsAreValid(CataloguePage cataloguePage) {
        for (int i = 0; i < 3; i++) {
            String string = cataloguePage.productPageFunctions().goods().get(i).getText();
            if(string.contains("Ноутбук")) {
                System.out.println("Product is valid.");
            } else {
                System.out.println("Invalid product on specific category!!!");
            }
        }
    }
}
