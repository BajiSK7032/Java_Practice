package Selenium_PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage {
	
	

	
	


		@FindBy (id="__xmlview1--idUname-inner")
	    public WebElement UserName;
	

	@FindBy (id="__xmlview1--idPass-inner")
    public WebElement Password;
	

	@FindBy (id="__button1-inner")
    public WebElement loginButton;
	
	@FindBy (id="__button2-inner")
	public WebElement Reset_PassWord;
	
	@FindBy (id="__xmlview1--idRegisterBtn-inner")
	public WebElement Register;
	
	@FindBy (xpath = "//span[@class=\"sapMText sapUiSelectable sapMTextMaxWidth\"]")
	public WebElement Version_detaails;
	
	
//	@FindBy (xpath="//*[@id=\"__button13-BDI-content\"]")
//    public WebElement otpSubmit;
	
}
