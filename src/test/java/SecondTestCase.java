import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTestCase {

    WebDriver driver = new ChromeDriver();
    @Test(priority = 1)
    void setup2(){

        System.out.println("starting the browser");

        driver.get("https://practicetestautomation.com/practice-test-login/");
    }

    @Test(priority = 2)
    void login2(){

        System.out.println("logging to the test");
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("student");
        String text= userName.getText();
        driver.findElement(By.id("password")).sendKeys("password123");

        String text2 = "";

        Assert.assertEquals(text2,text);
    }

    @Test(priority = 3)
    void closeBrowser2(){
        System.out.println("closing the browser");

        driver.quit();
    }
}
