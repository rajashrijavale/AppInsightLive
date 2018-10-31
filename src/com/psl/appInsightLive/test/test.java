package com.psl.appInsightLive.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\com\\psl\\appInsightLive\\resouces\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.co.in");
	}

}
