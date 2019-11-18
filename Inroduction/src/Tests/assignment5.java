package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fsaru\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("a[href*=nested_frames]")).click();
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame(1);
		
		System.out.println(driver.findElement(By.id("content")).getText());
		
		
		


		
		
		

	}

}
