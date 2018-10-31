package com.psl.appInsightLive.test;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadingProperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties p =new Properties();
		System.out.println(System.getProperty("user.dir"));
		String path= System.getProperty("user.dir")+"\\src\\com\\psl\\appInsightLive\\config\\config.properties";
		System.out.println(path);
		
		try{
			FileInputStream fs= new FileInputStream(path);
			p.load(fs);
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println(p.getProperty("testSiteURL"));
		
		
	}

}
