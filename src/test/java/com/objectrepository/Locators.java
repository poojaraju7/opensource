package com.objectrepository;

import org.openqa.selenium.By;

public class Locators {
	
	public final By MyAccount = By.xpath("//*[@id=\"menu-item-50\"]/a");
	public final By EmailAddress = By.name("email");
	public final By Password = By.name("password");
	public final By Register = By.name("register");
	public final By Logemail = By.name("username");
	public final By Logpass = By.id("password");
	public final By Rememberme = By.name("rememberme");
	public final By Login = By.name("login");
	public final By Logout = By.xpath("//*[@id=\"page-36\"]/div/div[1]/nav/ul/li[6]/a");
	public final By Forgetpassword = By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[4]/a");
	public final By resetemail = By.name("user_login");
	public final By resetpass = By.xpath("//*[@id=\"page-36\"]/div/div[1]/form/p[3]/input[2]");
	
	//shop as guest
	public final By shop = By.xpath("//*[@id=\"menu-item-40\"]/a");
	public final By addcart = By.xpath("//*[@id=\"content\"]/ul/li[2]/a[2]");
	public final By cart = By.xpath("//*[@id=\"wpmenucartli\"]/a/span[1]");
	
	

}
