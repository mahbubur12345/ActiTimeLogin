package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class POMActiitimeWorkPage
{
	
	@FindBy (xpath = "(//div[@ class='menu_icon'])[2]")
	private WebElement settingLink;
	
	@FindBy (xpath = "//a[. = 'Types of Work']")
	private WebElement typesOfWorkLink;
	
	@FindBy(xpath = "//span[. = 'Create Type of Work']")
	private WebElement createTypeofWork;
	
	@FindBy (xpath = "//input[@name = 'name']")
	private WebElement nameTextfield;
	
	@FindBy(xpath = "//select[@ name = 'active']")
	private WebElement statusDropDown;
	
	@FindBy(xpath = "//label[. = 'Billable']")
	private WebElement billableCheckbox;
	
	@FindBy (xpath = "//label[. = 'Non-Billable']")
	private WebElement nonbillableCheckbox;
	
	@FindBy(xpath = "//input[@type = 'submit']")
	private WebElement createWorkButton;
	
	
	public POMActiitimeWorkPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void workMethod() throws InterruptedException
	
	{
		Thread.sleep(10000);
		settingLink.click();
		typesOfWorkLink.click();
		Thread.sleep(10000);
		createTypeofWork.click();
		Thread.sleep(10000);
		nameTextfield.sendKeys("Planning1");
		
		Select sel = new Select(statusDropDown);
		sel.selectByVisibleText("active");
		
		nonbillableCheckbox.click();
		Thread.sleep(10000);
		createWorkButton.click();	
		
	}
}
