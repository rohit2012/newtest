package webdriver2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTest {

	private WebDriver driver;
	
	@BeforeMethod
	public void setUP()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.gooogle.com");
	}
	
	@Test
	public void runTest()
	{
		driver.findElement(By.name("q")).sendKeys("selenium");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
