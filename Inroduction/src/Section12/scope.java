package Section12;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fsaru\\Documents\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.qaclickacademy.com/practice.php");
		// number of links present in the page
		System.out.println(driver.findElements(By.tagName("a")).size());

		// number of links present in the footer section
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));

		System.out.println(footerdriver.findElements(By.tagName("a")).size());

		// i can reuse web elements for going inside
		WebElement columnDriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columnDriver.findElements(By.tagName("a")).size());

		// click on each link in the column and check id the links are working
		for (int i = 1; i < columnDriver.findElements(By.tagName("a")).size(); i++) {
			// necesito que los links se abran en una ventana separada, esto lo hago con el
			// control+click
			String clickonLiknTab = Keys.chord(Keys.CONTROL, Keys.ENTER);

			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickonLiknTab);
			Thread.sleep(5000L);
		} // i have all the tabs open, so now i need go to the all open tabs and verify
			// the title
		System.out.println("Aca vienen los titulos de las paginas");
		Set<String> abc = driver.getWindowHandles(); // this gives me all the handles for all the open windows
		Iterator<String> it = abc.iterator();

		while (it.hasNext()) // if another window is present then...
		{
			// move to the next window
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}

	}

}
