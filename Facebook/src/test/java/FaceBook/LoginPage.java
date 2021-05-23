package FaceBook;

import Base.CommonAPI;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class LoginPage extends CommonAPI {
  @Test
    public void login(){
        driver.findElement(By.id("email")).sendKeys("alimuzammal611@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("", Keys.ENTER);
    }

}
