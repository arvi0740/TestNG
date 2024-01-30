import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTestCase {


//    opening the browser
//    login to test
//    closing the browser

    WebDriver driver = new ChromeDriver();
    @Test(priority = 1)
    void setup(){

        System.out.println("starting the browser");

        driver.get("https://practicetestautomation.com/practice-test-login/");
    }

    @Test(priority = 2)
    void login(){

        System.out.println("logging to the test");
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("student");

        driver.findElement(By.id("password")).sendKeys("Password123");
    }

    @Test(priority = 3)
    void closeBrowser(){
        System.out.println("closing the browser");

        driver.quit();
    }
}
