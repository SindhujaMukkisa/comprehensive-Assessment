package Comprehensive.Assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchTestcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\mindsdet313\\Desktop\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://urbanladder.com");
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
	}

}
