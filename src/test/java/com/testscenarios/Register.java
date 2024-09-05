package com.testscenarios;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.objectrepository.Locators;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Register {
	Locators loc = new Locators();
	WebDriver driver;
	Properties prop;
	
  @Test
  public void f() throws Exception {
	  driver.get(prop.getProperty("Url"));
		Thread.sleep(5000);
		driver.findElement(loc.MyAccount).click();
		Thread.sleep(2000);
		driver.findElement(loc.EmailAddress).sendKeys(prop.getProperty("Email"));
		driver.findElement(loc.Password).sendKeys(prop.getProperty("Password"));
		driver.findElement(loc.Register).click();
  }
  @BeforeMethod
  public void beforeMethod() {
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
