package AleksandrKharchenko.Tests;

import AleksandrKharchenko.Pages.HomePage;
import AleksandrKharchenko.Pages.RestBestPage;
import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestBest extends TestInit {

    @Test
    public void checkBlockTarifi() {
        HomePage homePage = new HomePage(driver);
        RestBestPage restBestPage = new RestBestPage(driver);
        openUrl("http://bestline.net.ua/");
        homePage.getBtnTarifi().click();

        Assert.assertEquals(restBestPage.getLinkBagatopoverhivki().getText(), "Багатоповерхівки");
        Assert.assertEquals(restBestPage.getPrivatSector().getText(), "Приватний сектор");
        Assert.assertEquals(restBestPage.getBiznessClientam().getText(), "Бізнес-клієнтам");
    }
}
