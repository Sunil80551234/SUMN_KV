package SUMN.SUMN;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webdriverbasics {

	public static void main(String[] args) {
	
 WebDriver driver = new FirefoxDriver();
 driver.get("https://app.planitpoker.com");
 String title = driver.getTitle();
 System.out.println(title);
 
 if (title.equals("PlanITpoker"))
 {
	 System.out.println("True");
 }
 else {
	 System.out.println("False");
 }
 
 driver.quit();
 
 	//System.out.println(driver.getPageSource());
 
 
	}
}
