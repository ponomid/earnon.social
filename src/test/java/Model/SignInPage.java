package Model;

import Base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage {

    public final String login = "ponomid@ya.ru";
    public final String password = "Smmtool88";

    @FindBy(id = "username")
    private WebElement emailField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    private WebElement continueButton;

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public void fillEmail() {
        emailField.sendKeys(login);
    }

    public void fillPassword() {
        passwordField.sendKeys(password);
    }

    public void clickContinue() {
        continueButton.click();
    }

}
