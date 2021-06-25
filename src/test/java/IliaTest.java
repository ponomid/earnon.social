import Base.Base;
import Model.MainPage;
import Model.SignInPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

public class IliaTest extends Base {

    public final String login = "ponomid@ya.ru";
    public final String password = "Smmtool88";

    @Test
    public void testFirst() {

        final String expectedLogoText = "Earnon.social";
        getDriver().get("https://earnon.social");
        WebElement logo = getDriver().findElement(By.className("logo"));
        Assert.assertEquals(logo.getText(), expectedLogoText);
    }

    @Test
    public void testSignIn() {

        SignInPage signInPage = new MainPage(getDriver())
                .clickSignIn()
                .fillEmail(login)
                .fillPassword(password);
    }
}

