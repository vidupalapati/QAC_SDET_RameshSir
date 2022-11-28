package com.amazon.commonPages;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.amazon.utilities.Constants;
import com.amazon.utilities.GenericMethods;

public class loginPage 
{
	public void enterCredentials(WebDriver driver,String email,String password,GenericMethods gm) throws IOException, Exception
	{
		gm.click(driver,Constants.signIn);
		gm.sendKeys(driver,Constants.Email,email);
		gm.click(driver,Constants.continueButton);
		gm.sendKeys(driver,Constants.password,password);
		gm.click(driver,Constants.signInButton);
	}
}
