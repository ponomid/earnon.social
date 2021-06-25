import Base.Base;
import Model.MainPage;
import Model.SignInPage;
import Model.SignUpPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.reporters.jq.Main;

public class IliaTest extends Base {

    public final String login = "ponomid@ya.ru";
    public final String password = "Smmtool88";

    @Test
    public void firstTest() {

        final String expectedLogoText = "Earnon.social";
        getDriver().get("https://earnon.social");
        WebElement logo = getDriver().findElement(By.className("logo"));
        Assert.assertEquals(logo.getText(), expectedLogoText);
    }

    @Test
    public void signInTest(){
        //not working
        SignInPage signInPage = new MainPage(getDriver())
                .clickSignIn()
                .fillEmail(login)
                .fillPassword(password);
    }

    @Test
    public void signInTestTwo() {
        //not working
        getDriver().get("https://earnon.social");
        getDriver().findElement(By.linkText("Sign In")).click();
        getDriver().findElement(By.xpath("//input[@id='username']")).sendKeys(login);
        getDriver().findElement(By.id("password")).sendKeys(password);
        getDriver().findElement(By.xpath("//button[@name='action']"));
    }

    @Test
    public void signUpTest() {
        //not working
        MainPage mainPage = new MainPage(getDriver());
        mainPage.clickSignUp();

        SignUpPage signUpPage = new SignUpPage(getDriver());
        signUpPage.fillEmail();
        signUpPage.fillPassword();
    }

    @Test
    public void forgotPassTest() {
        //not working
        MainPage mainPage = new MainPage(getDriver());
        mainPage.clickSignIn();

        SignInPage signInPage = new SignInPage(getDriver());
        signInPage.clickForgotPassword();
    }
}

