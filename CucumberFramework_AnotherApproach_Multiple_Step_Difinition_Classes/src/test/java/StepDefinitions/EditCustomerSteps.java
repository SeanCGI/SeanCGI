package StepDefinitions;

import PageObjects.EditCustomer;
import PageObjects.NewCustomer;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EditCustomerSteps 
{
LoginSteps stp;
EditCustomer editcustomer;


@Given("^Edit Customer Page is displayed$")	
public void EditCustomerPage() throws Throwable							
{
editcustomer = new EditCustomer(stp.driver);	
editcustomer.navigateTo_EditCustomerPage();	
}	


@When("^Search for the Customer$")				
public void SearchCustomer() throws Throwable							
{
editcustomer.performSearch();	
}	


@And("^Edit the Details$")				
public void EditCustomer() throws Throwable							
{
editcustomer.EditDetails();	
}	


@Then("^Customer's details gets updated$")
public void Customer_Updated()
{
editcustomer.VerifyDetailsGotUpdated();	
}
}
