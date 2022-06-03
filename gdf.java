
public class gdf {
	public class mobile {
		 public static void main(String args[]) throws InterruptedException {
			 System.setProperty("webdriver.chrome.driver","E:\\Users\\5767\\Documents\\Git Projects\\New folder (2)\\College\\driver\\chromedriver.exe");
			 WebDriver driver =new ChromeDriver();
			 driver.get("https://www.flipkart.com/");
			 
				 driver.findElement(By.xpath("//button[text()='✕']")).click();
			
			
			 driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("mobiles",Keys.Enter);
			
			 
			 Thread.sleep(2000);
			 
			 a.dragAndDropBy driver.findElement(By.xpath("(//div[@class='_3FdLqY'])[2]")),-150,0).perform();	
					 
				 Actions a =new Actions(driver);
					 //;
					 

		 }

		}


}
