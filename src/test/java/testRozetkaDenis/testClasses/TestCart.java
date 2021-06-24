package testRozetkaDenis.testClasses;

import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;
import testRozetkaDenis.pages.ProductPage;


public class TestCart extends TestInit {

    @Test
    public void cart() {
        ProductPage productPage = new ProductPage(driver);
        openUrl("https://rozetka.com.ua/");
        productPage.headerPageFunctions().searchRozetka().sendKeys("Xiaomi redmi\n");
        //add goods inside cart. Check amount of them
        addFirstThreeElementsInsideCart(productPage);
        sleep(1); //for proper page load
        productPage.headerPageFunctions().cartWithGoods().click();

        Assert.assertEquals(productPage.amountOfGoodsInsideCart().size(), 3);

        //remove goods from cart. Check amount of them
        removeAllElementsFromCart(productPage);
        productPage.modalWindowClose().click();
        //add several goods inside cart, remove one, and then add more elements. Check amount of them
        addFirstThreeElementsInsideCart(productPage);
        productPage.headerPageFunctions().cartWithGoods().click();
        sleep(1); //for proper loading of modal window
        productPage.amountOfGoodsInsideCart().get(0).click();
        productPage.deleteElementIsnideCart().click();
        productPage.modalWindowClose().click();
        productPage.nextPage().click();
        addFirstThreeElementsInsideCart(productPage);
        sleep(1); //for proper page load
        productPage.headerPageFunctions().cartWithGoods().click();

        Assert.assertEquals(productPage.amountOfGoodsInsideCart().size(), 5);

    }

    private void removeAllElementsFromCart(ProductPage productPage) {
        int amountOfElementsInsideCart = productPage.amountOfGoodsInsideCart().size(); //getting more static variable for proper removing
        for (int i = 0; i < amountOfElementsInsideCart; i++) {
            sleep(2); //for proper cart elements update
            productPage.amountOfGoodsInsideCart().get(0).click();
            productPage.deleteElementIsnideCart().click();
        }
    }

    private void addFirstThreeElementsInsideCart(ProductPage productPage) {
        for (int i = 0; i < 3; i++) {
            sleep(1); //for proper adding of elements
            productPage.addToCart().get(i).click();
        }
    }
}
