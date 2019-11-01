package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class assigment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fsaru\\Documents\\chromedriver.exe");		

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		
		driver.findElement(By.id("Adults")).click();
		Select a = new Select(driver.findElement(By.id("Adults")));
		a.selectByValue("4");
		driver.findElement(By.id("Childrens")).click();
		Select b = new Select(driver.findElement(By.id("Childrens")));
		b.selectByValue("1");
		//calendar
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		//More options
		driver.findElement(By.id("MoreOptionsDiv")).click();
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("Delta");
		//search button
		driver.findElement(By.id("SearchBtn")).click();
		//for have the error
		System.out.println(driver.findElement((By.id("homeErrorMessage"))).getText());

		//Assert.assertEquals(driver.findElement((By.id("homeErrorMessage"))).getText(), "Sorry, but we can't continue until you fix everything that's marked in RED");

		
	}

}
