package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Generic.utility;

public class Registrationform2 {

	public static void main(String[] args) 
	
	{

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		
		driver.findElement(By.linkText("Create new account")).click();
	    
		WebElement firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
		System.out.println("Is firstname is enabled?:"+firstname.isEnabled());
		firstname.sendKeys("Sathish");
		
		WebElement lastname=driver.findElement(By.xpath("//input[@name='lastname']"));
		System.out.println("Is lastname is enabled?:"+lastname.isEnabled());
		lastname.sendKeys("Moparthi");
		
		WebElement regemail=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		System.out.println("Is regemail is enabled?:"+regemail.isEnabled());
		regemail.sendKeys("Sathish12@gmail.com");
		
		WebElement regpasswd=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		System.out.println("Is regpasswd is enabled?:"+regpasswd.isEnabled());
		regpasswd.sendKeys("@sathish0910");
		
		
		WebElement dayele=driver.findElement(By.id("day"));
	    utility.selectBasedDropdown(dayele,"9");
	    
	   
	    WebElement monthdd=driver.findElement(By.id("month"));
	    utility.selectBasedDropdown(monthdd,"Oct");
	   
	  
	    WebElement yeardd=driver.findElement(By.id("year"));
	    utility.selectBasedDropdown(yeardd,"1999");
	    
	    WebElement gender=driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		System.out.println("Is gender is enabled?:"+gender.isEnabled());
		gender.click();
		
		WebElement Signup=driver.findElement(By.xpath("//button[@name='websubmit']"));
		System.out.println("Is Signup button is enabled?:"+Signup.isEnabled());
		
		
		
		
		
		
		
		
		
		
	}

}
