package PageObjects;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.vimalselvam.cucumber.listener.Reporter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.aventstack.extentreports.Status;
import java.util.concurrent.TimeUnit;

public class Login 
{
public WebDriver driver;
	
public Login(WebDriver driver)
{
this.driver=driver;	
PageFactory.initElements(driver, this);
}

public void EnterUserName(String User) 
{
driver.findElement(By.name("uid")).sendKeys(User);
}	
	
public void EnterPwd(String Password) 
{
driver.findElement(By.name("password")).sendKeys(Password);
}	
	
public NewCustomer ClickOnLoginButton()
{
driver.findElement(By.name("btnLogin")).click();
Reporter.addStepLog("THIS IS SAMPLE LOG");  //////////// THIS WORKED tooo
driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
return new NewCustomer(driver);
}	

}
