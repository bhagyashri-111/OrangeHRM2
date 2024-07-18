package Steps;

import org.junit.jupiter.api.Assertions;

import BaseLayer.BaseClass;
import PageLayer.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class HomePageTestStep extends BaseClass {
	
	private static HomePage homePage;

@Given("user is on home page Validate Home URL")
public void user_is_on_home_page_validate_home_url() {
    
	 homePage=new HomePage();
	 
	String actualUrl=homePage.checkHomeURL();
	Assertions.assertEquals(actualUrl.contains("orange"), true);
	

}

@Then("Validate Home Title")
public void validate_home_title() {
	
	String actualTitle=homePage.checkHomeTitle();
    Assertions.assertEquals(actualTitle, "OrangeHRM");

}

@Then("Validate Home Logo")
public void validate_home_logo() {
	
	boolean actualLogo=homePage.checkHomeLogo();
	Assertions.assertTrue(actualLogo);


}
	
	
	

}
