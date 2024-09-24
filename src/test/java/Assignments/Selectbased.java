package Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectbased {

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.instagram.com/");
		WebElement ele=driver.findElement(By.xpath("//*[contains(@aria-label,'Switch Display Language')]"));
		
		Select sc=new Select(ele);
		System.out.println("Is dropdown support multiple selection?: "+sc.isMultiple());
		
		
		List<WebElement>OptionList=sc.getOptions();
		System.out.println("Total Options are: "+OptionList.size());
		
		for (WebElement elementloop:OptionList)
		{
			System.out.println("Printing all the option values:"+elementloop.getText());		
		}
		
		
	}

}
