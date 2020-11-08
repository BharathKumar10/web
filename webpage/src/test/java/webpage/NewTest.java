package webpage;

import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

public class NewTest {
	WebDriver driver;
  @Test
  public void test() throws Exception {
	  
	  driver.get("https://phptravels.com/demo/ ");
	  String s= driver.getTitle();
	  System.out.println(s);
	  String expected="Demo Script Test drive - PHPTRAVELS";
	  Assert.assertEquals(s, expected);
	  driver.findElement(By.linkText("Demo")).click();
	  Thread.sleep(3000);

driver.findElement(By.xpath("//div[@id=\"mega-nav-navigation\"]/div/ul[2]/li/a")).click(); 
	 //driver.findElement(By.xpath("//*[@id=\"mega-nav-navigation\"]/div/ul[2]/li")).click();
	 
  }
//  @Test
//  public void test2() throws Exception  {
	 // JavascriptExecutor js=(JavascriptExecutor)driver;
	//  js.executeScript("window.scrollBy(611,447)", "");
//	  driver.findElement(By.xpath("//*[@id=\"Main\"]/section[2]/div/div/div[3]/div/div/div[2]/div[2]/div/div[1]/div/a")).click();
//	  Thread.sleep(3000);
//	  //driver.findElement(By.xpath("//*[@id=\"Main\"]/section[2]/div/div/div[3]/div/div/div[2]/div[2]/div/div[1]/div/a")).click();
//	  System.out.println(driver.getTitle());
//	 
	//String e = driver.getWindowHandle();
	  
	// Set<String> win = driver.getWindowHandles();
	// for(String wi:win)
	 //{
//		driver.switchTo().window(e);
//		System.out.println(driver.getTitle());
//		Thread.sleep(3000);
//		driver.findElement(By.name("email")).sendKeys("admin@phptravels.com");
//		Thread.sleep(2000);
//		driver.findElement(By.name("password")).sendKeys("demoadmin");
//        driver.findElement(By.className("btn btn-primary btn-block ladda-button fadeIn animated btn-lg")).click();		
//		 
	  
	 // driver.findElement(By.linkText("Company")).click();
	//  driver.findElement(By.xpath("//*[@id=\"mega-nav-navigation\"]/div/ul[1]/li[7]/button")).click();
	  //driver.findElement(By.linkText("Contact Us")).click();
	 // driver.findElement(By.cssSelector(//s))
	  //System.out.println(ass);
  
  //}
  //}
 
 // @Test
//  public void test3() throws Exception {
	// Thread.sleep(3000);
	 //driver.findElement(By.linkText("Blog")).click();
	//Set<String> win = driver.getWindowHandles();
//	for(String wi:win) {
	//	driver.switchTo().window(wi);
//		Thread.sleep(3000);
		//String title=driver.getTitle();
	//	System.out.println(title);
		
	//}//
	 
	 
 // }
  @BeforeClass
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\bharathkumar.rasale\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  }

  @AfterClass
  public void afterMethod() throws Exception {
	  Thread.sleep(3000);
	  driver.close();
	  Thread.sleep(2000);
  }

}
