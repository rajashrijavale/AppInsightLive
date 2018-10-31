package com.psl.appInsightLive.pages;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import org.openqa.selenium.By;

public class AppInsightLivePage extends BasePage{

	public String getDate(){
		String date= driver.findElement(By.xpath(OR.getProperty("appInsightLiveDateDisplayed"))).getText();
				return date;
	}
	
	public void compareDate() throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("MMM dd, yyyy",Locale.US);  //existing format
		String dispDate = getDate(); // Dec 28, 2016
		System.out.println("Displayed Date is "+dispDate);
		SimpleDateFormat print= new SimpleDateFormat("MM/dd/yyyy"); 	// required format
		Date parseDate;
		parseDate=sdf.parse(dispDate);	 //get date in required format 12/28/2016
		System.out.println(print.format(parseDate));  
				
		//get todays date		
		Date todaysDate = new Date();
		System.out.println("currentDate= "+todaysDate);
			
		// compare displayed date with Todays date
		if(parseDate.compareTo(todaysDate) == 0){
			System.out.println("Displayed date is Current Date: " +dispDate);
		}
		else{
			System.out.println("Displayed date is not same as today's date");
		}
		
	}
	
	
	public AppInsightLiveConfigurePage gotoAppConfigure(){
		driver.findElement(By.xpath(OR.getProperty("appInsightLiveConfigueXpath"))).click();
		return new AppInsightLiveConfigurePage();
	}
	
}
