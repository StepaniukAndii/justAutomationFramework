package TestCocaColaByDmitriyUl;

import org.testng.annotations.Test;

public class HomePage extends TestInit{
    @Test
    public void homePage(){
        navigateHomePage();
        closeCookie();
        checkResult();
    }
    @Test
    public void navBar(){
        navigateHomePage();
        closeCookie();
        navigateBar();
        checkResultNavBar();
    }
    @Test
    public void logoTest(){
        navigateHomePage();
        closeCookie();
        navigateBar();
        clickOurBrands();
        clickLogo();
        checkResultLogo();
    }
    @Test
    public void ourBrands() {
        navigateHomePage();
        closeCookie();
        navigateBar();
        clickOurBrands();
    }
}
