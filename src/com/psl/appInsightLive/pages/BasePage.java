package com.psl.appInsightLive.pages;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.appInsightLiveUtil.Xls_Reader;

public class BasePage {

	public static WebDriver driver=null;
	public static Properties CONFIG= null;
	public static Properties OR=null;
	public static TopMenu topMenu= null;
	public static Xls_Reader xls1=new Xls_Reader(System.getProperty("user.dir")+ "//com//appInsightLive.xls//TestCases.xlsx");
	public static boolean isLoggedIn;
	
	//Constructor
	public BasePage()
	{
		System.out.println("BBBB");
		if (driver==null)
		{
		//initialize properties file 
		CONFIG= new Properties();
		OR=new Properties();
		System.out.println("properties file initialized");
		
		try {
		//load config .properties file
		FileInputStream fs= new FileInputStream(System.getProperty("user.dir")+"\\src\\com\\psl\\appInsightLive\\config\\config.properties");
		CONFIG.load(fs);
		
		fs= new FileInputStream(System.getProperty("user.dir")+"\\src\\com\\psl\\appInsightLive\\config\\OR.properties");
		OR.load(fs);
		}catch(Exception e){
		return;
		}
		System.out.println(CONFIG.getProperty("testSiteURL"));
		System.out.println();
	
	if (CONFIG.getProperty("browser").equals("Mozilla")){
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\com\\psl\\appInsightLive\\resouces\\geckodriver.exe");	
		
		Proxy p= new Proxy();
		p.setProxyAutoconfigUrl("http://bgproxy.persistent.co.in");
		
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability(CapabilityType.PROXY, p);
		this.driver=new FirefoxDriver(cap);
			System.out.println("Mozilla is initalized");
		}
	else if (CONFIG.getProperty("browser").equals("IE")){
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\src\\com\\psl\\appInsightLive\\resouces\\IEDriverServer.exe");
		this.driver=new InternetExplorerDriver();
		}
	else if (CONFIG.getProperty("browser").equals("Chrome")){
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\com\\psl\\appInsightLive\\resouces\\chromedriver.exe");
		Proxy p= new Proxy();
		p.setProxyAutoconfigUrl("http://bgproxy.persistent.co.in");
		
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability(CapabilityType.PROXY, p);
		this.driver=new ChromeDriver(cap);
	}
		//implicit wait for whole application
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		topMenu= new TopMenu();
		}
		
	}
	
	//click
	public void click(String xpathKey){
		try{
		driver.findElement(By.xpath(OR.getProperty(xpathKey))).click();
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	// Click by LinkText
	
	public void clickLinkedText(String linkedText){
		driver.findElement(By.linkText(linkedText)).click();
	}
	
	//input
	public void input(String xpathKey, String text){
		try{
		driver.findElement(By.xpath(OR.getProperty(xpathKey))).sendKeys(text);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
		//Verification
	public boolean isElementPresent(String xpathKey){
		try{
			driver.findElement(By.xpath(OR.getProperty(xpathKey)));
		}catch(Exception e){
			e.printStackTrace();
			return false;
			}
		return true;
	}
	
	//
	public String getElementText(String xpathKey){
		
			String ElementText= driver.findElement(By.xpath(OR.getProperty(xpathKey))).getText();
			return ElementText;
		
	}
	
	
}

