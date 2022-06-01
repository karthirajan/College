package Flipkart.org;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OderAnProdect {
	

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\balas\\eclipse-workspace\\Flipkart\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//input[@autocomplete = 'off'])[2]")).sendKeys("9443822714");
		driver.findElement(By.xpath("(//input[@autocomplete = 'off'])[3]")).sendKeys("bala@1704");
		driver.findElement(By.xpath("(//button[@type= 'submit'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("mobile");
		driver.findElement(By.xpath("//button[@type= 'submit']")).click();
		Thread.sleep(3000);
		WebElement source = driver.findElement(By.xpath("//div[@class='_31Kbhn WC_zGJ']"));
		
		
		Actions a = new Actions (driver);
		Thread.sleep(2000);
		a.dragAndDropBy(source, -150, 0).perform();
		Thread.sleep(2000);
		
		WebElement price = driver.findElement(By.xpath("//div[@class='_3sckoD']"));
		
		String s = price.getText();
		System.out.println(s);
		
		Thread.sleep(2000);
		
	    driver.findElement(By.xpath("(//div[@class='_24_Dny'])[14]")).click();
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("ringme");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    Thread.sleep(2000);
	    
	    WebElement phone = driver.findElement(By.xpath("(//div[contains(text(),'2183')])[1]"));
	    phone.click();
	    String s1 = phone.getText();
		System.out.println(s1);
		Thread.sleep(3000);
		String prwnd = driver.getWindowHandle();
		
		Set<String> allwin = driver.getWindowHandles();
		for(String x :allwin ) {
			if(!x.equals(prwnd)){
				driver.switchTo().window(x);
				
			}
		}
		Thread.sleep(2000);
		TakesScreenshot tk = (TakesScreenshot)driver;
		File scr = tk.getScreenshotAs(OutputType.FILE);
		File trg = new File("C:\\Users\\balas\\eclipse-workspace\\Flipkart\\scrsht\\flipkart.png");
		FileUtils.copyFile(scr,trg);
		
		
		
	    
	    
	    
	    
		
		
		
		}
}
		

		
			
		
		
		
		
		
	

