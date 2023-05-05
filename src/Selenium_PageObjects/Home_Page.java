package Selenium_PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home_Page {
	


	@FindBy (xpath="(//span[@class=\"sapMText sapTntNavLIText sapMTextNoWrap\"])[1]")
	public WebElement HomeButton;
	
	@FindBy (xpath = "//span[contains(@class, \"sapMText \") and  text()=\"Accounts Receivables\"]")
	public WebElement Account_Receivables;
	
	@FindBy (xpath = "//span[contains(@class, \"sapMText \") and  text()=\"Accounts Payable\"]")
	public WebElement Account_Payable;
	
	@FindBy (xpath = "//span[contains(@class, \"sapMText \") and  text()=\"Analytics\"]")
	public WebElement Analytics;
	
	@FindBy (xpath = "//span[contains(@class, \"sapMText \") and  text()=\"User Management\"]")
	public WebElement User_Management;
	
	@FindBy (xpath = "//span[contains(@class, \"sapMText \") and  text()=\"Change Company\"]")
	public WebElement Change_Company;
	
	
	
	@FindBy (xpath = "//span[contains(@class, \"sapMText \") and  text()=\"Customer Data\"]")
	public WebElement Customer_Data;
	@FindBy (xpath = "(//span[@title=\"Collapse\"])[1]")
	public WebElement Customer_Collaps;
	
			@FindBy (xpath = "//span[contains(@class, \"sapMText \") and  text()=\"Customers\"]")
			public WebElement Customers;
			
			@FindBy (xpath = "(//span[contains(@class, \"sapMText \") and  text()=\"Contracts\"])[1]")
			public WebElement Contracts;
			
			@FindBy (xpath = "(//span[contains(@class, \"sapMText \") and  text()=\"PO/Amendments/Release Order\"])[1]")
			public WebElement PO_Amendments_Release_Order;
			
			@FindBy (xpath = "(//span[contains(@class, \"sapMText \") and  text()=\"Projects\"])[1]")
			public WebElement Projects;
			
			@FindBy (xpath = "(//span[contains(@class, \"sapMText \") and  text()=\"Invoices\"])[1]")
			public WebElement Invoices;
			
	
	@FindBy (xpath = "//span[contains(@class, \"sapMText \") and  text()=\"Vendor Data\"]")
	public WebElement Vendor_Data;
	@FindBy (xpath = "(//span[@title=\"Collapse\"])[2]")
	public WebElement Vendor_Collaps;
	
			@FindBy (xpath = "//span[contains(@class, \"sapMText \") and  text()=\"Vendors\"]")
			public WebElement Vendors;
			
			@FindBy (xpath = "(//span[contains(@class, \"sapMText \") and  text()=\"Contracts\"])[2]")
			public WebElement VContracts;
			
			@FindBy (xpath = "(//span[contains(@class, \"sapMText \") and  text()=\"PO/Amendments/Release Order\"])[2]")
			public WebElement VPO_Amendments_Release_Order;
			
			@FindBy (xpath = "(//span[contains(@class, \"sapMText \") and  text()=\"Projects\"])[2]")
			public WebElement VProjects;
			
			@FindBy (xpath = "(//span[contains(@class, \"sapMText \") and  text()=\"Invoices\"])[2]")
			public WebElement VInvoices;
			
			
	@FindBy (xpath = "//span[contains(@class, \"sapMText \") and  text()=\"Consultants\"]")
	public WebElement Consultants;
	
	@FindBy (xpath = "//span[contains(@class, \"sapMText \") and  text()=\"Time Sheet\"]")
	public WebElement Time_Sheet;
	
	
	@FindBy (xpath = "//span[contains(@class, \"sapMText \") and  text()=\"Documents\"]")
	public WebElement Documents;
	
	
	@FindBy (xpath = "//span[contains(@class, \"sapMText \") and  text()=\"Service Order\"]")
	public WebElement Service_Order;
	
	@FindBy (xpath = "//span[contains(@class, \"sapMText \") and  text()=\"Logout\"]")
	public WebElement Logout;
	
	
//	
//	@FindBy (xpath="//*[@id=\"__xmlview1--sHomeId-a\"]")
//    public WebElement home;
//	
//	@FindBy (xpath="//*[@id=\"__xmlview1--sAccRecive-a\"]")
//    public WebElement AccountReceivables;
//	
//	@FindBy (xpath="//*[@id=\"__button27-BDI-content\"]")
//    public WebElement NewCustomer;
//	
//	@FindBy (xpath="//*[@id=\"__xmlview4--idCusName-inner\"]")
//    public WebElement CustomerName;
//	
//	@FindBy (xpath="//*[@id=\"__xmlview4--idCustCountry-inner\"]")
//    public WebElement Country;
//	
//	@FindBy (xpath="//*[@id=\"__xmlview4--idCusPhone-inner\"]")
//    public WebElement Phone;
//	
//	@FindBy (xpath="//*[@id=\"__xmlview4--idCusEmail-inner\"]")
//    public WebElement ContactEmail;
//	
//	@FindBy (xpath="//*[@id=\"__xmlview4--idCusCompID-inner\"]")
//    public WebElement CompanyID;
//	
//	
//	@FindBy (xpath="//*[@id=\"__xmlview4--btnAddCustomer-BDI-content\"]")
//    public WebElement Submit;
	
	
}


