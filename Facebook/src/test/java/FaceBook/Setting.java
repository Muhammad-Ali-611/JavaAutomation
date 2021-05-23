package FaceBook;

import Base.CommonAPI;
import org.junit.Test;
import org.openqa.selenium.By;

public class Setting extends CommonAPI {
    @Test
    public void dropdownSetting(){
        driver.findElement(By.className("j83agx80 l9j0dhe7")).click();
    }
}
