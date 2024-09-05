package com.utilities;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.objectrepository.Locators;

public class CommonFunctions {
	public Locators loc = new Locators();
	public WebDriver driver;
	public Properties prop;
	
	
	public void chromeBrowserLaunch() {
//		WebDriverManager.chromedriver().browserVersion("85").setup();
		driver = new ChromeDriver();
		driver.navigate().refresh();
		driver.manage().window().maximize();
		System.out.println("windows maximized");
	}

	public void firefoxBrowserLaunch() {
		driver = new FirefoxDriver();
		driver.navigate().refresh();
		driver.manage().window().maximize();
		System.out.println("windows maximized");
	}

	public void edgeBrowserLaunch() {
		driver = new EdgeDriver();
		driver.navigate().refresh();
	}

}
