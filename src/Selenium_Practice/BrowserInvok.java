package Selenium_Practice;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javafx.util.Duration;

public class BrowserInvok {
	
	static String userName="7032525856";
	static String password="Afzal@7997";
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Tech-Influx\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://anicaapps2-prdrlu2.azurewebsites.net/");
		driver.manage().window().maximize();
		Thread.sleep(20000);
		driver.findElement(By.id("__xmlview1--idUname-inner")).sendKeys(userName);
		driver.findElement(By.id("__xmlview1--idPass-inner")).sendKeys(password);
		driver.findElement(By.id("__button1-inner")).click();
		driver.close();
	
	}

}
