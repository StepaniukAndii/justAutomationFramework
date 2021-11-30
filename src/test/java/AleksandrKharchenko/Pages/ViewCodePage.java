package AleksandrKharchenko.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.swing.*;

public class ViewCodePage extends BasePage {
    public ViewCodePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getLockImages() {
        return findElementByXpath("//img[@style='vertical-align: middle']");
    }

    public WebElement getProtectedLink() {
        return findElementByXpath("//a[@title='Википедия:Правила защиты страниц']");
    }

    public WebElement getAdministratorsLink() {
        return findElementByXpath("//a[@title='Википедия:Администраторы']");
    }

    public WebElement getEngineersLink() {
        return findElementByXpath("//a[@title='Википедия:Инженеры']");
    }

    public WebElement getTemplatesLink() {
        return findElementByXpath("//a[@title='Википедия:Шаблоны']");
    }

    public WebElement getEditWarsLink() {
        return findElementByXpath("//a[@title='Википедия:Война правок']");
    }

    public WebElement getProtectionLogLink() {
        return findElementByXpath("//a[@class='external text']");
    }

    public WebElement getDiscussThisPageLink() {
        return findElementByXpath("//a[@title='Обсуждение:Заглавная страница']");
    }

    public WebElement getAddLinkViewCode() {
        return findElementByXpath("//a[@title='Служебная:NewSection/Обсуждение:Заглавная страница']");
    }

    public WebElement getOfferToRemoveProtectionLink() {
        return findElementByXpath("//a[@title='Википедия:Снятие защиты']");
    }

    public WebElement getEditprotectedLink() {
        return findElementByXpath("//a[@title='Шаблон:Editprotected']");
    }

    public WebElement getVerifierWikiBtn() {
        return findElementByXpath("//a[@rel='wikificator']");
    }

    public WebElement getBoldWikiBtn() {
        return findElementByXpath("//a[@title='Полужирный']");
    }

    public WebElement getItalicsWikiBtn() {
        return findElementByXpath("//a[@title='Курсив']");
    }

    public WebElement getLinkWikiBtn() {
        return findElementByXpath("//a[@title='Ссылка']");
    }

    public WebElement getImagesAndMediaWikiBtn() {
        return findElementByXpath("//a[@title='Изображения и медиафайлы']");
    }

    public WebElement getFootnoteWikiBtn() {
        return findElementByXpath("//a[@title='Сноска']");
    }

    public WebElement getSyntaxHighlightingWikiBtn() {
        return findElementByXpath("//a[@title='Подсветка синтаксиса']");
    }

    public WebElement getAdditionallyWikiLink() {
        return findElementByXpath("//a[@aria-controls='wikiEditor-section-advanced']");
    }

    public WebElement getSpecialCharactersWikiLink() {
        return findElementByXpath("//a[@aria-controls='wikiEditor-section-characters']");
    }

    public WebElement getReferenceWikiLink() {
        return findElementByXpath("//a[@aria-controls='wikiEditor-section-help']");
    }
}