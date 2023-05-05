package Selenium_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Execution2 {
	 @Test
		public void losginFunctionality() throws Exception
	     {
	    	 System.setProperty("webdriver.chrome.driver", "F:\\Tech-Influx\\chromedriver_win32 (1)\\chromedriver.exe");
	 		WebDriver driver=new ChromeDriver();
	 		driver.manage().window().maximize();
	 		driver.get("https://cm.anicaapp.com/webapp/index.html");
	 		
	 		LoginPage loginObj=PageFactory.initElements(driver,LoginPage.class);
	 		Home_Page homePage=PageFactory.initElements(driver,Home_Page.class);
	 		Account_Recievables ac_Recievables =PageFactory.initElements(driver, Account_Recievables.class);
	 		Thread.sleep(90000);
	 		loginObj.UserName.sendKeys("7032525856");
	 		loginObj.Password.sendKeys("Afzal@7997");
	 		loginObj.loginButton.click();
	 		Thread.sleep(30000);
	 		
	 		
	 		
	 		
	 		//LoginObj.otpSubmit.click();
	 		homePage.Account_Receivables.click();
	 		Thread.sleep(2000);
	 		ac_Recievables.NewCustomer.click();
	    	Thread.sleep(2000);
	    	ac_Recievables.CustomerName.sendKeys("savensolutions");
	    	ac_Recievables.Country.sendKeys("India");
	    	ac_Recievables.Phone.sendKeys("9959775241");
	    	ac_Recievables.ContactEmail.sendKeys("manikanta54@gmail.com");
	  		// LoginPageObject.login.click();
		}
	 	
	}

