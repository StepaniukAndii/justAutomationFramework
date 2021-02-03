package AliExpres;

import BasePageAndTestInit.TestInit;
import org.testng.annotations.Test;

public class TestAliExpres extends TestInit {

    @Test

    public void startTest() {
        PageAliExpres pageAliExpres = new PageAliExpres (driver);
        openUrl ("https://allo.ua/ru/kompjutery/");
        pageAliExpres.serchFild ().click ();
        pageAliExpres.serchFild ().sendKeys ("холодильник");
    }
}
