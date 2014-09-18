package com.espn.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class ScriptBase {
	
	//class level variable to use throughout the class
		protected WebDriver driver = new FirefoxDriver();
		String baseURL = "http://www.espn.go.com/";
		
		//this method will open the application
		@BeforeTest
		public void openApp(){
			//application opens using get() method which has argument for URL 
			driver.get(baseURL);
			//multiple methods are used to maximize the window
			driver.manage().window().maximize();
			//implicit wait for avoiding "ElementNotFoundException".
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
			
		}
		
		//this method will close the application using close() method.
		@AfterTest
		public void closeApp(){
			driver.close();
			driver.quit();
		}

}
