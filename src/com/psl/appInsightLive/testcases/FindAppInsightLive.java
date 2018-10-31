package com.psl.appInsightLive.testcases;



import org.testng.SkipException;
import org.testng.annotations.Test;

import com.appInsightLiveUtil.TestUtil;
import com.psl.appInsightLive.pages.BasePage;
import com.psl.appInsightLive.pages.LandingPage;
import com.psl.appInsightLive.pages.LoginPage;
import com.psl.appInsightLive.pages.ReportsPage;

public class FindAppInsightLive {
	@Test
	public void gotoReportsTab(){
		if(TestUtil.isExecutable("FindAppInsightLive", BasePage.xls1))
			throw new SkipException("Runmode Set to No");
		
		ReportsPage r=null;
		LandingPage lp=null;
		// logged in user
		if(!BasePage.isLoggedIn){
			LoginPage loginPage= new LoginPage();
			lp=loginPage.doLogin();
		} else 		
		//user is loggedin but user might be on some other page
		r=BasePage.topMenu.gotoReprotsPage();
	}

	@Test
	public void IsAppInsightLiveExists(){
		
	}
	
	@Test
	public void gotoAppInsightLive(){
		
	}
}
