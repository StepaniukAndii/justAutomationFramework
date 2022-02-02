package TestCocaColaByDmitriyUl;

import org.testng.annotations.Test;

public class HomePage extends TestInit{
    @Test
    public void homePage(){
        navigateHomePage();
        closeCookie();
        checkResult();
    }

}
