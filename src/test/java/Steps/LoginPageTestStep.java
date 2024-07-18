package Steps;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageTestStep extends BaseClass {
	
	private static LoginPage loginPage;
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		
		BaseClass.initialization();

	}

	@When("user enter valid username and password")
	public void user_enter_valid_username_and_password() {
		
		String username=prop.getProperty("USERNAME");
		String password=prop.getProperty("PASSWORD");
		
		loginPage=new LoginPage();
		
		loginPage.enterCredentials(username,password);
		
		
	}

	@Then("user click on login button")
	public void user_click_on_login_button() {
		loginPage.clickOnLoginButton();
	   
	}

	
	

}
