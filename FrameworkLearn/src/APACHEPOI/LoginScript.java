package APACHEPOI;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginScript extends readExcel{

	public static void main(String[] args) throws IOException, Exception 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		readExcel re = new readExcel();
		String URL = re.read("Amazon");
		System.out.println(URL);
		driver.quit();
	}

}
