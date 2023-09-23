package utilities;

import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    private static WindowsDriver driver;
    public static WindowsDriver getDriver() throws IOException {
        if (driver == null) {
            String command = "cmd /c start \"\" \"C:\\Program Files (x86)\\Windows Application Driver\\WinAppDriver.exe\"";
            Runtime.getRuntime().exec(command);
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("app", Paths.get("src").toRealPath() + "\\main\\resources\\" + "QustodioInstaller.exe");
            caps.setCapability("platformName", "Windows");
            caps.setCapability("deviceName", "WindowsPC");
            driver = new WindowsDriver(new URL("http://127.0.0.1:4723"), caps);
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            return driver;
        }
        return driver;
    }
}
