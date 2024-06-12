package com.CrashDataRetrival.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;



public class BaseClass {

	
		public static WebDriver driver;
		
	   @BeforeTest
	    public void openBrowser() throws IOException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Reporter.log("Open Browser",true);	
		
	}
}
