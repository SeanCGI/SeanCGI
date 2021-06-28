package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAccount 
{
@FindBy(name="cusid")
WebElement CustomerId;

@FindBy(name="inideposit")
WebElement InitialDeposit;

@FindBy(name="button2")
WebElement SUBMIT;

@FindBy(xpath="//table[@id='account']/tbody//tr//td//p[contains(text(),'Account Generated Successfully!!!')]")
WebElement SuccessText;

public WebDriver driver;

public NewAccount(WebDriver driver)
{
this.driver=driver;	
PageFactory.initElements(driver, this);
}

public void navigateTo_NewAccountPage() 
{
driver.findElement(By.linkText("New Account")).click();
}

public void AddNewAccount() 
{
CustomerId.sendKeys("35322");
InitialDeposit.sendKeys("20000000000");
SUBMIT.click();
}

public void VerifyAccountGotUpdated()
{
if(SuccessText.isDisplayed())
{
System.out.println("SUCCESS");	
}
else
{
System.out.println("FAILURE");	
}
}
}
