//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.w3c.dom.stylesheets.DocumentStyle;



public class chromebrowser {
		//static WebDriver driver = new ChromeDriver();
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fsaru\\Documents\\chromedriver.exe");		WebDriver driver = new ChromeDriver();
		WebDriver driver1 = new ChromeDriver();

		driver1.get("https://www.facebook.com/");
		driver1.findElement(By.id("email")).sendKeys("myemail@gmail.com");
		
		
	}

}

