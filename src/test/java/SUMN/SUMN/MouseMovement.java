package SUMN.SUMN;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		 driver.get("https://selectorshub.com/xpath-practice-page/");
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 Thread.sleep(10000);
		 
		 Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("Products"))).build().perform();
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("SelectorsHub")).click();
		

	}

}
