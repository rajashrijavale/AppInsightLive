package com.psl.appInsightLive.pages;

import org.openqa.selenium.By;

public class TopMenu {
	//logs you out
	public void Logout(){
		
	}
	
	public void gotoLandingPage(){
		
	}
	
	public ReportsPage gotoReprotsPage(){
		BasePage.driver.findElement(By.xpath(BasePage.OR.getProperty("gotoReportsTabLink")));
		return new ReportsPage();
		
	}
	
	
	
	
}
