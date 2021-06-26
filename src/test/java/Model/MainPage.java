package Model;

import Base.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "login-register-header")
    private WebElement signIn;

    @FindBy(linkText = "Sign Up")
    private WebElement signUp;

    public SignInPage clickSignIn(){
        signIn.click();

        return new SignInPage(getDriver());
    }
}
