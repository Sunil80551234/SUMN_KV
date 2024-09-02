package SUMN.SUMN;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleFileUpload {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new FirefoxDriver();
		 driver.get("https://selectorshub.com/xpath-practice-page/");
		 Thread.sleep(25000);
		
		driver.findElement(By.xpath("//input[@id='myFile']")).sendKeys("C:\\Users\\sumn\\OneDrive - Veralto\\Desktop\\Test files\\JPG.jpg");
		
		
		

	}

}
