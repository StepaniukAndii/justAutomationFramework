package PullRequestsSveta;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WebPlayerPage extends BasePage{
    public WebPlayerPage(WebDriver driver) {
        super(driver);}
    public WebElement webPlayerButton(){
        return findElementByXpath("//a[contains(@data-ga-action, 'play')]");}
    public WebElement searchField(){
        return findElementByXpath("//input[@class='QO9loc33XC50mMRUCIvf Hi9FqPX1LNRRPf31tfA8']");}
    public WebElement artist(){
        return findElementByXpath("//div[@class='_gB1lxCfXeR8_Wze5Cx9']");}
    public WebElement songVideoClub(){
        return findElementByXpath("//div[@class='h4HgbO_Uu1JYg5UGANeQ wTUruPetkKdWAR1dd6w4']");}
    public List<WebElement> albums(){
        return findElementsByXpath("//div[@class='tsv7E_RBBw6v0XTQlcRo']");}
    public WebElement searchButton(){
        return findElementByXpath("//a[contains(@href, '/search')]");}
    public List<WebElement> spotifyPlaylists(){
        return findElementsByXpath("//a[contains(@class, 'MfVrtIzQJ7iZXfRWg6eM')]");}
    public WebElement albumName(){
        return findElementByXpath("//h1[contains(@class, 'Afp2Urf1F4Ub6nHGSF9i')]");}
    public WebElement videoclubName(){
        return findElementByXpath("//h1[contains(@class, 'Afp2Urf1F4Ub6nHGSF9i')]");}
    public List<WebElement> playButton(){
        return findElementsByXpath("//button[@class='IeLnf2wUHVKqxhzBcBoM KOoUMuC7IxI_1Pi4r4m5']");}
    public WebElement listenForFree(){
        return findElementByXpath("//h2[@class='RWLySPhsOTyK2EsAGUgx']");}





}
