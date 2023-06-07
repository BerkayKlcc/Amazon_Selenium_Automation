import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchBox extends BasePage{

    By searchBoxLctr = By.id("twotabsearchtextbox");
    By clickSearch = By.id("nav-search-submit-button");

    public SearchBox(WebDriver driver) {
        super(driver);
    }

    public void search(String text) {
        send(searchBoxLctr, text);
        click(clickSearch);
    }
}
