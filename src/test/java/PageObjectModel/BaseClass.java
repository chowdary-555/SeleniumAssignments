package PageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import PageObjectModel.LoginPage;

public class BaseClass 
{

	
	public WebDriver driver;
	   public LoginPage lp;
	   
	   @BeforeClass
	   public void setup()
	   {
		  driver=new ChromeDriver ();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.manage().window().maximize();
		  driver.get("https://practice.expandtesting.com/login");
		  lp=new LoginPage(driver);
		  
		  
	   }
}
