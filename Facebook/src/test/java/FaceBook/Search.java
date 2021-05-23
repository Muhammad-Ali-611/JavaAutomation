package FaceBook;

import Base.CommonAPI;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Search extends CommonAPI {
    @Test

    public void TestSearch(){
        driver.findElement(By.cssSelector(".Search Facebook")).sendKeys("Laptop",Keys.ENTER);
    }
}
