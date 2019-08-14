import Base.BasePage;
import Base.BaseTest;
import Pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

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
        mainPage.logIn(EMAIL, PASSWORD);

    }
}
