import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage{

    By subtotalItem = By.id("sc-subtotal-label-activecart");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public boolean ifProductAdded() {
        return isDisplayed(subtotalItem);
    }
}
