package com.psl.appInsightLive.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class LandingPage extends BasePage{

		public TasksPage gotoTasksTab(){
		click("gotoTasksTabLink");
		return new TasksPage();
	}
	
	public RecordsPage gotoRecordsTab(){
		click("gotoRecordsTabLink");
		return new RecordsPage();
	}
	public ActionsPage gotoActionsTab(){
		click("gotoActionsTabLink");
		return new ActionsPage();
	}
	
	public ReportsPage gotoReportsTab(){
		//driver.findElement(By.linkText("Reports")).click();
		//clickLinkedText("(OR.getProperty(gotoReportsTabLink))");

		click("gotoReportsTabLink");
		//clickLinkedText("Reports");
		return new ReportsPage();
	}
}


