package SUMN.SUMN;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) {
	
		WebDriver driver = new FirefoxDriver();
		 driver.get("https://selectorshub.com/xpath-practice-page/");
		 
//		driver.findElement(By.id("shub15")).sendKeys("Sunil.MN@esko.com");
		driver.findElement(By.id("pass")).sendKeys("1234");
		driver.findElement(By.name("company")).sendKeys("Esko");
		driver.findElement(By.name("company")).sendKeys("Esko");
		driver.findElement(By.name("mobile number")).sendKeys("8892760866");
		driver.findElement(By.xpath("//button[@value='Submit']")).click();
		driver.findElement(By.xpath("//button[@class='dropbtn']")).click();

		Select select = new Select(driver.findElement(By.xpath("//select[@id='cars']")));
		select.selectByValue("audi");
		
		driver.findElement(By.xpath("//input[@type='date']")).sendKeys("25/07/1993");
		
		
		
	}

}
