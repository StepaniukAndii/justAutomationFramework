package TestRozetkaAndDOU.TestRozetka;

import ClasesToAllUs.TestInit;
import TestRozetkaAndDOU.Pages.ContacsPageRozetka;
import TestRozetkaAndDOU.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import java.util.HashMap;

public class TestContacsRozetka extends TestInit {
    @Test
    public void testContacsRozetka() {
        HashMap<Integer, Boolean> hashMap = new HashMap<>();
        SoftAssert softAssert = new SoftAssert();
        HomePage homePage = new HomePage(driver);
        ContacsPageRozetka contacsPageRozetka = new ContacsPageRozetka(driver);
        openUrl("https://rozetka.com.ua");
        homePage.contacts().click();

        hashMap.put(1,contacsPageRozetka.numberRozetkaSecond().getText().equals("044 503 80 80"));
        hashMap.put(2,contacsPageRozetka.numberOtherSellers().getText().equals("044 502 10 79"));
        hashMap.put(3,contacsPageRozetka.numberExpertOnTheCall().getText().equals("044 364 83 65"));
        boolean a = false;
        for (int i = 1; i < hashMap.size()+1; i++) {
            if (hashMap.get(i)) {
                a=true;
            } else {
                a=false;
                System.out.println(hashMap);
                break;
            }
        }
        Assert.assertTrue(a);
    }
}
