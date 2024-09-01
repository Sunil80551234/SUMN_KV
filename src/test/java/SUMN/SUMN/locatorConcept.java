package SUMN.SUMN;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locatorConcept {

	public static void main(String[] args) {
		
		 WebDriver driver = new FirefoxDriver();
		 driver.get("https://formsmarts.com/form-builder-signup");

//		 Locator 1 = xpath
//		 
//		 driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("Sunil");
//		 
//		 driver.findElement(By.xpath("//input[@id='lname']")).sendKeys("Kumar");
//		 
//		 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sunilmngns@gmail.com");
//	
		 
//		 Locator 2 = ID
		 
//		 driver.findElement(By.id("fname")).sendKeys("Sunil");
//		 driver.findElement(By.id("lname")).sendKeys("Kumar");
//		 driver.findElement(By.id("email")).sendKeys("sunilmngns@gmail.com");
		 
		 
//		 Locator 3 = Name
		 
//		 driver.findElement(By.name("fname")).sendKeys("Sunil");
		 
		 
//		 Locator 4 = Link Text
		 
		 //driver.findElement(By.linkText("Read the Sign Up Help Page")).click();
		 

//		 Locator 5 = Partial Link Text
		 
//		 driver.findElement(By.partialLinkText("Read the Sign Up")).click();
		 
		 
//		 Locator 6 = CSS selector
		 
//		 driver.findElement(By.cssSelector("#fname")).sendKeys("Sunil");
		 
		 
//		 Locator 7 = Class Name
		 
//		 driver.findElement(By.className("checkbox")).click();
		 
	}

}
