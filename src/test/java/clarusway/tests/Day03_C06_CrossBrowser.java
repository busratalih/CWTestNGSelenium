package clarusway.tests;

import clarusway.utilities.BaseCrossBrowserTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day03_C06_CrossBrowser extends BaseCrossBrowserTest {

    //browser bilgisitestng.xml dosyasından alınacagından dolayı kod asamasında herhangi bir degişiklik goruntulenmeyecektir

    @Test
    public void crossBrowserTest() throws InterruptedException {
        driver.get("https://www.google.com/");

        Thread.sleep(3000);
        Assert.assertEquals(driver.getTitle(), "Google");
    }
}
