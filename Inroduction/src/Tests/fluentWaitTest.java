package Tests;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class fluentWaitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fsaru\\Documents\\chromedriver.exe");		

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.cssSelector("[id='start'] button")).click();
		
		Wait<WebDriver>  wait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
		//lo que va a hacer es que por los proximos 30s va a buscar el elemento cada 3s, osea 10 veces
		//si pasados los 30s no encuentra el elemento entonces va a tirar un fail.
		
		
		WebElement foo=wait.until(new Function<WebDriver, WebElement>(){
			
			public WebElement apply(WebDriver driver) {
				if( driver.findElement(By.cssSelector("[id='finish'] h4")).isDisplayed())
					//agrego esta linea con el isDisplayed pq el elemento aparece en la pagina pero no 
					//se muestra visible, entoces es necesaria esta condicion para esperar su visibilidad
						{
					return driver.findElement(By.cssSelector("[id='finish'] h4"));
						}
				else
					return null;
			}
		});
		//una vez que termina de correr todo lo anterior llega al print
		System.out.println(driver.findElement(By.cssSelector("[id='finish'] h4")).getText());
		
		
		
		
		
	}

}
