package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Net_F_Task {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		String name="Oaji";
		
		char firstChar=name.charAt(0);
		
		
	
		
		
		invokeDriver();
		
		driver .findElement(By.xpath("(//input[@type=\"text\"])[5]")).sendKeys(name);
		
		if (Character.isLowerCase(firstChar)) {
			
			System.out.println("Name can not Start with Small Alphabets");
			
		}
		
		else if(name.startsWith("A") ||name.startsWith("B") ||name.startsWith("C") || name.startsWith("D")||name.startsWith("F")||name.startsWith("g")||name.startsWith("H")) {
			
			driver .findElement(By.xpath("//*[@id=\"CodeForm\"]/div[2]/div[3]/div[5]/div/div/input")).sendKeys("Nunit");
			
			Actions action=new Actions(driver);
			Thread.sleep(2000);
			WebElement nuGet=driver.findElement(By.xpath("//a[contains(@id,'ui-id')]"));
			
			action.moveToElement(nuGet).perform();
			Thread.sleep(5000);
			WebElement version=driver.findElement(By.xpath("(//ul[@role=\"menu\"])[3]/li[5]"));
			action.moveToElement(version).click().perform();
			//action.click(version).perform();
			
		}
		else if(name.startsWith("I") || name.startsWith("J") ||name.startsWith("K") || name.startsWith("L")||name.startsWith("M")||name.startsWith("N")){
			
			WebElement share=driver.findElement(By.id("Share"));
			share.click();
			String S=driver.findElement(By.id("ShareLink")).getAttribute("value");
			System.out.println(S);
			if(S.startsWith("https://dotnet")) {
				System.out.println(true);
			}else {
				System.out.println(false);
				
			}
					
		}
		else if(name.startsWith("O") ||name.startsWith("P") ||name.startsWith("Q") || name.startsWith("R")||name.startsWith("S")||name.startsWith("T")){
			driver.findElement(By.id("save-button")).click();
			Thread.sleep(2000);
			String title=driver.findElement(By.xpath("//*[@id=\"form0\"]/div[3]/div[2]/button")).getAttribute("textContent");
			System.out.println(title);
			System.out.println(title.equals("Log in"));
			
			
		}
		else {
			driver.findElement(By.xpath("(//a[@class=\"btn btn-default\"])[3]")).click();
			Thread.sleep(2000);
			System.out.println(driver.getTitle()); 
			driver.findElement(By.linkText("Database Template")).click();
			
		}

	}

	
	public static void invokeDriver() {

		System.setProperty("webdriver.chrome.driver", "F:\\Tech-Influx\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver=new ChromeDriver();
			driver.get("https://dotnetfiddle.net/#");
			driver.manage().window().maximize();
		
	}
}
