package com.testscenarios;

import org.testng.annotations.Test;

import com.utilities.CommonFunctions;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class CollegeLiveWeek extends CommonFunctions{
  @Test
  public void f() {
	  
	  driver.get(prop.getProperty("Url1"));
	  
	  
	  
  }
  @BeforeClass
  public void beforeClass() {
	  
	  chromeBrowserLaunch();
	  
	  
  }

  @AfterClass
  public void afterClass() {
  }

}
