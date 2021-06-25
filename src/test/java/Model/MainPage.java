package Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {
        super(driver);
        driver.get("https://earnon.social");
    }

    @FindBy(linkText = "Sign In")
    private WebElement signIn;

    public SignInPage clickSignIn(){
        signIn.click();

        return new SignInPage(getDriver());
    }


}