package PageObjects;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class NewCustomer
{
public WebDriver driver;

@FindBy(name="name")
WebElement CustomerName;

@FindBy(name="rad1")
WebElement gender;

@FindBy(name="dob")
WebElement DateofBirth;

@FindBy(name="addr")
WebElement Address;

@FindBy(name="city")
WebElement City;

@FindBy(name="state")
WebElement State;

@FindBy(name="pinno")
WebElement PIN;

@FindBy(name="telephoneno")
WebElement MobileNumber;

@FindBy(name="emailid")
WebElement Email;

@FindBy(name="password")
WebElement Password;

@FindBy(xpath="//input[@name='sub']")
WebElement Submit;

//@FindBy(xpath="//td/label[contains(text(),'Date Field must not be blank')]")
@FindBy(xpath="//table[@id='customer']/tbody//tr//td/p[contains(text(),'Customer Registered Successfully!!!')]")
WebElement CustomerAddedMessage;

@FindBy(linkText="New Customer")
WebElement NewCustomerLink;

public NewCustomer(WebDriver driver)
{
this.driver=driver;	
PageFactory.initElements(driver, this);
}

public void navigateTo_HomePage() 
{
driver.findElement(By.linkText("New Customer")).click();
}

public void EnterDetails()
{
CustomerName.sendKeys("RAUNAQ");	
gender.click();	
DateofBirth.sendKeys("05/11/1989");
Address.sendKeys("6969 Bayers Road Halifax NS");
City.sendKeys("Halifax");
State.sendKeys("Nova Scotia");
PIN.sendKeys("1111111");
MobileNumber.sendKeys("9022094321");
String generatedString1 = RandomStringUtils.randomAlphabetic(10);
String generatedString2 = RandomStringUtils.randomAlphabetic(5);
Email.sendKeys(generatedString1+"@"+generatedString2+".COM");
Password.sendKeys("12345");
}

public void SubmitDetails()
{
Submit.click();	
}

public void VerifyCustomerGotAdded()
{
if(CustomerAddedMessage.isDisplayed())
{
System.out.println("SUCCESS");	
}
else
{
System.out.println("FAILURE");	
}
}


}
