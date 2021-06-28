package StepDefinitions;

import PageObjects.EditCustomer;
import PageObjects.NewAccount;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewAccountSteps 
{
LoginSteps stp;
NewAccount newaccount;
	

@Given("^New Account Page is displayed$")				
public void NewAccountPage() throws Throwable							
{
newaccount = new NewAccount(stp.driver);	
newaccount.navigateTo_NewAccountPage();
}	


@When("^Provide the Details$")				
public void NewAccountForm() throws Throwable							
{		
newaccount.AddNewAccount();
}	


@Then("^Customer's account details gets updated$")
public void CustomersAccount_Updated()
{
newaccount.VerifyAccountGotUpdated();	
stp.driver.close();
}
}
