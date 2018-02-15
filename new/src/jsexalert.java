import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class jsexalert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String sText;
		WebDriver d=new FirefoxDriver();
		JavascriptExecutor js=(JavascriptExecutor)d;
		js.executeScript("history.go(0)");
		d.get("file:///D:/Users/satymaju/Desktop/Old%20Firefox/Selenium/Selenium%20Installations/Selenium%20Demos%20&%20Lab%20files/Lesson%205-HTML%20Pages/Lesson%205-HTML%20Pages/AlertExample.html");
	sText=js.executeScript("return document.title;").toString();	
	System.out.println(sText);
	d.findElement(By.name("txtName")).sendKeys("Me");
	WebElement b=d.findElement(By.name("btnAlert"));
	
	//perform click on show Alert box button using javascriptexecutor
	//js.executeScript("arguments[0].click();",b);
	js.executeScript("alert('hello world');");	
	}

}
