import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class chromebrowser {
		
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fsaru\\Documents\\chromedriver.exe");		WebDriver driver = new ChromeDriver();
		WebDriver driver1 = new ChromeDriver();

		driver1.get("https://www.facebook.com/");
		driver1.findElement(By.id("email")).sendKeys("myemail@gmail.com");
		driver1.findElement(By.name("pass")).sendKeys("12345678");
		driver1.findElement(By.xpath("//input[@value='Log In']")).click();
		//driver1.findElement(By.linkText("Forgot account?")).click();
		driver1.findElement(By.xpath("//input[contains(@value,'Log In')]")).click();
		System.out.println(driver1.findElement(By.xpath("//div[@class='_4rbf _53ij']")).getText());
		driver1.quit();
		
		
		
		
		
	}

}

