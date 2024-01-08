import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
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

        // ce este inainte de / este package name, ce este dupa, este activity name
//        Activity activity = new Activity("io.appium.android.apis", "io.appium.android.apis.ApiDemos");
//        driver.startActivity(activity);

        Thread.sleep(2000);
    }
}
