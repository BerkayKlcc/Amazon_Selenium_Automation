import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPage extends BasePage {

    By assertSearch = By.cssSelector("[class='a-color-state a-text-bold']");
    By chooseItem = By.cssSelector("span[class='a-size-base-plus a-color-base a-text-normal']");

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductPage() {
        return isDisplayed(assertSearch);
    }

    public void selectProduct(int i) {
        getAllProducts().get(i).click();
    }

    private List<WebElement> getAllProducts(){
        return finds(chooseItem);
    }
}
