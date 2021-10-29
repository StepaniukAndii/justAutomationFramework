package AleksandrKharchenko;

import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestGit extends TestInit {

    @Test
    public void testEatStreet(){
        openUrl("https://eatstreet.com/");
        Assert.assertEquals(driver.getTitle(),"Order Food Online Near You | EatStreet.com");
    }
}
