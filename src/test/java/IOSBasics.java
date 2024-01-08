import io.appium.java_client.AppiumBy;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class IOSBasics extends IOSBaseTest {

    @Test
    public void testIosBasics() throws MalformedURLException {


        // xpath, classname, IOS, iosClassChain, IOSPredicateString, accessibility id, id

        driver.findElement(AppiumBy.accessibilityId("Alert Views")).click();

    }
}
