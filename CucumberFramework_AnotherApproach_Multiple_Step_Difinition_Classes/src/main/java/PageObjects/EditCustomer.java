package PageObjects;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vimalselvam.cucumber.listener.Reporter;

public class EditCustomer 
{
public WebDriver driver;

public EditCustomer(WebDriver driver)
{
this.driver=driver;	
PageFactory.initElements(driver, this);
}

public void navigateTo_EditCustomerPage() 
{
driver.findElement(By.linkText("Edit Customer")).click();
}

@FindBy(name="cusid")
WebElement Customer_ID;

@FindBy(name="AccSubmit")
WebElement Submit_Button;

@FindBy(name="telephoneno")
WebElement MobileNumber;

@FindBy(name="sub")
WebElement Button_Submit;

@FindBy(xpath="//table[@id='customer']/tbody//tr//td//p[contains(text(),'Customer details updated Successfully!!!')]")
WebElement SuccessMessage;



public void performSearch()
{
Customer_ID.sendKeys("35322");
Submit_Button.click();
}

public void EditDetails()
{
String generatedNumber = RandomStringUtils.randomNumeric(10);
MobileNumber.clear();
MobileNumber.sendKeys(generatedNumber);
Button_Submit.click();
}

public void VerifyDetailsGotUpdated()
{
if(SuccessMessage.isDisplayed())
{
System.out.println("SUCCESS");	
}
else
{
System.out.println("FAILURE");	
}
}

}
