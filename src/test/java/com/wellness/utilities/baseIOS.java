package com.wellness.utilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class baseIOS {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		
		IOSDriver<IOSElement>driver;
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iphone 13 Pro");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITEST");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "15.2");
		//capabilities.setCapability("updateWDABundleId", "com.futurepet.wellnessreactnative");
		capabilities.setCapability("bundleId", "com.futurepet.wellnessreactnative");
		capabilities.setCapability("udid", "30C11768-F8FB-4261-A6B5-A4011BA03B22");
		capabilities.setCapability("xcodeOrgId", "X7952LFVM8");
		capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "3000");


		
		
		
		//capabilities.setCapability("xcodeSigningID", "iphone Developer");
		//capabilities.setCapability("udid", "6db3c2d9fd0c49833f340801ed392d9917d1eaa8");
	//	capabilities.setCapability("updateWDABundleId", "com.futurepet.wellnessreactnative");
	//capabilities.setCapability(MobileCapabilityType.APP, "/Users/sharathmandadi/Documents/Gofetch/IOSAPPformat/GoFetchHealth.app");

	
		driver = new IOSDriver<>(new URL ("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		
		///Users/sharathmandadi/Documents/Gofetch/IOSAPPformat/GoFetchHealth.app
		//com.futurepet.wellnessreactnative
		
		
		driver.findElementByAccessibilityId("Login").click();
		
		

	}

}
