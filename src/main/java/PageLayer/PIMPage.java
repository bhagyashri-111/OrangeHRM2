package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class PIMPage extends BaseClass {
	
	@FindBy(xpath="//span[text()='PIM']")
	private WebElement PIMLink;
	
	@FindBy(xpath="//a[text()='Add Employee']")
	private WebElement addEmpButton;
	
	@FindBy(name="firstName")
	private WebElement firstname;
	
	@FindBy(name="middleName")
	private WebElement middlename;
	
	@FindBy(name="lastName")
	private WebElement lastname;
	
	@FindBy(xpath="//button[text()=' Save ']")
	private WebElement saveButton;
	
	public PIMPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnPIMLink()
	{
		Wait.click(PIMLink);
	}
	
	public void clickOnAddEmpButton()
	{
		Wait.click(addEmpButton);
	}
	
	public void createEmployee(String FName,String MName,String LName)
	{
	Wait.sendKeys(firstname, FName);
	Wait.sendKeys(middlename, MName);
	Wait.sendKeys(lastname, LName);
		
	}
	
	public void clickOnSaveButton()
	{
		Wait.click(saveButton);
	}
	
	
	

}
