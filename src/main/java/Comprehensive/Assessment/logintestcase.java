package Comprehensive.Assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class logintestcase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
	}

}
