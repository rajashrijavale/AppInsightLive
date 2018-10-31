package com.psl.appInsightLive.testcases;

import org.testng.SkipException;

import com.appInsightLiveUtil.TestUtil;
import com.psl.appInsightLive.pages.BasePage;

public class CompareConfigureDateAndDisplayDate {
	{

	
	if(TestUtil.isExecutable("Compare ConfigureDateAndDisplayedDate", BasePage.xls1))
		throw new SkipException("Runmode Set to No");
	
	
}
	
	
}
