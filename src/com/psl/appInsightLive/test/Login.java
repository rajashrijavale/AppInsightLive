package com.psl.appInsightLive.test;

import java.text.ParseException;

import org.openqa.selenium.By;

import com.psl.appInsightLive.pages.ActionsPage;
import com.psl.appInsightLive.pages.AppInsightLivePage;
import com.psl.appInsightLive.pages.LandingPage;
import com.psl.appInsightLive.pages.LoginPage;
import com.psl.appInsightLive.pages.RecordsPage;
import com.psl.appInsightLive.pages.ReportsPage;
import com.psl.appInsightLive.pages.TasksPage;

public class Login {
	// Make NAvigational Structure
	//Validations= testing-TestNg
	//reporting part
	//Parameterized tests
	//running scripts using ant
	// logging
	// Mailing Reports
		
	
	
public static void main(String[] args) throws ParseException{
	LoginPage l= new LoginPage();
	LandingPage lp=l.doLogin("rajashri", "god2017");
	
	ReportsPage r=lp.gotoReportsTab();
	r.IsAppInsightLiveExists();
	
	AppInsightLivePage ailp= r.gotoAppInsightLive();
	ailp.getDate();
	ailp.compareDate();
	ailp.gotoAppConfigure();

	
	//ActionsPage ap= lp.gotoActionsTab();
	//TasksPage tp= lp.gotoTasksTab();
	//RecordsPage rp= lp.gotoRecordsTab();
	
}
	

}
