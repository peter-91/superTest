import Base.BasePage;
import Base.BaseTest;
import Pages.MainPage;

import org.testng.annotations.Test;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class MainPageTest extends BaseTest {

    private MainPage mainPage;
    private BasePage basePage;
    private final String EMAIL = "tunein.user125@gmail.com";
    private final String PASSWORD = "unein123";


    @Test
    public void loginTest() {
        mainPage = new MainPage(getDriver());
        basePage = new BasePage();
        basePage.openURL("https://twitter.com");
//        HomePage homePage = mainPage.logIn(EMAIL, PASSWORD);
        //assertTrue(homePage.isHomePresent(), "Oops! Some troubles(");
//        assertEquals("Home", homePage.getHomeHeading());
        assertTrue(mainPage.logIn(EMAIL, PASSWORD).isHomePresent());
    }


    @Test
    public void failedLoginTest() {
        mainPage = new MainPage(getDriver());
        basePage = new BasePage();
        basePage.openURL("https://twitter.com");
        mainPage.logIn(EMAIL, PASSWORD);
        assertEquals("Введенные адрес электронной почты и пароль не совпадают с сохраненными в нашей базе данных. Проверьте правильность введенных данных и повторите попытку.", mainPage.getFailLoginMessageText());
    }
}
