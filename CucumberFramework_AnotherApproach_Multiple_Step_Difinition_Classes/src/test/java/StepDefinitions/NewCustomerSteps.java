package StepDefinitions;

import java.util.concurrent.TimeUnit;
import PageObjects.NewCustomer;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewCustomerSteps
{
LoginSteps stp;
NewCustomer newcustomer;


@Given("^Click on New Customer Link$")
public void New_Customer()
{
stp.driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);	
newcustomer = new NewCustomer(stp.driver);	
newcustomer.navigateTo_HomePage();
}	


@When("^User enters value for all the required fields$")
public void New_Customer_Fields()
{
newcustomer.EnterDetails();		
}


@And("^Clicks on the Submit button$")
public void New_Customer_Submit()
{
newcustomer.SubmitDetails();	
}


@Then("^New Customer gets added$")
public void New_Customer_Added()
{
newcustomer.VerifyCustomerGotAdded();
}
	
}
