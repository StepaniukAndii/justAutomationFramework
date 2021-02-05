package TestAmazon.AllTest;

import ClasesToAllUs.TestInit;
import TestAmazon.Pages.CategoryPage.ElectronicsPage;
import TestAmazon.Pages.HomePage.HomePageAmazon;
import org.testng.annotations.Test;

public class TestCategoryElectronics extends TestInit {

    @Test
    public void TestCategoryElectronics(){
        ElectronicsPage electronicsPage = new ElectronicsPage(driver);
        openUrl("https://www.amazon.com/");
        electronicsPage.tapToMenu().click();
        electronicsPage.tapToCategoryElectronics().click();
        sleep(3);
        electronicsPage.tapToCatPortableAudioVideo().click();
        sleep(3);
        electronicsPage.tapToFeatureBrands().click();
    }
}
