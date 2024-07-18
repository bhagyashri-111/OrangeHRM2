package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class LoginPage extends BaseClass {
	
	@FindBy(name="username")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="//button[text()=' Login ']")
	private WebElement loginButton;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterCredentials(String Uname,String Pass)
	{
		Wait.sendKeys(username, Uname);
		Wait.sendKeys(password, Pass);
	}
	
	public void clickOnLoginButton()
	{
		Wait.click(loginButton);
	}
	
	

}
