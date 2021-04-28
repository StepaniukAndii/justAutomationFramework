package RazooM.AlloTest.DemoqaCom;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class DemoqaLocators extends BasePage {
    public DemoqaLocators(WebDriver driver) {
        super (driver);
    }
    public WebElement demoqaElements(){return findElement ("//div[@class='card mt-4 top-card'][1]");}
    public WebElement demoqaBoxText(){return findElement ("//span[text()='Text Box']");}
    public WebElement demoqaName(){return findElement ("//input[@id='userName']");}
    public WebElement demoqaEmail(){return findElement ("//input[@id='userEmail']");}
    public WebElement demoqaAdress(){return findElement ("//textarea[@id='currentAddress']");}
    public WebElement demoqaPermanentAddress(){return findElement ("//textarea[@id='permanentAddress']");}
    public WebElement demoqaButtonSubmit(){return findElement ("//button[@id='submit']");}
    public List<WebElement> demoqaListTextBox(){
        return getElements ("//div[@class='border col-md-12 col-sm-12']/p");
    }
    public WebElement webTables(){return findElement ("//span[text()='Web Tables']");}
    public WebElement webTablesAdd(){return findElement ("//button[@id='addNewRecordButton']");}
    public WebElement webTablesFirstName(){return findElement ("//input[@id='firstName']");}
    public WebElement webTablasLastName(){return findElement ("//input[@id='lastName']");}
    public WebElement webTablasUserEmail(){return findElement ("//input[@id='userEmail']");}
    public WebElement webTablasAge(){return findElement ("//input[@id='age']");}
    public WebElement webTablasSalary(){return findElement ("//input[@id='salary']");}
    public WebElement webTablasDepartement(){return findElement ("//input[@id='department']");}
    public WebElement webTablasSubmit(){return findElement ("//button[@id='submit']");}
    public WebElement webTablasCheckName(){
        return getElement ("//*[text()[contains(.,'Petya')]]");
    }
    public WebElement webTablasSerchBox(){return findElement ("//input[@id='searchBox']");}
    public WebElement webTablasDeleteUser(){return findElement ("//span[@title='Delete']");}
    public WebElement webTablasEditUser(){return findElement ("//span[@id='edit-record-1']");}
    public WebElement demoqaBoxButtons(){return findElement ("//span[text()='Buttons']");}
    public WebElement demoqaBoxDoubleClickBtn(){return findElement ("//button[@id='doubleClickBtn']");}
    public WebElement demoqaBoxRightClickBtn(){return findElement ("//button[@id='rightClickBtn']");}
    public WebElement demoqaBoxOneClickBtn(){return findElement ("//button[@id='i3vfA']");}
}

