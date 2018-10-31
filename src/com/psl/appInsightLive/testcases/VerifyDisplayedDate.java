package com.psl.appInsightLive.testcases;

import org.testng.SkipException;

import com.appInsightLiveUtil.TestUtil;
import com.psl.appInsightLive.pages.BasePage;

public class VerifyDisplayedDate {
	{
	
	if(TestUtil.isExecutable("Verify Displayed Date", BasePage.xls1))
		throw new SkipException("Runmode Set to No");
	
	
}
}

