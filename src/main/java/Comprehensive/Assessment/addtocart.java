package Comprehensive.Assessment;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class addtocart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mindsdet313\\Desktop\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://urbanladder.com");
		 ArrayList<String> it=new ArrayList<String>(driver.getWindowHandles());
	        driver.switchTo().window(it.get(1));
	        driver.findElement(By.xpath("(//div[@class='product_brand_name'])[4]")).click();
	        
	        ArrayList<String> itt=new ArrayList<String>(driver.getWindowHandles());
	        driver.switchTo().window(itt.get(2));
	        driver.findElement(By.xpath("//button[@id='add-to-button']")).click();
	}

}
