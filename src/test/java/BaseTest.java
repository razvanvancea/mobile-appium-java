import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseTest {
    public AndroidDriver driver;
    public AppiumDriverLocalService service;

    @BeforeClass
    public void configureAppium() throws MalformedURLException {
        // code to automatically start the appium server
        // pt macos rulez 'which appium' si ii aflu calea

        service = new AppiumServiceBuilder().withAppiumJS(new File(
                        "/Users/razvan.vancea/.nvm/versions/node/v18.19.0/lib/node_modules/appium/build/lib/main.js"))
                .withIPAddress("127.0.0.1").usingPort(4723).build();

        service.start();

        // Appium code > appium server > mobile
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Pixel 3 API 31");

        // pe windows pun toate path-urile cu dublu //
        options.setApp("/Users/razvan.vancea/Documents/rv-appium-java-framework/src/test/java/resources/ApiDemos-debug.apk");


        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterClass
    public void tearDown() {

        driver.quit();
        service.stop();
    }
}
