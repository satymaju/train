import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.lang.*;
public class crossbrow {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:/Users/satymaju/Desktop/New folder (10)/chromedriver.exe");

		System.out.println("ok");
		String u="https://github.com/";
		try {
		WebDriver d1=new ChromeDriver();
		d1.get(u);}
		//WebDriver d=new ChromeDriver();
		//d.get(u);}
		catch(Exception e){System.out.println("ok1");
		
	
		System.out.println(e.getMessage());}
		System.out.println("ok2");
		
		// TODO Auto-generated method stub

	}

}
