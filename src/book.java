package org.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class book {
	public static void main(String[] args) throws  Throwable   {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prasanna\\eclipse-workspace\\enhanced\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		
		 
		
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
		WebElement gill = driver.findElement(By.xpath("//section[@class='JWMl0H _2hbLCH']"));
		System.out.println(gill.getText());
		driver.findElement(By.xpath("(//div[text()='2 GB'])")).click();
		TakesScreenshot tk = (TakesScreenshot) driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File desc = new File("C:\\Users\\Prasanna\\eclipse-workspace\\enhanced\\drive\\loop.png");
		FileUtils.copyFile(src,desc);
	}
}
