package com.testscenarios;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.objectrepository.Locators;

public class AutoTesting_Login {
	
	Locators loc = new Locators();
    @Test
	public void test() throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		FileInputStream filepath = new FileInputStream("/Users/thejusnambyaarr/eclipse-workspace/opensourcedemo/src/test/resources/testdata/Automationtesting.properties ");
		Properties prop = new Properties();
		prop.load(filepath);
		
		driver.get(prop.getProperty("Url"));
		Thread.sleep(5000);
		driver.findElement(loc.MyAccount).click();
		Thread.sleep(3000);
		driver.findElement(loc.EmailAddress).sendKeys(prop.getProperty("Email"));
		driver.findElement(loc.Password).sendKeys(prop.getProperty("Password"));
		driver.findElement(loc.Register).click();
		
		Thread.sleep(5000);
		driver.findElement(loc.MyAccount).click();
		Thread.sleep(3000);
		driver.findElement(loc.Logemail).sendKeys(prop.getProperty("Email"));
		driver.findElement(loc.Logpass).sendKeys(prop.getProperty("Password"));
		driver.findElement(loc.Rememberme).click();
		driver.findElement(loc.Login).click();
		driver.findElement(loc.Logout).click();
		Thread.sleep(2000);
		driver.findElement(loc.Forgetpassword).click();
		driver.findElement(loc.resetemail).sendKeys(prop.getProperty("Email"));
		driver.findElement(loc.resetpass).click();
		
		//user able to shop as guest
		driver.findElement(loc.shop).click();
		driver.findElement(loc.addcart).click();
		driver.findElement(loc.cart).click();
		
		
	
		
		
		
		
		
		
		
		

	}

}
