package TestAsosByLynn;

import ClasesToAllUs.TestInit;
import org.testng.annotations.Test;
import java.util.ArrayList;

public class TestFilterBrand extends TestInit {
    @Test
    public void FilterCheck() {
        AsosPages homePage = new AsosPages(driver);
        driver.get("https://www.asos.com/");
        homePage.searchField().sendKeys("socks\n");
        homePage.brandFilter().click();
        homePage.brands().get(106).click();
        String selectedBrand = homePage.selectedBrand().getText();
        ArrayList<String> selectedProducts = new ArrayList<>();
        for (int i = 0; i < homePage.itemsSocks().size(); i++) {
            selectedProducts.add(homePage.itemsSocks().get(i).getText());
            boolean checkBrand = selectedProducts.get(i).contains(selectedBrand);
            System.out.print(checkBrand);
            System.out.println("My name" + checkBrand);
        }
    }
}
