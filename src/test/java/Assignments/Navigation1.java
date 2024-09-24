package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation1 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		// WebDriver script to navigate to a website and click on a specific link.
		
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				
				driver.get("https://www.google.com");
				System.out.println("Title of page1: "+driver.getTitle());
				Thread.sleep(10);
				
				driver.navigate().to("https://www.zoho.com");
				System.out.println("Title of page2: "+driver.getTitle());
				
				driver.findElement(By.xpath("//a[@href='https://twitter.com/zoho']")).click();		
				
			
		
		
		
	}

}
