package Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage extends BaseTest {
    private WebDriver driver;

    public BasePage(){
        driver = getDriver();

    }

    public void sendKeys(By locator, String string) {
        driver.findElement(locator).sendKeys(string);
    }

    public void sendKeys(WebElement element, String string) {
       element.sendKeys(string);
    }

    public void clickOnElement(By locator) {
        driver.findElement(locator).click();
    }
    public void clickOnElement(WebElement element) {
        element.click();
    }

    public void openURL(String URL) {
        driver.get(URL);
    }

}

