import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class OpenSpecificScreenActivity extends BaseTest{

    @Test
    public void testSpecificActivity() throws MalformedURLException, InterruptedException {

        // adb devices in terminal si ma asigur ca emulatorul/telefonul e afisat
        // ma duc in ecranul aplicatiei de la care doresc sa pornesc test case-ul
        // rulez o comanda de terminal
        // macOS: adb shell dumpsys window | grep -E 'mCurrentFocus'
        // windows: adb shell dumpsys window | find "mCurrentFocus"
        // OUTPUT: mCurrentFocus=Window{a51d934 u0 io.appium.android.apis/io.appium.android.apis.ApiDemos}

        ((JavascriptExecutor) driver).executeScript("mobile: startActivity", ImmutableMap.of("intent",
                "io.appium.android.apis/io.appium.android.apis.view.Buttons1"));

        Assert.assertTrue(driver.findElement(AppiumBy.accessibilityId("Normal")).isDisplayed());
    }
}
