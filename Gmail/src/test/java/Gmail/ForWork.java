package Gmail;

import Base.CommonAPI;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class ForWork extends CommonAPI {
    @Test
    public void SignIn(){
        driver.findElement(By.id("identifierId")).sendKeys("Chma616@Gmail.com", Keys.ENTER);
        driver.findElement(By.id("password")).sendKeys("",Keys.ENTER);
    }
}
