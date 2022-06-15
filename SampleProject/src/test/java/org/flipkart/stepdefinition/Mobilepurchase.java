package org.flipkart.stepdefinition;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.collections4.FactoryUtils;
import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mobilepurchase {
	public static void main(String[] args) throws InterruptedException, Throwable {
		System.setProperty("webdriver.chrome.driver","C:/eclipse workspace/selenium/driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String expectedURL = "https://www.flipkart.com/";
		driver.navigate().to(expectedURL);
		driver.manage().window().maximize();
		WebElement drop = driver.findElement(By.xpath("//button[text()='✕']"));
		drop.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("realme mobiles");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(2000);
		List<WebElement> god = driver.findElements(By.xpath("//div[@class='_4rR01T\']"));
	    String [] l2 =new String[god.size()];
	    int i=0;
           
            File f =new File("C:\\eclipse workspace\\SampleProject\\src\\test\\resources\\Mobilelist1.xlsx");
            
            FileOutputStream f1  =new FileOutputStream(f);
            HSSFWorkbook w =new HSSFWorkbook();
            HSSFSheet sheet = w.createSheet("ajith");
           
            for (WebElement a : god) {
				l2[i] =a.getText();
                 HSSFRow row=sheet.createRow(i); 
                 HSSFCell cell =row.createCell(0);
                 cell.setCellValue(l2[i]);
                 System.out.println(l2[i]);
				i++;
			}
          
           
            w.write(f);
            w.close();
            Thread.sleep(2000);
            String prt =driver.getWindowHandle();
            WebElement four = driver.findElement(By.xpath("(//div[@class='_4rR01T\'])[4]"));
            four.click();
            
            Set<String> child = driver.getWindowHandles();
            List<String> S2 = new ArrayList<String>(child);
          for (String s4 : S2) {
		    if (!prt.equals(s4)) {
				driver.switchTo().window(s4);
			}
		}
          Thread.sleep(2000);
            WebElement m4 = driver.findElement(By.xpath("//span[@class='B_NuCI']"));
            String mob=m4.getText();
            System.out.println(mob);
            
 File f3 =new File("C:\\eclipse workspace\\SampleProject\\src\\test\\resources\\Mobile4.xlsx");
            
            FileOutputStream f4  =new FileOutputStream(f3);
            HSSFWorkbook w1 =new HSSFWorkbook();
            HSSFSheet sheet1 = w1.createSheet("ajith1");
            HSSFRow row1=sheet1.createRow(0); 
            HSSFCell cell1 =row1.createCell(0);
            cell1.setCellValue(mob);
            
            w1.write(f3);
            w1.close();
            WebElement add = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
            JavascriptExecutor js =(JavascriptExecutor)driver;
            js.executeScript("arguments[0].scrollIntoView(true);",add);
            driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
            Thread.sleep(5000);
            TakesScreenshot tk =(TakesScreenshot)driver;
            File src =tk.getScreenshotAs(OutputType.FILE);
            File desc =new File("C:\\eclipse workspace\\SampleProject\\src\\test\\resources\\placeorder.png");
            FileUtils.copyFile(src,desc);
            
}}