package Steps;

import BaseLayer.BaseClass;
import PageLayer.PIMPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PIMPageTestStep extends BaseClass{
	
	private static PIMPage pimPage;


@Given("user is on PIM Page click on PIM link")
public void user_is_on_pim_page_click_on_pim_link() {

	 pimPage=new PIMPage();
	 
	 pimPage.clickOnPIMLink();
	 
	

}

@When("User click on add employee button")
public void user_click_on_add_employee_button() {
	
	pimPage.clickOnAddEmpButton();
   
}

@Then("create employee enter {string},{string} and {string}")
public void create_employee_enter_and(String FirstName, String MiddleName, String LastName) {
	
	pimPage.createEmployee(FirstName, MiddleName, LastName);


}

@Then("click on saveButton")
public void click_on_save_button() {
	
	pimPage.clickOnSaveButton();
 
}
	
}
