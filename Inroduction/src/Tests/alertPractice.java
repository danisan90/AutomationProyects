package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text="dani";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fsaru\\Documents\\chromedriver.exe");		

		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		//delete cookies
		driver.manage().deleteAllCookies();
		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.id("alertbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		//confirm button
		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
	}

}
