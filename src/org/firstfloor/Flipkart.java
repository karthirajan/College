package org.firstfloor;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Flipkart {
	
	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bala karthi\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		
		// Launch website
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");

		// Maximize
		  driver.manage().window().maximize();
		
		  WebElement log = driver.findElement(By.xpath("(//input [@type = 'text'])[2]"));
		 log.sendKeys("9688593090");
		 
		  WebElement pass = driver.findElement(By.xpath("//input [@type = 'password']"));
		 pass.sendKeys("bala@123");
		 
		 WebElement logIn = driver.findElement(By.xpath("(//span[text() = 'Login'])[2]")); logIn.click();
		 
		 Thread.sleep(3000);
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 WebElement mobile = driver.findElement(By.xpath("//input [@type = 'text']")); 
		 mobile.sendKeys("Mobile");
		 mobile.sendKeys(Keys.ENTER);
		 
		 Thread.sleep(3000);
         WebElement priceDrag = driver.findElement(By.xpath("(//div [contains (@style, 'transform')])[2]"));
		 Actions a = new Actions (driver);
		 a.dragAndDropBy(priceDrag, -150, 0).perform();
		 
		 WebElement modelPrice = driver.findElement(By.xpath("//div [@class = '_3sckoD']"));
		  System.out.println("Mobile Price is: " + modelPrice.getText());
		 

		  Thread.sleep(3000);
		  WebElement ram = driver.findElement(By.xpath("//div [text() = '1GB and Below']"));
		  ram.click();
		  System.out.println("Ram: " + ram.getText());
		  
		  Thread.sleep(3000);
		  WebElement model = driver.findElement(By.xpath("(//input [@type = 'text'])[2]"));
		  model.sendKeys("ringme");
		  
		  Thread.sleep(3000);
		  WebElement modelType = driver.findElement(By.xpath("//div [text()= 'ringme']"));
		  modelType.click();
		  System.out.println("Mobile Type: " + modelType.getText());
		  
		  TakesScreenshot ts = (TakesScreenshot)driver;

		  File sc = ts.getScreenshotAs(OutputType.FILE);
		  File pa = new File ("C:\\Users\\Bala karthi\\OneDrive\\Documents\\Git Projects\\Colege 2\\College\\Scnap\\ FlipKartphone2.png");
		  FileUtils.copyFile(sc, pa);

}
}
