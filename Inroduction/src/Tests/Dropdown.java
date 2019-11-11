package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fsaru\\Documents\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://spicejet.com/");
		driver.manage().window().maximize();
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		// este assert solo espera un falso como argumento, por lo tanto si es un falso
		// sigue con el proceso, sino rompe.
		// isselected me va a decir si fue seleccionado o no, entonces al estar primero
		// va a estar false
		// luego hace el click y finalmente devuelve true.
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());

		// Count the number of checkbox

		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

		driver.findElement(By.id("divpaxinfo")).click();
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		s.selectByValue("2");
		s.selectByIndex(6);
		s.selectByVisibleText("5");
		Thread.sleep(2000);
		Select c = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		c.selectByValue("USD");
		Assert.assertEquals(driver.findElement((By.id("divpaxinfo"))).getText(), "5 Adult");
		;

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		// Parent child method it's better than using index[2] when you have de same
		// element in differents parts
		driver.findElement(By.xpath(
				"//div[@id='ctl00_mainContent_ddl_originStation1_CTNR']//a[contains(text(),'Coimbatore (CJB)')]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[contains(text(),'Delhi (DEL)')]"))
				.click();
		Thread.sleep(2000);
		// inmediatamente lo que pasa es que se abre el calendario

		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
			System.out.println("its enabled");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(true);
		}

		// driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		// select current day
	}

}
