package org.firstfloor;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Flipkarttask {
	public static void main(String[] args) throws InterruptedException, Throwable {
		System.setProperty("webdriver.chrome.driver","C:/eclipse workspace/selenium/driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String expectedURL = "https://www.flipkart.com/";
		driver.navigate().to(expectedURL);
		driver.manage().window().maximize();
	    
		String prt =driver.getWindowHandle();
		WebElement drop = driver.findElement(By.xpath("//button[text()='✕']"));
		drop.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("mobiles");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(2000);
		
		 WebElement Drag = driver.findElement(By.xpath("(//div [contains (@style, 'transform')])[2]"));
		 Actions a = new Actions (driver);
		 a.dragAndDropBy(Drag, -150, 0).perform();
		
		 Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_24_Dny']")).click();
		Thread.sleep(4000);
		WebElement fil = driver.findElement(By.xpath("//section[@class='JWMl0H _2hbLCH']"));
		System.out.println(fil.getText());
		driver.findElement(By.xpath("(//div[text()='2 GB'])")).click();
		TakesScreenshot tk = (TakesScreenshot) driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File desc = new File("C:\\eclipse workspace\\selenium\\driver\\flipkart.png");
		FileUtils.copyFile(src,desc);
		 
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
	}

}
