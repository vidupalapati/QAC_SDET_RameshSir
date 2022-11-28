package com.amazon.commonBaseTest;

import java.awt.Robot;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.amazon.commonPages.loginPage;
import com.amazon.excelRead.excelRead;
import com.amazon.utilities.Constants;
import com.amazon.utilities.GenericMethods;
import com.gargoylesoftware.htmlunit.javascript.host.file.FileReader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseTest 
{
	WebDriver driver;
	
	@Test
	public void launchApp() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Constants.WAIT_IN_SECS,TimeUnit.SECONDS);
		
		GenericMethods gm = new GenericMethods();
		driver.get(gm.readPropertyFile("environmentDetails.properties","URL"));
		
		excelRead ER = new excelRead();
		
		String loginEmail = ER.read(Constants.excelPath,"EMAIL");
		String password = ER.read(Constants.excelPath,"PASSWORD");
		loginPage login=new loginPage();
		login.enterCredentials(driver,loginEmail,password,gm);
		
		
	}
	
	@AfterClass
	public void quitDriver()
	{
		driver.quit();
	}
}
