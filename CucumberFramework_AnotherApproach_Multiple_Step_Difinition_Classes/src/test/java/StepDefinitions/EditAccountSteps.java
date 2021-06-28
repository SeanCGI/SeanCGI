package StepDefinitions;

import PageObjects.EditAccount;
import PageObjects.EditCustomer;
import PageObjects.NewCustomer;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EditAccountSteps 
{
LoginSteps stp;
EditAccount editaccount;


@Given("^Edit Account Page is displayed$")	
public void EditAccountPage() throws Throwable							
{
editaccount = new EditAccount(stp.driver);	
editaccount.navigateTo_EditAccountPage();	
}	


@When("^Search for the Account$")				
public void SearchAccount() throws Throwable							
{
editaccount.performSearch();	
}	


@And("^Edit the Account Details$")				
public void EditAccount() throws Throwable							
{
editaccount.EditDetails();	
}	


@Then("^Account's details gets updated$")
public void Account_Updated()
{
editaccount.VerifyDetailsGotUpdated();	
}
}
