package com.psl.appInsightLive.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{
// null- if login is not successful and LandingPage if login is successful
	
	public LandingPage doLogin(String userName, String password){
		System.out.println(CONFIG.getProperty("testSiteURL"));
		//driver.findElement(By.xpath("//*[@id='un']"));
		System.out.println("xxx");
		
		driver.get(CONFIG.getProperty("testSiteURL"));
		System.out.println(isElementPresent("userNameTextBoxId"));
		input("userNameTextBoxId",userName);
		System.out.println("Name");
		input("passwordTextBoxId",password);
		System.out.println("Password");
		click("LoginSubmitButtonValue");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			
		if (isElementPresent("gotoReportsTabLink"))
			return new LandingPage();
		
		else 
			return null;
	}
		
		//initialize top menu
		//topMenu= new TopMenu();
		
		// Relogin with default correct username and password
		public LandingPage doLogin(){
			return doLogin(CONFIG.getProperty("defaultUserName"), CONFIG.getProperty("defaultPassword"));
		}
	
		
	}
	
	
	
	
	

