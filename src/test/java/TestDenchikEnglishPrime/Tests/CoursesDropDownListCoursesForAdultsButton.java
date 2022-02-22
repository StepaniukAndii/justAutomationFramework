package TestDenchikEnglishPrime.Tests;

import ClasesToAllUs.TestInit;
import TestDenchikEnglishPrime.Pages.LandingPageEnglishPrime;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CoursesDropDownListCoursesForAdultsButton extends TestInit {
    LandingPageEnglishPrime landingPageEnglishPrime;
    @Test
    public void coursesDropDownListCoursesForAdultsButton(){
        driver.get("https://englishprime.ua/");
        landingPageEnglishPrime = new LandingPageEnglishPrime(driver);
        WebElement element = landingPageEnglishPrime.navMenuCoursesButton();
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
        landingPageEnglishPrime.coursesDropDownListCoursesForAdultsButton().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("kursy-anglijskogo-dlya-vzroslyh"));
    }
}
