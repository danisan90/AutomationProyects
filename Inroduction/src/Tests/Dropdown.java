package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fsaru\\Documents\\chromedriver.exe");		

		WebDriver driver = new ChromeDriver();
		driver.get("http://spicejet.com/");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='CJB']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@value='BOM'])[2]")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("divpaxinfo")).click();
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		s.selectByValue("2");
		s.selectByIndex(6);
		s.selectByVisibleText("5");
		Thread.sleep(2000);
		Select c = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		c.selectByValue("USD");
		//System.out.println(driver.findElement((By.id("divpaxinfo"))).getText());
		;
	}

}
