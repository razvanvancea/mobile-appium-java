import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class ScrollGesture  extends BaseTest{

    @Test
    public void testScrollDemo() throws InterruptedException, MalformedURLException {
        driver.findElement(AppiumBy.accessibilityId("Views")).click();

        // scroll until a particlar element is reached
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
        Thread.sleep(2000);

        // second approach, just scroll
//        boolean canScrollMore;
//        do {
//            canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
//                    "left", 100, "top", 100, "width", 200, "height", 200,
//                    "direction", "down",
//                    "percent", 3.0
//            ));
//        } while (canScrollMore);
//        Thread.sleep(2000);


//        scrollToEndAction();
    }
}
