import Base.Base;
import Model.MainPage;
import Model.SignInPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

public class Ilia extends Base {

    public final String login = "ponomid@ya.ru";
    public final String password = "Smmtool88";

    @Test
    public void test() {

        final String expectedLogoText = "Earnon.social";
        driver.get("https://earnon.social");
        WebElement logo = driver.findElement(By.className("logo"));
        Assert.assertEquals(logo.getText(), expectedLogoText);
    }

    @Test
    public void signInTest(){

        SignInPage signInPage = new MainPage(driver)
                .clickSignIn()
                .fillEmail(login)
                .fillPassword(password);
    }

    @Test
    public void signInTest2() {

        driver.get("https://earnon.social");
        driver.findElement(By.linkText("Sign In")).click();
    }
}
