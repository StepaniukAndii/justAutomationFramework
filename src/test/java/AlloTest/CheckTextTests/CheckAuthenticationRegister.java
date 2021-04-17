package AlloTest.CheckTextTests;

import AlloTest.HelpClases.PersonSingIn;
import AlloTest.Pages.PageHomeAllo;
import ClasesToAllUs.TestInit;
import org.testng.annotations.Test;

public class CheckAuthenticationRegister extends TestInit {

    @Test
    public void checkAuthenticationRegister(){
            PageHomeAllo pageHomeAllo = new PageHomeAllo (driver);
            openUrl("https://allo.ua/ru/");
            pageHomeAllo.singIn().click();
            pageHomeAllo.loginTab().click();
            PersonSingIn person = new PersonSingIn ();
            person.setName("Sergey");
            person.setTell ("0682223344");
            person.setEmail ("sergey1234@gmail.com");
            person.setPassword ("qwerty");
            pageHomeAllo.enterName().sendKeys (person.getName());
            pageHomeAllo.enterNumber().sendKeys(person.getTell());
            pageHomeAllo.enterEmail().sendKeys(person.getEmail());
            pageHomeAllo.enterPassword().sendKeys(person.getPassword());
            pageHomeAllo.showPass().click();
    }
}