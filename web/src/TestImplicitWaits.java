import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestImplicitWaits
{
    //implicit wait provide to load DOM object for a particular of time before trying to locate element on page.
	//Default implicit wait is 0. We need to set implicit wait once and it apply for whole life of Webdriver object.
	
	public static void main(String[] args)throws Exception
	{
		// TODO Auto-generated method stub
		 FirefoxDriver driver;
         String baseUrl; 
         
         driver = new FirefoxDriver();
         baseUrl = "http://www.wikipedia.org/";
         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
         
         driver.get(baseUrl + "/wiki/Main_Page");
         
        	 Thread.sleep(10000);
         
         
         driver.findElement(By.id("searchInput")).sendKeys("America");
         try{
        	 Thread.sleep(10000);
         }
         catch(Exception e)
         {}
         //driver.findElement(By.id("searchInput")).clear();
         WebElement w=driver.findElement(By.id("searchInput"));
         w.sendKeys("India");
        WebElement w1=driver.findElement(By.id("searchButton"));
        w1.click(); 
         //driver.quit(); 
	System.out.println("ok");}
}
