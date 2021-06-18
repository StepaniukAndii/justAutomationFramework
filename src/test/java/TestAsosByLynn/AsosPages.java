package TestAsosByLynn;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class AsosPages extends BasePage {
public AsosPages(WebDriver driver) {super(driver);}

    //TestNewUserRegistration
    public WebElement regIcon() {return findElementByXpath("//div[@id='myAccountDropdown']");}
    public List<WebElement> logInOrJoin() {return findElementsByXpath("//a[@class='_1336dMe _1uUU2Co _1336dMe _1uUU2Co']");}
    public WebElement emailInPut() {return findElementByXpath("//input[@id='Email']");}
    public WebElement firsNameInPut() {return findElementByXpath("//input[@id='FirstName']");}
    public WebElement lastNameInPut() {return findElementByXpath("//input[@id='LastName']");}
    public WebElement passwordInPut() {return findElementByXpath("//input[@id='Password']");}
    public WebElement birthDay() {return findElementByXpath("//select[@id='BirthDay']");}
    public WebElement birthMonth() {return findElementByXpath("//select[@id='BirthMonth']");}
    public WebElement birthYear() {return findElementByXpath("//select[@id='BirthYear']");}
    public WebElement regBtn() {return findElementByXpath("//input[@id='register']");}
    //TestLogInExistingUser
    public WebElement emailInPutLogInForm() {return findElementByXpath("//input[@id='EmailAddress']");}
    public WebElement signInBtn() {return findElementByXpath("//input[@id='signin']");}
    public List<WebElement> errorBlock() {return findElementsByXpath("//div[@class='error-block']");}
    public WebElement logInGreeting() {return findElementByXpath("//span[@class='tiqiyps']");}
    //TestCart
    public WebElement searchField() {return findElementByXpath("//input[@id='chrome-search']");}
    public List<WebElement> itemsSocks() {return findElementsByXpath("//a[@class='_3TqU78D']");}
    public WebElement sizeSelect() {return findElementByXpath("//select[@data-id='sizeSelect']");}
    public WebElement addToBagBtn() {return findElementByXpath("//button[@data-test-id='add-button']");}
    public WebElement cartBtn() {return findElementByXpath("//span[@class='_1z5n7CN']");}
    public WebElement nameOfTheChosenProduct() {return findElementByXpath("//div[@class='layout-aside']//h1");}
    public WebElement nameOfTheChosenProductInCart() {return findElementByXpath("//p[@class='bag-item-name']//a");}
    public WebElement bagLink() {return findElementByXpath("//a[@data-test-id='bag-link']");}
    //TestFilters
    public WebElement brandFilter() {return findElementByXpath("//li[@data-auto-id='brand']");}
    public List<WebElement> brands() {return findElementsByXpath("//div[@class='kx2nDmW']");}
    public WebElement selectedBrand() {return findElementByXpath("//p[@data-auto-id='selectedFacetValueList']");}
    //TestFieldValidation
    public List<WebElement> emailError() {return findElementsByXpath("//span[@id='Email-error']");}
    public List<WebElement> firstNameError() {return findElementsByXpath("//span[@id='FirstName-error']");}
    public List<WebElement> lastNameError() {return findElementsByXpath("//span[@id='LastName-error']");}
    public List<WebElement> passwordError() {return findElementsByXpath("//span[@id='Password-error']");}
    public List<WebElement> birthError() {return findElementsByXpath("//span[@id='BirthYear-error']");}
}
