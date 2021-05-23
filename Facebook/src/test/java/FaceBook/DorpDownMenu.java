package FaceBook;

import Base.CommonAPI;
import org.junit.Test;
import org.openqa.selenium.By;

public class DorpDownMenu extends CommonAPI {
@Test
    public void menu() throws InterruptedException {
        driver.findElement(By.cssSelector(".j83agx80 cbu4d94t buofh1pr l9j0dhe7")).click();
        Thread.sleep(2000);
    }
        }
