package Selenium_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


public class Acm_Project {
	static WebDriver driver;
	
	
	
	
	
	@Test
	public static void invokeDriver() {

		System.setProperty("webdriver.chrome.driver", "F:\\Tech-Influx\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver=new ChromeDriver();
			driver.get("https://cm.anicaapp.com/webapp/index.html");
			driver.manage().window().maximize();
		
	}
	

}
