package com.psl.appInsightLive.pages;

import org.openqa.selenium.By;

public class ReportsPage extends BasePage{

	public void IsAppInsightLiveExists(){
		boolean result=isElementPresent("appInsightLiveappXpath");
		System.out.println("AppInsight Live application available on Reports Page " +result);
		System.out.println(getElementText("appInsightLiveappXpath"));
	}
	
	public AppInsightLivePage gotoAppInsightLive(){
		driver.findElement(By.xpath(OR.getProperty("appInsightLiveappXpath"))).click();
		return new AppInsightLivePage();
	}
}
