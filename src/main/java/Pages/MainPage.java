package Pages;

import Base.BasePage;
import org.jcp.xml.dsig.internal.SignerOutputStream;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage {

    public WebDriver driver;


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
        System.out.println("Sending Email" + email);
        sendKeys(loginField, email);
    }

    private void typePassword(String password) {
        System.out.println("Sending Password" + password);
        sendKeys(passwordField, password);
    }

    private void clickSignIn() {
        System.out.println("Click on Submit button");
        clickOnElement(loginButton);
    }

    public void logIn(String email, String password) {
        typeEmail(email);
        typePassword(password);
        clickSignIn();
    }
}

