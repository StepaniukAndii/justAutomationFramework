import org.testng.annotations.Test;

public class TestAliExpres extends TestInit{

    @Test

    public void startTest(){
         PageAliExpres pageAliExpres =new PageAliExpres (driver);
         driver.get ("https://allo.ua/ru/kompjutery/");
         pageAliExpres.serchFild().click ();
         pageAliExpres.serchFild().sendKeys ("холодильник");
    }

}
