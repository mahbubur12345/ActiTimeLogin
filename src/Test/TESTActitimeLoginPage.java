package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import POM.POMActtimeLogin;

public class TESTActitimeLoginPage 
{
	@Test
	public void login() 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.actitime.com");
		
		POMActtimeLogin logging =new POMActtimeLogin(driver);
		logging.loginMethod();
	}
 
}
