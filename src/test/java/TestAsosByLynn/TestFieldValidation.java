package TestAsosByLynn;

import ClasesToAllUs.TestInit;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

 public class TestFieldValidation extends TestInit {
        @Test
        public void FieldValidationRegForm() {
            AsosPages homePage = new AsosPages(driver);
            driver.get("https://my.asos.com/identity/register?lang=en-GB&store=ROW&country=UA&keyStoreDataversion=hnm9sjt-28&returnUrl=https%3A%2F%2Fwww.asos.com%2F");
            homePage.regBtn().click();

            Assert.assertTrue(homePage.emailError().size()>0);
            homePage.emailInPut().sendKeys("annamilton@gmail.com");
            Assert.assertEquals(driver.findElements(By.xpath("//span[@id='Email-error']")).size(),0);

            Assert.assertTrue(homePage.firstNameError().size()>0);
            homePage.firsNameInPut().sendKeys("Anna");
            Assert.assertTrue(driver.findElements(By.xpath("//span[@id='FirstName-error']")).size()==0);

            Assert.assertTrue(homePage.lastNameError().size()>0);
            homePage.lastNameInPut().sendKeys("Milton");
            Assert.assertTrue(driver.findElements(By.xpath("//span[@id='LastName-error']")).size()==0);

            Assert.assertTrue(homePage.passwordError().size()>0);
            homePage.passwordInPut().sendKeys("password_anna_98");
            Assert.assertTrue(driver.findElements(By.xpath("//span[@id='Password-error']")).size()==0);

            Assert.assertTrue(homePage.birthError().size()>0);
            Select birthDay = new Select(homePage.birthDay());
            birthDay.selectByIndex(26);
            Select birthMonth = new Select(homePage.birthMonth());
            birthMonth.selectByIndex(11);
            Select birthYear = new Select(homePage.birthYear());
            birthYear.selectByIndex(26);
            Assert.assertTrue(driver.findElements(By.xpath("//span[@id='BirthYear-error']")).size()==0);
        }
    }

