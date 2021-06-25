package Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends MainPage{

    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(id = "password")
    private WebElement passwordField;

    public SignUpPage fillEmail() {
        emailField.sendKeys("123333333@ya.ru");

        return this;
    }

    public SignUpPage fillPassword() {
        passwordField.sendKeys("Smmtool88");

        return this;
    }
}
