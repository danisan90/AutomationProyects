import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class otherexample {
		
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fsaru\\Documents\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);

		driver.get("https://www.lanacion.com.ar/");
		driver.findElement(By.id("btnIngresar")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("usuario[username]")));
		driver.findElement(By.name("usuario[username]")).sendKeys("hola hola");
		driver.findElement(By.xpath("//button[contains(@class,'login')]")).click();
		System.out.println(driver.findElement(By.xpath("//span[@class='message']")).getText());

		
		 
		
		
		
		
		
	}

}

