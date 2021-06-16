package RazooM.AlloTest.DemoqaCom;

import ClasesToAllUs.TestInit;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTables extends TestInit {

    DemoqaLocators locators;
    boolean booleonName;

    @Test
    public void webTables(){
        locators = new DemoqaLocators (driver);
        driver.get ("https://demoqa.com/");
        locators.demoqaElements().click();
        locators.webTables().click();
        addInformanions();
        chechAddNewUser();
        serchNewUser();
        editName();
    }
    private void editName() {
        WebElement input = locators.webTablasSerchBox();
        input.sendKeys(Keys.CONTROL + "a");
        input.sendKeys(Keys.DELETE);
        locators.webTablasEditUser().click();
        locators.webTablesFirstName().clear();
        locators.webTablesFirstName().sendKeys("Petya");
        locators.demoqaButtonSubmit().click();
        chechAddNewUser();
    }
    private void serchNewUser() {
        locators.webTablasSerchBox().sendKeys("Petya");
        enter();
        chechAddNewUser();
        if(booleonName){
            deleteUser ();
        } else {
            Assert.assertEquals (booleonName, true);
        }
    }
    private void deleteUser() {
        locators.webTablasDeleteUser().click();
    }
    private void chechAddNewUser() {
      WebElement element = locators.webTablasCheckName();
      String name = element.getText ();
      String checkName = "Petya";
        Assert.assertEquals (name, checkName);
        if(name.equals (checkName)){
            booleonName = true;
        }
    }
    private void addInformanions() {
        locators.webTablesAdd().click();
        locators.webTablesFirstName().sendKeys("Petya");
        locators.webTablasLastName().sendKeys("Tetrovich");
        locators.webTablasUserEmail().sendKeys("qwerty@gmail.com");
        locators.webTablasAge().sendKeys("16");
        locators.webTablasSalary().sendKeys("2500");
        locators.webTablasDepartement().sendKeys("Itichnik");
        locators.webTablasSubmit().click();
    }
}