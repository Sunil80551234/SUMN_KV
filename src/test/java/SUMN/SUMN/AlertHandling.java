package SUMN.SUMN;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new FirefoxDriver();
		 driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(5000);
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		
		String text = alert.getText();
		if(text.equals("Please enter a valid user")) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		
		alert.accept();
//		alert.dismiss(); //cancell button
	}

	private static char[] getText() {
		// TODO Auto-generated method stub
		return null;
	}


	}
