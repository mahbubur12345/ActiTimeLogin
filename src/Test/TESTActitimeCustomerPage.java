package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import POM.POMActitimeCustomerPage;
import POM.POMActtimeLogin;

public class TESTActitimeCustomerPage 
{
	@Test
	public void customer() throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.actitime.com");
		
		POMActtimeLogin logging =new POMActtimeLogin(driver);
		logging.loginMethod();
		
		
		POMActitimeCustomerPage customerobject=new POMActitimeCustomerPage(driver);
		customerobject.customerMethod();
	}

}
