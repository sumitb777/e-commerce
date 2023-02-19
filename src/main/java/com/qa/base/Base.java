package com.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static  WebDriver driver;
	public WebDriver initilization() throws IOException {
		Properties prop=new Properties();
		FileInputStream fis =new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\qa\\config\\configiration.properties");
		prop.load(fis);
	   String browser=prop.getProperty("browser");
	   if(browser.equals("chrome")) {
		   WebDriverManager.chromedriver().setup();
		   driver=new ChromeDriver();
		    }
	   else if(browser.equalsIgnoreCase("edge")) {
		   WebDriverManager.edgedriver().setup();
		   driver=new EdgeDriver();
		   
	   }
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		return driver;
		
		
		
	}
	

}
