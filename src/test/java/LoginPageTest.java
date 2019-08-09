import Base.BasePage;
import Base.BaseTest;
import Pages.LoginPage;
import org.testng.annotations.Test;

@Test
public class LoginPageTest extends BaseTest {

    private  LoginPage loginPage;
    private BasePage basePage;



    public void loginTest() {
        loginPage = new LoginPage(getDriver());
        basePage = new BasePage();
        basePage.openURL("https://twitter.com");
        loginPage.typeEmail();
    loginPage.typePassword();
    loginPage.clickSignIn();
    }
}
