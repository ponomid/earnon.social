import Base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

public class Ilia extends Base {

    @Test
    public void test() {

        final String expectedLogoText = "Earnon.social";
        driver.get("https://earnon.social");
        WebElement logo = driver.findElement(By.className("logo"));
        Assert.assertEquals(logo.getText(), expectedLogoText);
    }

}
