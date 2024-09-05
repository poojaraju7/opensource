package com.testscenarios;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.objectrepository.Locators;

import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class LoginTest {
	Locators loc = new Locators();
	WebDriver driver;
	Properties prop;
  @Test
  public void f() throws Exception {
	    driver.get(prop.getProperty("Url"));
		driver.findElement(loc.MyAccount).click();
		Thread.sleep(3000);
		driver.findElement(loc.Logemail).sendKeys(prop.getProperty("Email"));
		driver.findElement(loc.Logpass).sendKeys(prop.getProperty("Password"));
		driver.findElement(loc.Rememberme).click();
		driver.findElement(loc.Login).click();
		driver.findElement(loc.Logout).click();
	  
  }
	 
  @BeforeClass
  public void beforeClass() throws Exception {
	  
	    driver = new ChromeDriver();
	 	FileInputStream filepath = new FileInputStream("/Users/thejusnambyaarr/eclipse-workspace/opensourcedemo/src/test/resources/testdata/Automationtesting.properties ");
		prop = new Properties();
		prop.load(filepath);
  }	
  
  @AfterClass
  
  public void afterClass() {
  }

}
