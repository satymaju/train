import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class implic_explicit {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FirefoxDriver driver=new FirefoxDriver();
		 WebDriverWait myWait=new WebDriverWait(driver,30);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 String baseurl="file:///D:/Users/satymaju/Desktop/Old%20Firefox/Selenium/Selenium%20Installations/Selenium%20Demos%20&%20Lab%20files/Lesson%205-HTML%20Pages/Lesson%205-HTML%20Pages/WorkingWithForms.html";
		 driver.get(baseurl);
		 //mywait.until(ExpectedConditions.visibilityOfElementlocated(By.id());
		 driver.findElement(By.id("txtUserName")).sendKeys("jagan");
	
		 
	}

}
