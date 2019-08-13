import Base.BasePage;
import Base.BaseTest;
import Pages.MainPage;
import org.testng.annotations.Test;

@Test
public class MainPageTest extends BaseTest {

    private MainPage mainPage;
    private BasePage basePage;



    public void loginTest() {
        mainPage = new MainPage(getDriver());
        basePage = new BasePage();
        basePage.openURL("https://twitter.com");
    }
}
