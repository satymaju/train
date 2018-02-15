import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class myalert {

	public static void main(String[] args) {
		FirefoxDriver f= new FirefoxDriver();
		String b="file:///D:/Users/satymaju/Desktop/Old%20Firefox/Selenium/Selenium%20Installations/Selenium%20Demos%20&%20Lab%20files/Lesson%205-HTML%20Pages/Lesson%205-HTML%20Pages/AlertExample.html";
		f.get(b);
		
		WebElement t=f.findElement(By.name("btnAlert"));
	 t.click();
		Alert s=f.switchTo().alert();
		String at=s.getText();
		System.out.println("Aleert:"+at);
		//s.accept();
		try {
			Thread.sleep(10000);
		}
		catch(Exception e)
		{
			
		}
		//s.dismiss();
		
		
		
		
		
	
		// TODO Auto-generated method stub

	}

}
