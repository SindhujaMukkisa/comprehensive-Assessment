package Comprehensive.Assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mindtree {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
          System.setProperty("webdriver.chrome.driver","C:\\Users\\mindsdet313\\Desktop\\chromedriver.exe");
          WebDriver driver = new ChromeDriver();
          //open valid url
          driver.get("https://urbanladder.com");
          driver.findElement(By.xpath("//span[@class='header-icon-link user-profile-icon']")).click();
 		 driver.findElement(By.xpath("//a[@class='login-link authentication_popup']")).click();
 		 Thread.sleep(5000);
 	
 		 driver.findElement(By.xpath("//input[@autofocus='autofocus']")).sendKeys("sindhuja.mukkisa@gmail.com");
 		 driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Sindhuja@8");
 		 driver.findElement(By.xpath("//input[@class='button primary']")).click();
 		 Thread.sleep(5000);

          // verify the valid functionality search bar
          WebElement searchBox=driver.findElement(By.id("search"));
          searchBox.sendKeys("living");
          searchBox.submit();
          WebElement d1=driver.findElement(By.xpath("//*[@id='search']"));
          d1.click();
          WebElement search=driver.findElement(By.id("search"));
          search.sendKeys("Izmir Decadence Fabric Sofa");
          search.submit();
          WebElement d2=driver.findElement(By.xpath("*//[src='\"sofaoverviewlist\"]/div/div/li[2]/img'"));
          d2.click();
          WebElement box=driver.findElement(By.id("search"));
          box.sendKeys("ADD TO CART");
          box.submit();
          WebElement d3=driver.findElement(By.xpath("//*[id='add-to-cart-button']"));
          d3.click();
	}

}
