package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actinsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fsaru\\Documents\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nike.com/");
		Actions a = new Actions(driver);
		WebElement move = driver.findElement(By.xpath("//a[@class='nav-brand fs16-nav-sm prl5-sm pt6-sm pb6-sm"
				+ " nav-uppercase d-sm-ib va-sm-m'][contains(text(),'NEW RELEASES')]\r\n" + ""));

		a.moveToElement(driver.findElement(By.id("TypeaheadSearchInput"))).click().keyDown(Keys.SHIFT).sendKeys("airs")
				.doubleClick().build().perform();

		// move to specific element
		//a.moveToElement(move).contextClick().build().perform();

	}

}
