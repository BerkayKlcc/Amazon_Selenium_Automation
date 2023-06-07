import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    SearchBox searchBox;

    By navCartCount =By.id("nav-cart-count");

    By cartContainer = By.id("nav-cart-text-container");

    By acceptCookies = By.id("sp-cc-accept");


    public HomePage(WebDriver driver) {
        super(driver);
        searchBox = new SearchBox(driver);
    }

    public SearchBox searchBox(){
        return this.searchBox;
    }


    public boolean isProductCountUp() {
        return getCartCount() > 0;
    }

    public void goToCart() {
        click(cartContainer);
    }

    private int getCartCount(){
        String count = find(navCartCount).getText();
        return Integer.parseInt(count);
    }

    public void acceptCookies() {
        click(acceptCookies);
    }
}
