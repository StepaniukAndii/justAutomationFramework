package TestAmazon.Pages.CategoryPage;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ElectronicsPage extends BasePage {

    public ElectronicsPage(WebDriver driver) {
        super(driver);
    }
    public WebElement tapToMenu() {
        return getElement("//a[@id='nav-hamburger-menu']");
    }
    public WebElement tapToCategoryElectronics() {
        return getElement("//a[@data-menu-id='5']");
    }
    public WebElement tapToCatPortableAudioVideo() {
        return getElement("//*[contains(@href, '/s?bbn=16225009011&rh=i%3Aspecialty-aps%2Cn%3A%2116225009011%2Cn%3A172623&ref_=nav_em__nav_desktop_sa_intl_portable_audio_and_video_0_2_5_11')]");
    }
    public WebElement tapToFeatureBrands() {
        return getElement("//li[@id='p_89/TOZO']");
    }

    public List<WebElement> getResultList() {
        return getElements("//div[@class='s-expand-height s-include-content-margin s-border-bottom s-latency-cf-section']");
    }
}
