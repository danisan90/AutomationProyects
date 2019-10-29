package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fsaru\\Documents\\chromedriver.exe");		

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.id("fromCity")).click();
		WebElement source=driver.findElement(By.xpath("//input[contains(@placeholder,'From')]"));
		//source.click();
		//una vez ubicado el campo, le mando el nombre que quiero
		source.sendKeys("MUM");
		Thread.sleep(2000);
		source.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		source.sendKeys(Keys.ENTER);

		
		WebElement destination=driver.findElement(By.xpath("//input[contains(@placeholder,'To')]"));
		destination.click();
		destination.sendKeys("DEL");
		Thread.sleep(2000);
		for(int i=1;i<4;i++) {
			destination.sendKeys(Keys.ARROW_DOWN);

		}
		//for to have a different position in the list
		Thread.sleep(2000);
		destination.sendKeys(Keys.ENTER);

	}

}
