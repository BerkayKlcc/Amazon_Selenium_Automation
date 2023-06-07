import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage{

    By addToCrtLoct = By.cssSelector("input[id='add-to-cart-button']");

    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductDetailPage() {
        return isDisplayed(addToCrtLoct);
    }

    public void addToCart() {
        click(addToCrtLoct);
    }
}
