package Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends MainPage {

    @FindBy(xpath = "//input[@id='username']")
    private WebElement emailField;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordField;

    @FindBy(id = "btn-submit")
    private WebElement submit;

    @FindBy(linkText = "Forgot password?")
    private WebElement forgotPassButton;

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public SignInPage fillEmail(String value) {
        emailField.sendKeys(value);
        return this;
    }

    public SignInPage fillPassword(String value) {
        passwordField.sendKeys(value);
        return this;
    }

    public UspsPage clickSubmit() {

        submit.click();
        return new UspsPage(getDriver());
    }

}
