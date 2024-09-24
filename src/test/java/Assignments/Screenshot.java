package Assignments;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Screenshot {
  @Test
  public void testCapture() throws IOException 
  {
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.nasa.gov/");
	 
	 TakesScreenshot ts=(TakesScreenshot) driver;
	 File temp=ts.getScreenshotAs(OutputType.FILE);
	 File dest=new File(System.getProperty("user.dir")+"//Screenshots//nasa2.png");
 
	 FileHandler.copy(temp, dest);
	  
  }
}
