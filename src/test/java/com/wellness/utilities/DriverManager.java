package com.wellness.utilities;


import com.wellness.GoFetch.pojo.BaseUtilityPojo;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverManager {
    private static WebDriver driver;
    private static IOSDriver iosDriver;
    private DesiredCapabilities capabilities;

    public static WebDriver getWebDriver() {
        return driver;
    }

    public static IOSDriver getIosDriver() {
        return iosDriver;
    }

    public void initializeDriver() {
        if (ReadProperty.getProperty("TypeOfExecution").equalsIgnoreCase("Web")) {
            String browser = ReadProperty.getProperty("browser");
            switch (browser) {
                case "Chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    break;
                case "FireFox":
                    break;

            }
        } else if (ReadProperty.getProperty("TypeOfExecution").equalsIgnoreCase("iOS")) {
            capabilities = new DesiredCapabilities();
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iphone 13 Pro");
            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
            capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITEST");
            capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "15.2");
            capabilities.setCapability("bundleId", "com.futurepet.wellnessreactnative");
            capabilities.setCapability("udid", "30C11768-F8FB-4261-A6B5-A4011BA03B22");
            capabilities.setCapability("xcodeOrgId", "X7952LFVM8");
            capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "3000");
            try {
                iosDriver = new IOSDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        } else if (ReadProperty.getProperty("TypeOfExecution").equalsIgnoreCase("Android")) {

        } else if (ReadProperty.getProperty("TypeOfExecution").equalsIgnoreCase("API")) {

        }
    }
}
