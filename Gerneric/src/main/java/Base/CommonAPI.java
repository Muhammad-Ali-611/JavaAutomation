package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class CommonAPI {
    public WebDriver driver = null;

    @BeforeMethod
    public void Home() {
        WebDriver driver = new ChromeDriver();
        System.setProperty("WebDriver.ChromeDriver", "C:\\Users\\chma6\\Links\\JavaAutomation\\Driver\\chromedriver.exe");
        driver.get("https://www.google.com/gmail/about/");
        driver.get("https://accounts.google.com/signin/v2/identifier?continue");

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.quit();
    }

    @AfterMethod
    public void clear() {
        driver.close();
    }

}
