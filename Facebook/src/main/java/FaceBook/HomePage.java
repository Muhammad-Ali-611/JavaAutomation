package FaceBook;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HomePage {
public WebDriver driver = null;
    @Test
    public void page(){
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.facebook.com/");
       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       driver.manage().window().maximize();;
       driver.close();
    }
}
