package com.wellness.utilities;

import com.wellness.GoFetch.pojo.BaseUtilityPojo;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class SeleniumUtilities {
    public static WebDriver driver = BaseUtilityPojo.getDriver ( );
    static Logger logger = Logger.getLogger ( SeleniumUtilities.class );
    static WebDriverWait wait = new WebDriverWait ( driver, 30 );
    static Robot robot;
    static JavascriptExecutor javascriptException = (JavascriptExecutor)driver;

    SeleniumUtilities ( ) {
        try {
            robot = new Robot ( );
        } catch ( AWTException e ) {
        }

    }

    public static void getUrl ( String url ) {
        try {
            driver.get ( url );
        } catch ( Exception e ) {
            logger.info ( "Failed to launch the url : " + e.getMessage ( ) );
            throw e;
        }
    }

    public static void click ( WebElement element ) {
        try {
            wait.until ( ExpectedConditions.elementToBeClickable ( element ) );
            element.click ( );
        } catch ( Exception e ) {
            logger.info ( "Failed to click on the " + element + " : " + e.getMessage ( ) );
            throw e;
        }
    }

    public static void clickJs ( WebElement element ) {
        try {
            javascriptException.executeScript ( "arguments[0].click();", element);
        } catch ( Exception e ) {
            logger.info ( "Failed to click on the " + element + " : " + e.getMessage ( ) );
            throw e;
        }
    }

    public static void setText ( WebElement element, String text ) {
        try {
            wait.until ( ExpectedConditions.elementToBeClickable ( element ) );
            element.clear ( );
            element.sendKeys ( text );
        } catch ( Exception e ) {
            logger.info ( "Failed to click on the " + element + " : " + e.getMessage ( ) );
            throw e;
        }
    }

    public static void implicitWait ( int timeInSec ) {
        try {
            driver.manage ( ).timeouts ( ).implicitlyWait ( timeInSec, TimeUnit.SECONDS );
        } catch ( Exception e ) {
            throw e;
        }
    }

    public static void defaultTimeOut ( ) {
        try {
            driver.manage ( ).timeouts ( ).implicitlyWait ( 1, TimeUnit.SECONDS );
        } catch ( Exception e ) {
            throw e;
        }
    }

    public static void pressEnter ( ) {
        try {
            Thread.sleep ( 8000 );
            robot.keyPress ( KeyEvent.VK_PAGE_DOWN );
            robot.keyRelease ( KeyEvent.VK_PAGE_DOWN );
            robot.keyPress ( KeyEvent.VK_ENTER );
            Thread.sleep ( 500 );
            robot.keyRelease ( KeyEvent.VK_ENTER );
        } catch ( Exception e ) {

        }
    }

    public static void pressTab ( ) {
        try {
            Thread.sleep ( 8000 );
            robot.keyPress ( KeyEvent.VK_TAB );
            Thread.sleep ( 500 );
            robot.keyRelease ( KeyEvent.VK_TAB );
        } catch ( Exception e ) {

        }
    }

    public static void pause ( int timeSec) {
        try {
            Thread.sleep ( timeSec* 1000L );
        } catch ( Exception e ) {

        }
    }
}
