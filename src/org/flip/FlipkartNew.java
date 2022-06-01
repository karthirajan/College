package org.flip;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartNew {


public static void main(String[] args) throws Exception {
	

	System.setProperty("webdriver.chrome.driver", "F:\\Git projeccts\\College\\College\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String url = "https://www.flipkart.com/";
		driver.get(url);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]")).sendKeys("9965309666");
		driver.findElement(By.xpath("(//input[@autocomplete='off'])[3]")).sendKeys("sudhasen3214@");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Thread.sleep(3000);
		
		WebElement home = driver.findElement(By.xpath("//div[text()='Mobiles']"));
		home.click();
		Thread.sleep(1000);
		
		WebElement act1 = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div/section[2]/div[3]/div[1]/div[2]/div"));
		Thread.sleep(2000);
		
		Actions s = new Actions(driver);
		
		s.dragAndDropBy(act1, -110, 0).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='realme']")).click();
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0, 600)");
		
		driver.findElement(By.xpath("//div[text()='2 GB']")).click();
		        
		System.out.println(driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[1]/div/div[1]/div/section[1]/div[2]/div[1]")).getText());
		
		TakesScreenshot js = (TakesScreenshot)driver;
		File sa=js.getScreenshotAs(OutputType.FILE);
		String title= driver.getTitle();
		File tar= new File("C:\\Users\\SUDHASEN\\eclipse-workspace\\SeleniumProject\\screenshot\\newflip.png");
		FileUtils.copyFile(sa, tar);
		
}

}
