import Base.BasePage;
import Base.BaseTest;
import Data.TestData;
import Pages.MainPage;

import org.testng.annotations.Test;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class MainPageTest extends BaseTest {

    private MainPage mainPage;
    private BasePage basePage;
    TestData.User user = TestData.User.correctuser;
    TestData.User incorrectUser = TestData.User.incorrectuser;



    @Test
    public void loginTest() {
        mainPage = new MainPage(getDriver());
        basePage = new BasePage();
        basePage.openURL("https://twitter.com");
//        HomePage homePage = mainPage.logIn(EMAIL, PASSWORD);
        //assertTrue(homePage.isHomePresent(), "Oops! Some troubles(");
        assertTrue(mainPage.logIn(user).isHomePresent());
    }


    @Test
    public void failedLoginTest() {
        mainPage = new MainPage(getDriver());
        basePage = new BasePage();
        basePage.openURL("https://twitter.com");
        mainPage.logIn(incorrectUser);
        assertEquals("The email and password you entered did not match our records. Please double-check and try again.", mainPage.getFailLoginMessageText());
    }
}
