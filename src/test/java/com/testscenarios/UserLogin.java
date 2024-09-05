package com.testscenarios;

import org.testng.annotations.Test;

import com.objectrepository.Locators;
import com.utilities.CommonFunctions;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v126.page.model.FileHandler;
import org.testng.annotations.AfterClass;

public class UserLogin extends CommonFunctions {

	
  @Test
  public void f() throws Exception {
	  
	    driver.get(prop.getProperty("Url"));
		driver.findElement(loc.MyAccount).click();
		Thread.sleep(3000);
		driver.findElement(loc.Logemail).sendKeys(prop.getProperty("Email"));
		driver.findElement(loc.Logpass).sendKeys(prop.getProperty("Password"));
		driver.findElement(loc.Rememberme).click();
		driver.findElement(loc.Login).click();
		//driver.findElement(loc.shop).click();
		//driver.findElement(loc.addcart).click();
		//Thread.sleep(3000);
		//driver.findElement(loc.cart).click();
		//driver.findElement(loc.proceedcheckout).click();
		
		 File abc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 org.openqa.selenium.io.FileHandler.copy(abc, new File("/Users/thejusnambyaarr/eclipse-workspace/opensourcedemo/MyScreenshot/test.png"));
	  
		 
		 
		
		 
		 
		 
	  
  }
  
  @AfterMethod
  public void afterMethod() {
	  
  }

  @BeforeClass
  public void beforeClass() throws Exception {
	    chromeBrowserLaunch();
		FileInputStream filepath = new FileInputStream("/Users/thejusnambyaarr/eclipse-workspace/opensourcedemo/src/test/resources/testdata/Automationtesting.properties ");
		prop = new Properties();
		prop.load(filepath);
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
