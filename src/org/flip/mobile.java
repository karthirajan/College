package org.flip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mobile {
 public static void main(String args[]) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Documents\\git project\\college\\College\\driver\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver =new ChromeDriver();
	 driver.get("https://www.flipkart.com/");
	 
	//button[@class='_2KpZ6l _2doB4z']
 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();;
	
	
	 driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("mobiles");
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
	 
	 Thread.sleep(2000);
	 
			 WebElement src = driver.findElement(By.xpath("(//div[@class='_3FdLqY'])[2]"));	
			 
			 Actions a =new Actions(driver);
			 a.dragAndDropBy(src,-150,0);

 }

}
