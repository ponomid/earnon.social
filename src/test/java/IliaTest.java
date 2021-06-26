import Base.Base;
import Model.MainPage;
import Model.SignInPage;
import Model.UspsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

public class IliaTest extends Base {

    public final String login = "morozova.mary";
    public final String password = "erLt-22p/";

//    @Test
//    public void testFirst() {
//
//        final String expectedLogoText = "Earnon.social";
//        getDriver().get("https://earnon.social");
//        WebElement logo = getDriver().findElement(By.className("logo"));
//        Assert.assertEquals(logo.getText(), expectedLogoText);
//    }

    @Test
    public void testSignIn() {
//not working
        UspsPage uspsPage = new MainPage(getDriver())
                .clickSignIn()
                .fillEmail(login)
                .fillPassword(password)
                .clickSubmit();
    }

//    @Test
//    public void testSignInTwo() {
////not working
//        getDriver().get("https://earnon.social");
//        getDriver().findElement(By.linkText("Sign In")).click();
//        getDriver().findElement(By.xpath("//input[@id='username']")).sendKeys(login);
//        getDriver().findElement(By.id("password")).sendKeys(password);
//    }
}

