import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class LongPressGesture extends BaseTest {

    @Test
    public void testLongPressGesture() throws MalformedURLException, InterruptedException {
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Expandable Lists\"]")).click();
        driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
        WebElement elem = driver.findElement(AppiumBy.xpath("//*[@text='People Names']"));
        longPressAction(elem);

        WebElement sampleMenu = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Sample menu\"]"));
        Assert.assertTrue(sampleMenu.isDisplayed());

        Thread.sleep(2000);

    }
}
