import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class OpenSpecificActivityScreen extends BaseTest{

    @Test
    public void testSpecificActivity() throws MalformedURLException, InterruptedException {
        ((JavascriptExecutor) driver).executeScript("mobile: startActivity", ImmutableMap.of("intent",
                "io.appium.android.apis/io.appium.android.apis.view.Buttons1"));

        Assert.assertTrue(driver.findElement(AppiumBy.accessibilityId("Normal")).isDisplayed());
    }
}
