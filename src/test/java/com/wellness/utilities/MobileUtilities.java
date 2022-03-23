package com.wellness.utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class MobileUtilities {
    public static AppiumDriver<MobileElement> MDriver = (AppiumDriver<MobileElement>) DriverManager.getIosDriver();
    static Logger logger = Logger.getLogger(SeleniumUtilities.class);
    static WebDriverWait wait = new WebDriverWait(MDriver, 30);
    static TouchAction touchAction = new TouchAction(MDriver);

    public static void implicitWait(long timer) {
        MDriver.manage().timeouts().implicitlyWait(timer, TimeUnit.SECONDS);
    }

    public static void click(MobileElement element) {
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            element.click();
        } catch (Exception e) {
            throw e;
        }
    }

    public static void setText(MobileElement element, String value) {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(element));
            element.sendKeys(value);
        } catch (Exception e) {
            throw e;
        }
    }

    public static Object scrollToElement(MobileElement element){
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            JavascriptExecutor js = (JavascriptExecutor)MDriver;
            MDriver.executeScript("mobile:scroll", scrollToElement(element));
        } catch (Exception e) {
            throw e;
        }
        return null;
    }

}
