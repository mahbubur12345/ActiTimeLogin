package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMActtimeLogin 
{
  //Declaration
 @FindBy(xpath= "//input[@name='username']")
 private WebElement usernameTextfield;
 
 @FindBy(xpath= "//input[@name='pwd']")
 private WebElement passwordTextfield;
 
 @FindBy(id="keepLoggedInCheckBox")
 private WebElement keepMeLoggedInCheckbox;
 
 @FindBy (id="loginButton")
 private WebElement loginButton;
 
 //initialization
  public POMActtimeLogin(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
  
//utilization
  
  public void loginMethod()
  {
	  usernameTextfield.sendKeys("Admin");
	  passwordTextfield.sendKeys("manager");
	  keepMeLoggedInCheckbox.click();
	  loginButton.click();
  }
 
}
 
 
 
 
 

