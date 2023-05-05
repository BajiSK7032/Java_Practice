package Selenium_PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Account_Recievables {
	
	
	
//	@FindBy (xpath="//*[@id=\"__xmlview1--sHomeId-a\"]")
//    public WebElement home;
//	
//	@FindBy (xpath="//*[@id=\"__xmlview1--sAccRecive-a\"]")
//    public WebElement AccountReceivables;
	
	@FindBy (xpath="//*[@id=\"__button27-BDI-content\"]")
    public WebElement NewCustomer;
	
	@FindBy (xpath="//*[@id=\"__xmlview4--idCusName-inner\"]")
    public WebElement CustomerName;
	
	@FindBy (xpath="//*[@id=\"__xmlview4--idCustCountry-inner\"]")
    public WebElement Country;
	
	@FindBy (xpath="//*[@id=\"__xmlview4--idCusPhone-inner\"]")
    public WebElement Phone;
	
	@FindBy (xpath="//*[@id=\"__xmlview4--idCusEmail-inner\"]")
    public WebElement ContactEmail;
	
	@FindBy (xpath="//*[@id=\"__xmlview4--idCusCompID-inner\"]")
    public WebElement CompanyID;
	
	
	@FindBy (xpath="//*[@id=\"__xmlview4--btnAddCustomer-BDI-content\"]")
    public WebElement Submit;

}
