package Selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_Emplyee_Position {
	
	static WebDriver driver;
	static WebElement orangehrm;
	
	
	
	public static void main(String[] args) throws InterruptedException  {
		String url="http://orangehrm.qedgetech.com/symfony/web/index.php/pim/viewEmployeeList";
		
		String emplyee_Name= "Uma";
		String emplyee_Id= "20381";
		
		invokeDriver();
		login(url);
		check();
		//createEmployee("sbk", "KKSB" );
		
		findEmployeePosition(emplyee_Id);
			
			
		//driver.close();
		
		
		
	}
	
	public static void invokeDriver() {

		System.setProperty("webdriver.chrome.driver", "F:\\Tech-Influx\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("http://www.google.com");
		 driver.manage().window().maximize();
		
	}
	
	
	public static void login( String url) {
		driver.get(url);
		driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("Qedge123!@#");
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		
	}
	
	public static void createEmployee(String firstName, String lastName ) {
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		driver.findElement(By.className("formInputText")).sendKeys(firstName);
		driver.findElement(By.name("lastName")).sendKeys(lastName);
		driver.findElement(By.id("btnSave")).click();
		driver.findElement(By.id("btnSave")).click();
		driver.findElement(By.id("personal_optGender_1")).click();
		driver.findElement(By.id("btnSave")).click();
		System.out.println("Employee Successfuly created");
		
	}
	
	
	
	public static void searchForEmplyee(String idOrName) throws InterruptedException {
		WebElement employInf=driver.findElement(By.xpath("//*[@id=\"empsearch_employee_name_empName\"]"));
		
		
		employInf.sendKeys(idOrName);
	
		
		WebElement search=driver.findElement(By.id("searchBtn"));
		search.click();
		
	}
	public static void check() throws InterruptedException {
		
		orangehrm=driver.findElement(By.xpath("//*[@id=\"tableWrapper\"]"));
		
		
		System.out.println(orangehrm.isDisplayed());
		
		System.out.println(orangehrm.isEnabled());
		
		
		System.out.println(orangehrm.isSelected());
		
		
		
	}
	
	public static void findEmployeePosition(String emplyNameOrId) {
		
		List<WebElement> totalRows=orangehrm.findElements(By.tagName("tr"));
		int rowLenght=totalRows.size();
		System.out.println("No: of rows:"+rowLenght);
		
		
	
	for(int i=1;i<rowLenght;i++)
	{
		List<WebElement> totalcols=totalRows.get(i).findElements(By.tagName("td"));
		
		
		for(int j=1;j<totalcols.size()-4;j++){
//			System.out.println("j=Colum Index of "+j);	
//				
//			System.out.println(totalcols.get(j).getText());
			
			if(totalcols.get(j).getText().contains(emplyNameOrId)) {
				System.out.println("No of  cells:"+totalcols.size());
				System.out.println("Uma found at Row no "+i+ " and cell no "+j);	
				
				System.out.println("Row data :"+totalRows.get(i).getText());	
				
				break;
			}
			
		}
	
	}
		
		
	}
	
	
}
				
			
				
					

					


