package Pages;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage {

    public WebDriver driver;
    public String email;
    public String password;

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//div[@class='StaticLoggedOutHomePage-login']//input[@placeholder='Phone, email, or username']")
    private WebElement loginField;

    @FindBy(xpath = "//div[@class='StaticLoggedOutHomePage-login']//input[@placeholder='Password']")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@class='EdgeButton EdgeButton--secondary EdgeButton--medium submit js-submit']")
    private WebElement loginButton;





    private void typeEmail(String email) {
    sendKeys(loginField, email);
    }

    private void typePassword(String password) {
        sendKeys(passwordField, password);
    }

    private void clickSignIn() {
        clickOnElement(loginButton);
    }

    private void logIn() {
        typeEmail(email);
        typePassword(password);
        clickSignIn();
    }
}

