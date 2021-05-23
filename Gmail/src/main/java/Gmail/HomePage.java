package Gmail;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class HomePage {
public WebDriver driver = null;
    @Test
    public void Home(){
       WebDriver driver = new ChromeDriver();
        System.setProperty("WebDriver.ChromeDriver","C:\\Users\\chma6\\Links\\JavaAutomation\\Driver\\chromedriver.exe");
        driver.get("https://www.google.com/gmail/about/");
        driver.get("https://accounts.google.com/signin/v2/identifier?continue");
        driver.findElement(By.id("identifierId")).sendKeys("Chma616@Gmail.com", Keys.ENTER);
        driver.findElement(By.id("password")).sendKeys("",Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.quit();
    }
    @AfterMethod
       public void clear(){
        driver.close();
    }
}
