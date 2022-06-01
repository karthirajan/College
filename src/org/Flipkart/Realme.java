package org.Flipkart;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.openqa.selenium.support.ui.Select;

public class Realme {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.edge.driver","C:\\Users\\haroa\\eclipse-workspace\\Flipkart\\driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Actions a = new Actions(driver);
		
		
		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys("Realme mobiles");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		a.dragAndDropBy(driver.findElement(By.xpath("//div[@class='_31Kbhn WC_zGJ']")), -150,0).perform();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Price -- High to Low']")).click();
		Thread.sleep(3000);
		
		List<WebElement> element = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		for(int i=0; i<element.size();i++) {
			WebElement name = element.get(0);
			String cost = name.getText();
			System.out.println(cost);
		
			//Integer j= Integer.valueOf(cost);
			//System.out.println(j);
			break;
		}
		
	    driver.findElement(By.xpath("//div[text()='ringme']")).click();
	    Thread.sleep(3000);
	    WebElement ringme = driver.findElement(By.xpath("//div[@class='_4rR01T']"));
	    String text1 = ringme.getText();
	    System.out.println(text1);
	    if(text1.contains("ringme")) {
	    	System.out.println("Ringme mobile got verifed" );
	    }
	    else {
	    	System.out.println("not verifed");
	    }
	    driver.findElement(By.xpath("//div[text()='1GB and Below']")).click();
	    WebElement filter = driver.findElement(By.xpath("//div[@class='_1xc7yr']"));
	    String text3 = filter.getText();
	    System.out.println(text3);
	    
	    TakesScreenshot tk = (TakesScreenshot)driver;
	    Thread.sleep(3000);
	    File sorce = tk.getScreenshotAs(OutputType.FILE);
	    File trg = new File("C:\\Users\\haroa\\eclipse-workspace\\Flipkart\\library\\ringme.png");
	    FileUtils.copyFile(sorce, trg);
	

	
	}
}
