import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class salesforce {
		
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fsaru\\Documents\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		

		driver.get("https://login.salesforce.com/");
		driver.findElement(By.cssSelector("#username")).sendKeys("dani");
		driver.findElement(By.id("password")).sendKeys("1234567");
		driver.findElement(By.xpath("//input[@id='Login']"));
		driver.quit();
		
		
		
	}

}

