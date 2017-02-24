package com.test.cuk;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class udemy {
	WebDriver driver;
	
	@BeforeTest
	public void test() throws MalformedURLException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		capabilities.setCapability("deviceName", "4200278de44ba300");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("appPackage", "com.bt.bms");
		capabilities.setCapability("appActivity", "com.bt.bms.activities.SplashActivity");
	//  driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver=new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities );
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
}
	
	@Test
	public void udemy() {
		
		//System.out.println("Login Manual Qlue");
		driver.findElement(By.id("com.bt.bms:id/btnNoThanks")).click();	
		//int s=driver.findElements(By.className("android.widget.EditText")).size();
		//System.out.println(s);
		//List<WebElement>a=driver.findElements(By.className("android.widget.EditText"));
		//a.get(0).sendKeys("Kimcil");
		//a.get(1).sendKeys("Mobile");
		//driver.findElement(By.name("Next")).click();	
				
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

@Test
public void qluelogin() {
	
	//System.out.println("Login Manual Qlue");
	driver.findElement(By.id("org.qluein.android:id/txtQlue")).click();	
	int s=driver.findElements(By.className("android.widget.EditText")).size();
	System.out.println(s);
	List<WebElement>a=driver.findElements(By.className("android.widget.EditText"));
	a.get(0).sendKeys("Kimcil");
	a.get(1).sendKeys("Mobile");
	driver.findElement(By.name("Next")).click();	
			
}
}
