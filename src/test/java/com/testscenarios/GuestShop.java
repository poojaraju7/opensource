package com.testscenarios;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.objectrepository.Locators;
import com.utilities.CommonFunctions;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class GuestShop extends CommonFunctions {
	
	
  @Test
  public void f() throws Exception {
	    driver.get(prop.getProperty("Url"));
	    Thread.sleep(2000);
	    driver.findElement(loc.shop).click();
		driver.findElement(loc.addcart).click();
		Thread.sleep(3000);
		driver.findElement(loc.cart).click();
		driver.findElement(loc.proceedcheckout).click();
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
  }

}
