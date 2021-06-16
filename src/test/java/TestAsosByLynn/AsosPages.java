package TestAsosByLynn;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class AsosPages extends BasePage {
public AsosPages(WebDriver driver) {super(driver);}

    //TestNewUserRegistration
    public WebElement regIcon() {return getElement("//div[@id='myAccountDropdown']");}
    public List<WebElement> logInOrJoin() {return getElements("//a[@class='_1336dMe _1uUU2Co _1336dMe _1uUU2Co']");}
    public WebElement emailInPut() {return getElement("//input[@id='Email']");}
    public WebElement firsNameInPut() {return getElement("//input[@id='FirstName']");}
    public WebElement lastNameInPut() {return getElement("//input[@id='LastName']");}
    public WebElement passwordInPut() {return getElement("//input[@id='Password']");}
    public WebElement birthDay() {return getElement("//select[@id='BirthDay']");}
    public WebElement birthMonth() {return getElement("//select[@id='BirthMonth']");}
    public WebElement birthYear() {return getElement("//select[@id='BirthYear']");}
    public WebElement regBtn() {return getElement("//input[@id='register']");}
    //TestLogInExistingUser
    public WebElement emailInPutLogInForm() {return getElement("//input[@id='EmailAddress']");}
    public WebElement signInBtn() {return getElement("//input[@id='signin']");}
    public List<WebElement> errorBlock() {return getElements("//div[@class='error-block']");}
    public WebElement logInGreeting() {return getElement("//span[@class='tiqiyps']");}
    //TestCart
    public WebElement searchField() {return getElement("//input[@id='chrome-search']");}
    public List<WebElement> itemsSocks() {return getElements("//a[@class='_3TqU78D']");}
    public WebElement sizeSelect() {return getElement("//select[@data-id='sizeSelect']");}
    public WebElement addToBagBtn() {return getElement("//button[@data-test-id='add-button']");}
    public WebElement cartBtn() {return getElement("//span[@class='_1z5n7CN']");}
    public WebElement nameOfTheChosenProduct() {return getElement("//div[@class='layout-aside']//h1");}
    public WebElement nameOfTheChosenProductInCart() {return getElement("//p[@class='bag-item-name']//a");}
    public WebElement bagLink() {return getElement("//a[@data-test-id='bag-link']");}
    //TestFilters
    public WebElement brandFilter() {return getElement("//li[@data-auto-id='brand']");}
    public List<WebElement> brands() {return getElements("//div[@class='kx2nDmW']");}
    public WebElement selectedBrand() {return getElement("//p[@data-auto-id='selectedFacetValueList']");}
    //TestFieldValidation
    public List<WebElement> emailError() {return getElements("//span[@id='Email-error']");}
    public List<WebElement> firstNameError() {return getElements("//span[@id='FirstName-error']");}
    public List<WebElement> lastNameError() {return getElements("//span[@id='LastName-error']");}
    public List<WebElement> passwordError() {return getElements("//span[@id='Password-error']");}
    public List<WebElement> birthError() {return getElements("//span[@id='BirthYear-error']");}
}
