package Base;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class BasePage {
    private WebDriver driver;


    public BasePage() {
        driver = BaseTest.getDriver();

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


    public  Boolean isElementPresent(WebElement element) {
        try {
            waitForVisibilityOfElement(element, 10);
            element.isDisplayed();
            return true;
        } catch (NoSuchElementException e) {
            return false;

        }
    }

    public void waitForVisibilityOfElement(WebElement element, int time) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, time);
            wait.until(visibilityOf(element));
        } catch (NoSuchElementException e) {

            throw e;
        }
    }
}

