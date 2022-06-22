package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Driver {
    /*
 Creating the private constructor so this class' object
 is not reachable from outside
  */
    private Driver() {
    }


    private static ThreadLocal<WebDriver> driverPool = new ThreadLocal<>();


    public static WebDriver get() {

        if (driverPool.get() == null) {

            synchronized (Driver.class) {

                String browserType = ConfigurationReader.get("browser");

                switch (browserType) {
                    case "chrome":
                        WebDriverManager.chromedriver().setup();
                        driverPool.set(new ChromeDriver());
                        driverPool.get().manage().window().maximize();
                        driverPool.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                        break;
                    case "firefox":
                        WebDriverManager.firefoxdriver().setup();
                        driverPool.set(new FirefoxDriver());
                        driverPool.get().manage().window().maximize();
                        driverPool.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                        break;
                    case "safari":
                        WebDriverManager.safaridriver().setup();
                        driverPool.set(new SafariDriver());
                        driverPool.get().manage().window().maximize();
                        driverPool.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

                    case "chromeSSL":
                        WebDriverManager.chromedriver().setup();
                        ChromeOptions capability = new ChromeOptions();
                        capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
                        capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
                        driverPool.set(new ChromeDriver(capability));
                        driverPool.get().manage().window().maximize();
                        driverPool.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                        break;
                    case "remote-chromeSSL":
                        WebDriverManager.chromedriver().setup();
                        ChromeOptions remoteCapability = new ChromeOptions();
                        remoteCapability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
                        remoteCapability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
                        remoteCapability.setCapability("platform", Platform.ANY);
                        try{
                            driverPool.set(new RemoteWebDriver(new URL("http://18.212.6.39:4444/wd/hub"),remoteCapability));
                        } catch (MalformedURLException e){
                            e.printStackTrace();
                        }
                        driverPool.get().manage().window().maximize();
                        driverPool.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                        break;



                }
            }
        }


        return driverPool.get();


    }

    public static void closeDriver() {
        if (driverPool.get() != null) {
            driverPool.get().quit();
            driverPool.remove();
        }
    }
}
