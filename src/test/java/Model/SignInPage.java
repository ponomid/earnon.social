package Model;

import Base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage {

    @FindBy(id = "username")
    private WebElement emailField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(xpath = "//button[@name='action']")
    private WebElement continueButton;

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

    public void clickContinue() {
        continueButton.click();
    }

}
