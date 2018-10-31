package com.appInsightLiveUtil;

public class TestUtil {

	
	//to interact with test cases
	public static boolean isExecutable(String testName, Xls_Reader xls){
		for(int rNum=2; rNum<=xls.getRowCount("Test Cases"); rNum++){
			if(testName.equals(xls.getCellData("Test Cases", "TCID", rNum))){ // find the test case in xls
				if (xls.getCellData("Test Cases", "Runmode",rNum).equals("Y"))
					return true;  // execute test cases
				else 
					return false;  // do not execute test case
				

			}
		}
		return false;
			
	}
}
