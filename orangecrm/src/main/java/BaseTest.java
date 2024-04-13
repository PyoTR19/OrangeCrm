//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

    public static WebDriver driver;

    //@SuppressWarnings("deprecation")
    @BeforeTest
    public void setup() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @AfterTest
    public void teardown(){
        driver.close();
    }

}
