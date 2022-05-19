package Comprehensive.Assessment;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assessment {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\mindsdet313\\Desktop\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://urbanladder.com");
		 driver.findElement(By.xpath("//span[@class='header-icon-link user-profile-icon']")).click();
		 driver.findElement(By.xpath("//a[@class='login-link authentication_popup']")).click();
		 Thread.sleep(5000);
	
		 driver.findElement(By.xpath("//input[@autofocus='autofocus']")).sendKeys("sindhuja.mukkisa@gmail.com");
		 driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Sindhuja@8");
		 driver.findElement(By.xpath("//input[@class='button primary']")).click();
		 Thread.sleep(5000);
		 WebElement searchBox=driver.findElement(By.id("search"));
         searchBox.sendKeys("study");
         searchBox.submit();
         WebElement d1=driver.findElement(By.xpath("//*[@id='search']"));
         d1.click();
         WebElement search=driver.findElement(By.id("search"));
         search.sendKeys("study chairs");
         search.submit();
         WebElement d2=driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div/ul/li[1]/div/a/img"));
         d2.click();
        ArrayList<String> it=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(it.get(1));
        driver.findElement(By.xpath("(//div[@class='product_brand_name'])[4]")).click();
        
        ArrayList<String> itt=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(itt.get(2));
        driver.findElement(By.xpath("//button[@id='add-to-button']")).click();
	}

}
