import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class Test_Add_Product_To_Cart extends BaseTest{

    HomePage homePage ;
    ProductsPage productsPage ;
    ProductDetailPage productDetailPage ;
    CartPage cartPage ;

    @Test
    @Order(1)
    public void search_product(){
        homePage = new HomePage(driver);
        productsPage = new ProductsPage(driver);
        homePage.acceptCookies();
        homePage.searchBox().search("bebek");
        Assertions.assertTrue(productsPage.isOnProductPage(), "Not on products page!");
    }

    @Test
    @Order(2)
    public void select_product(){
        productsPage = new ProductsPage(driver);
        productDetailPage = new ProductDetailPage(driver);
        productsPage.selectProduct(3);
        Assertions.assertTrue(productDetailPage.isOnProductDetailPage(), "Not on products detail page!");
    }

    @Test
    @Order(3)
    public void add_product_to_cart(){
        productDetailPage = new ProductDetailPage(driver);
        productDetailPage.addToCart();
        Assertions.assertTrue(homePage.isProductCountUp(), "Product count did not increase!");
    }

    @Test
    @Order(4)
    public void go_to_cart(){
        cartPage  = new CartPage(driver);
        homePage = new HomePage(driver);
        homePage.goToCart();
        Assertions.assertTrue(cartPage.ifProductAdded(), "Product was not add to cart!");
    }
}
