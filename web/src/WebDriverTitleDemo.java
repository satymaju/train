import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class WebDriverTitleDemo
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
        /*File pathToBinary = new File("C:/Program Files/Mozilla Firefox/firefox.exe");
		FirefoxProfile firefoxProfile = new FirefoxProfile();
		FirefoxBinary binary = new FirefoxBinary(pathToBinary);*/
		WebDriver driver = new FirefoxDriver();
		
		
		 driver.get("http://docs.seleniumhq.org/");
        
      

        // launch Firefox and direct it to the Base URL
       
        String actualTitle = driver.getTitle();
        String expectedTitle = "Selenium - Web Browser Automation";
        // get the actual value of the title
        

        if (actualTitle.contentEquals(expectedTitle))
        {
             System.out.println("Test Passed!");
         } 
         else
        {
             System.out.println("Test Failed");
         }      

         //Close browser window 
        
        driver.close();
	}

}
