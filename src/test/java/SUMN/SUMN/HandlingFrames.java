package SUMN.SUMN;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingFrames {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new FirefoxDriver();
		 driver.get("http://localhost:51089/sign-in");
		 Thread.sleep(5000);
		 
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 
		 driver.findElement(By.id("outlined-adornment-username")).sendKeys("administrator");
		 driver.findElement(By.xpath("//span[contains(text(),'Sign in')]")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//span[@class='jss84']//*[@class='MuiSvgIcon-root']")).click();
		 driver.findElement(By.xpath("//span[contains(text(),'Manage Filters')]")).click();
		
		
		
		
	}

}
