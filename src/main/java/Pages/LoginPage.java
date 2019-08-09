package Pages;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    public WebDriver driver;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//div[@class='StaticLoggedOutHomePage-login']//input[@placeholder='Phone, email, or username']")
    private WebElement loginField;

    @FindBy(xpath = "//div[@class='StaticLoggedOutHomePage-login']//input[@placeholder='Password']")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@class='EdgeButton EdgeButton--secondary EdgeButton--medium submit js-submit']")
    private WebElement loginButton;



    }

    public void typeEmail() {
    sendKeys(loginField, "tunein.user125@gmail.com");
    }

    public void typePassword() {
        sendKeys(passwordField, "Tunein123");
    }

    public void clickSignIn() {
        clickOnElement(loginButton);
    }

}

