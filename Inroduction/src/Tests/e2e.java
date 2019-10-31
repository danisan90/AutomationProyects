package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class e2e {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fsaru\\Documents\\chromedriver.exe");		

		WebDriver driver = new ChromeDriver();
		driver.get("http://spicejet.com/");
		//first select FROM and then TO, then date.
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		//Parent child method it's better than using index[2] when you have the same element in differents parts
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR']//a[contains(text(),'Coimbatore (CJB)')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[contains(text(),'Delhi (DEL)')]")).click();
		
		Thread.sleep(2000);
		//Before selected the calendar we need to know if the second option is enable
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		{
			System.out.println("no disponible");
			Assert.assertTrue(true);
		}else
		{
			Assert.assertTrue(false);
			
		}
		//select day
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

		//check one radio button
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		
		//passengers
		driver.findElement(By.id("divpaxinfo")).click();
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		
		s.selectByVisibleText("5");
		Thread.sleep(2000);
		Select c = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		c.selectByValue("USD");
		Assert.assertEquals(driver.findElement((By.id("divpaxinfo"))).getText(), "5 Adult");
		;
		//search button
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

	}

}
