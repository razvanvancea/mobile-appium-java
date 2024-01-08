import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class CopyTextToClipboard extends BaseTest{

    @Test
    public void testCopyToClipboard() throws MalformedURLException, InterruptedException {
        driver.findElement(AppiumBy.accessibilityId("Preference")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]")).click();
        driver.findElement(AppiumBy.id("android:id/checkbox")).click();
        driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();

        String alertTitle = driver.findElement(AppiumBy.id("android:id/alertTitle")).getText();
        Assert.assertEquals(alertTitle, "WiFi settings");

        // copy to clipboard - paste to clipboard
        driver.setClipboardText("Razvan"); // ne imaginam ca-l copiem de undeva, trebuie doar sa dam paste ca pas urmator
        driver.findElement(By.id("android:id/edit")).sendKeys(driver.getClipboardText());
        Thread.sleep(3000);

        driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();
    }
}
