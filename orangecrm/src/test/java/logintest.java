import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class logintest extends BaseTest {

@Test
    public void login() throws InterruptedException{

        Thread.sleep(10000);
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");;
        driver.findElement(By.xpath(("//button[@type='submit']"))).click();


        Thread.sleep(3000);
    
        



    }
}
