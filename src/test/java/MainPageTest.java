import Base.BasePage;
import Base.BaseTest;
import Pages.HomePage;
import Pages.MainPage;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

@Test
public class MainPageTest extends BaseTest {

    private MainPage mainPage;
    private BasePage basePage;
    private final String EMAIL = "tunein.user125@gmail.com";
    private final String PASSWORD = "Tunein123";



    public void loginTest() {
        mainPage = new MainPage(getDriver());
        basePage = new BasePage();
        basePage.openURL("https://twitter.com");
        HomePage homePage = mainPage.logIn(EMAIL, PASSWORD);
        //assertTrue(homePage.isHomePresent(), "Oops! Some troubles(");
        assertEquals("Home", homePage.getHomeHeading());

    }
}
