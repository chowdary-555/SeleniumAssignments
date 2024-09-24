package PageObjectModel;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass 
{
	
	
	
      @Test(priority=1)
      public void validateUrl() 
      {
    	//LoginPage lp=new LoginPage(driver);
    	  
    		String actUrl=lp.getUrl();
    		Assert.assertTrue(actUrl.contains("login"),"Url not matched!");
    		System.out.println("Url is matched!");
    			
      }
	  
	  
	  
	  @Test(priority=2)
	  public void validateTitle() 
	  {
		//LoginPage lp=new LoginPage(driver);
		  
			String actTitle=lp.getAppTitle();
			Assert.assertTrue(actTitle.contains("Practice"),"Title is not matched!");
			System.out.println("Title is matched!");
	  }   
	  
	  
	  
	  @Test(priority=3)
	  public void validateLogin() 
	  {
		//LoginPage lp=new LoginPage(driver);
//		  lp.setUserName("practice");
//		  lp.setPassword("SuperSecretPassword");
//		  lp.clickOnButton();
		  
		  
		  lp.doLogin("practice","SuperSecretPassword!");
		  Assert.assertTrue(driver.getCurrentUrl().contains("expand"),"LoginFail!");
		  System.out.println("Login Pass!");	  
	  
	  
  }
}
