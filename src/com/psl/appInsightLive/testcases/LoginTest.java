package com.psl.appInsightLive.testcases;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.appInsightLiveUtil.TestUtil;
import com.psl.appInsightLive.pages.BasePage;
import com.psl.appInsightLive.pages.LandingPage;
import com.psl.appInsightLive.pages.LoginPage;

import junit.framework.Assert;

public class LoginTest {

	
	@Test
	public void loginTest(){
		
		// check the runmode of testcase
		
		if(TestUtil.isExecutable("LoginTest", BasePage.xls1))
			throw new SkipException("Runmode Set to No");
		
		
		//temp variable testdatatype= false- means wrong username or pwd is provided
		
		boolean testDataType=true;
		LoginPage loginPage= new LoginPage();
		LandingPage page=loginPage.doLogin("rajashri", "god2017");
		
				
		if (testDataType & page==null){
			Assert.assertTrue(" Not able to login with correct data"+"rajashri"+"god2017",false);
		}	
		else if (!testDataType & page !=null){
			Assert.assertTrue(" Able to login with incorrect data", false);
			BasePage.isLoggedIn= true;
		}
	}
		
		
		
	}

