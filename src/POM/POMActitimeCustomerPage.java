package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMActitimeCustomerPage 
{

	@FindBy(xpath="//a[@class= 'content tasks']")
	private WebElement taskLink;
	
	@FindBy (xpath = "//div[@ class='addNewButton']")
	private WebElement addNewButton;
	
	@FindBy(xpath = "//div[.= '+ New Customer']")
	private WebElement newCustomerLink;
	
	@FindBy(xpath="//input[@class = 'inputFieldWithPlaceholder newNameField inputNameField']")
	private WebElement enterCustomerNameTextfield;
	
	@FindBy(xpath="//div[.='Create Customer']")
	private WebElement createCustomerButton;
	
	public POMActitimeCustomerPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void customerMethod() throws InterruptedException
	{
		Thread.sleep(10000);
		taskLink.click();
		Thread.sleep(10000);
		addNewButton.click();
		newCustomerLink.click();
		Thread.sleep(10000);
		enterCustomerNameTextfield.sendKeys("Qspiders");
		createCustomerButton.click();
	}
}














