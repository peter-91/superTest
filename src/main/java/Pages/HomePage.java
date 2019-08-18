package Pages;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    public WebDriver driver;
    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@data-testid='AppTabBar_Home_Link']")
    private WebElement homeButton;

    @FindBy (xpath = "//*[@id=/'react-root/']/div/div/div/main/div/div[2]/div/div[1]/div/div[1]/div[1]/div/div/div/div/div[1]/div/h2/span]")
    private WebElement homeHeading;


    public Boolean isHomePresent() {
        return isElementPresent(homeButton);
    }

    public String getHomeHeading() {
       return homeHeading.getText();
    }


}
