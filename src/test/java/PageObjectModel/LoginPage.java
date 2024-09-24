package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	//Encapsulation=data+function
	
		WebDriver driver;
		
		//constructor
		public LoginPage (WebDriver driver)
		{
			this.driver=driver;
		}
		
		//Locators
		
		By username=By.name("username");
		By password=By.name("password");
		By loginbtn=By.xpath("//button[@type='submit']");
		
		//Action Methods
		
//		public void setUserName(String un)
//		{
//			driver.findElement(username).sendKeys(un);
//		}
	//	
	//	
//		public void setPassword(String pwd)
//		{
//			driver.findElement(password).sendKeys(pwd);
//		}
	//	
//		public void clickOnButton()
//		{
//			driver.findElement(loginbtn).click();
//			
//		}
		
		
		public void doLogin(String un,String pwd)
		{
			driver.findElement(username).sendKeys(un);
			driver.findElement(password).sendKeys(pwd);
			driver.findElement(loginbtn).click();
		}
		
		
		public String getAppTitle()
		{
			return driver.getTitle();
		}
		
		public String getUrl()
		{
			return driver.getCurrentUrl();
		}
		
}
