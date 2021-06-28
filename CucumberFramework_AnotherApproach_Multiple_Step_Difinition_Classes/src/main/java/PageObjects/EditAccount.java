package PageObjects;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vimalselvam.cucumber.listener.Reporter;

public class EditAccount 
{
public WebDriver driver;

public EditAccount(WebDriver driver)
{
this.driver=driver;	
PageFactory.initElements(driver, this);
}

public void navigateTo_EditAccountPage() 
{
driver.findElement(By.linkText("Edit Acount")).click();
}

@FindBy(name="accountno")
WebElement Account_ID;

@FindBy(name="AccSubmit")
WebElement Submit_Button;

@FindBy(name="tctcid")
WebElement Customer_Number;

@FindBy(name="txtinitdep")
WebElement Account_Balance;



@FindBy(name="sub")
WebElement Button_Submit;

@FindBy(xpath="//table[@id='customer']/tbody//tr//td//p[contains(text(),'Account details updated Successfully!!!')]")
WebElement SuccessMessage;



public void performSearch()
{
Account_ID.sendKeys("94404");
Submit_Button.click();
}

public void EditDetails()
{
String generatedNumber = RandomStringUtils.randomNumeric(10);
Account_Balance.clear();
Account_Balance.sendKeys(generatedNumber);
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
