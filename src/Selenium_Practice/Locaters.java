package Selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locaters {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		String url="file:///F:/Tech-Influx/Selenium/HTMLs/Locators.html";
		
		invokeDriver( url);
		formFilling("Shaik","Baji");
		
		

	}
	public static void invokeDriver(String url) {

		System.setProperty("webdriver.chrome.driver", "F:\\Tech-Influx\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver=new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			
	}
	
	public static void  formFilling(String fName, String LName) throws InterruptedException {
		WebElement firstName=driver.findElement(By.id("Firstname"));
		if(firstName.isEnabled()) {
			firstName.sendKeys(fName);
		}
		
		WebElement lastName=driver.findElement(By.id("Lastname"));
		if(lastName.isEnabled()) {
			lastName.sendKeys(LName);
		}
		driver.findElement(By.id("Email")).sendKeys("Skbaji@gmail.com");
		
		driver.findElement(By.id("idTxtB")).sendKeys("123445");
		driver.findElement(By.id("password")).sendKeys("A@123");
		WebElement qalifctnDropDown=driver.findElement(By.name("qualification"));
		Select qualification=new Select(qalifctnDropDown);
		
		//ystem.out.println(qualification.getAllSelectedOptions());
		
		
		//select By Index
		qualification.selectByIndex(1);
		Thread.sleep(2000);
		//Select By Value
		qualification.selectByValue("2");
		Thread.sleep(2000);
		//Select By visible Text
		qualification.selectByVisibleText("Post Graduate");
			
		System.out.println(qualification.getFirstSelectedOption().getText());
		
		List<WebElement> allQualification = qualification.getOptions();
		
		 	for( WebElement element:allQualification) {
			 element.getText();
			 
			 	if(element.getText().equalsIgnoreCase("Graduate")) {
				 
				 qualification.selectByVisibleText("Graduate");
				 
			 	}
			 
			 
		 	}
		 driver.findElement(By.xpath("/html/body/form/input[6]")).click();
		 driver.findElement(By.id("submit")).click();
	}

}
