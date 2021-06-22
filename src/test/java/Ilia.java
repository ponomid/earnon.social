import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Ilia {

    @BeforeClass
    public void before() {
        WebDriverManager.chromedriver().setup();
    }

    private WebDriver driver;

    @BeforeMethod
    public void beforeTest() {
        driver = new ChromeDriver();
    }

    @Test
    public void test() {

            driver.get("https://earnon.social");

            WebElement logo = driver.findElement(By.className("logo"));

            Assert.assertEquals(logo.getText(), "Earnon.social");
    }

    @AfterMethod
    public  void afterTest() {
        driver.quit();
    }
}
