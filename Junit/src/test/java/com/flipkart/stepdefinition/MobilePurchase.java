package com.flipkart.stepdefinition;



import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MobilePurchase {
	static WebDriver driver;
	
	@BeforeClass
	public static void launch() {
		WebDriverManager.chromedriver().setup();
		
		 driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@AfterClass
	public static void quit() {
		System.out.println("browser quit");
		driver.quit();
	}
	long startTime;
	
	@Before
	public void beforemethod() {
		System.out.println("before method");
		 startTime = System.currentTimeMillis();
	}
	@After
	public void aftermethod() {
		System.out.println("after method");
		long endTime = System.currentTimeMillis();
		System.out.println("Time taken :"+(endTime - startTime));
	}
	@Test
	public void method1() {
		System.out.println("login");
		WebElement drop = driver.findElement(By.xpath("//button[text()='✕']"));
		drop.click();
	}
	@Test
	public void method2() throws Throwable {
		System.out.println("mobile search");
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("realme mobiles");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	}
		@Test
		public void method3() {
			System.out.println("windows handling");
			String prt =driver.getWindowHandle();
			WebElement four = driver.findElement(By.xpath("(//div[@class='_4rR01T\'])[4]"));
			four.click();
			Set<String> child = driver.getWindowHandles();
			List<String> S2 = new ArrayList<String>(child);
			for (String s4 : S2) {
				if (!prt.equals(s4)) {
					driver.switchTo().window(s4);
					}}
				

		}
        
		@Test
		public void method4() throws Throwable {
			Thread.sleep(3000);
			System.out.println("add to cart");
			Thread.sleep(3000);
			WebElement add = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
			JavascriptExecutor js =(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(true);",add);
			String text = add.getText();
			
			
			Assert.assertTrue(add.isDisplayed());
			Assert.assertEquals("ADD", text);
			
		}

		
		

	}


 
