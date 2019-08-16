import Base.BasePage;
import Base.BaseTest;
import Pages.MainPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

@Test
public class MainPageTest extends BaseTest {

    private MainPage mainPage;
    private BasePage basePage;
    private final String EMAIL = "tunein.user125@gmail.com";
    private final String PASSWORD = "unein123";



    public void loginTest() {
        mainPage = new MainPage(getDriver());
        basePage = new BasePage();
        basePage.openURL("https://twitter.com");
        mainPage.logIn(EMAIL, PASSWORD);
        assertTrue(mainPage.isHomePresent(), "Oops! Some troubles(");

    }
}
