package com.amazon.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GenericMethods 
{
	public String readPropertyFile(String propertyFileName,String propertyName) throws IOException
	{
		//To read property file
		Properties loadfile = new Properties();
		FileInputStream fis = new FileInputStream(propertyFileName);
		loadfile.load(fis);
		String str = loadfile.getProperty(propertyName);
		return str;
	}
	
	public void click(WebDriver driver,String Element)
	{
		driver.findElement(By.id(Element)).click();
	}
	
	public void sendKeys(WebDriver driver,String Element,String Text)
	{
		driver.findElement(By.id(Element)).sendKeys(Text);
	}
}
