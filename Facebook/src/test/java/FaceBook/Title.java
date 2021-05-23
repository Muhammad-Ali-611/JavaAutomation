package FaceBook;

import Base.CommonAPI;
import org.junit.Assert;
import org.junit.Test;

public class Title extends CommonAPI {
@Test
    public void checkTitle(){
        String actualTitle = "(20+) Facebook";
        String expectedTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
    }
}
