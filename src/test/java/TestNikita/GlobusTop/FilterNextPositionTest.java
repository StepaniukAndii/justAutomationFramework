package TestNikita.GlobusTop;

import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FilterNextPositionTest extends TestInit {

    @Test
    public void filterElements() {
        GlobusPage homepage = new GlobusPage(driver);
        openUrl("https://globus.top/uk");
        homepage.openCatalogBtn().click();
        Assert.assertEquals(homepage.listOfMainFilterElements().size(), 14);
    }
}
