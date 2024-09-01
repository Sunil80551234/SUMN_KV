package SUMN.SUMN;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropBox {

	public static void main(String[] args) {
	
		 WebDriver driver = new FirefoxDriver();
		 driver.get("https://formsmarts.com/form-builder-signup");
		 
		 Select select = new Select(driver.findElement(By.id("country")));   //dropdown select
		 select.selectByVisibleText("Iceland");
		
		 driver.findElement(By.xpath("//input[@id='tou']")).click();    //checkbox click
		
		
		
		
		
	}

}
