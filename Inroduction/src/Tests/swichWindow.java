package Tests;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.util.Strings;

public class swichWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fsaru\\Documents\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/intl/es/gmail/about/#");
		driver.findElement(By.xpath(
				"//ul[@class='h-c-header__cta-list header__nav--ltr']//a[contains(@class,'h-c-header__nav-li-link')][contains(text(),'Iniciar sesión')]"))
				.click();
		
		driver.switchTo().window(""); 
		Set<String>ids=driver.getWindowHandles();
		//obtengo los ids de las ventanas que se abren
		Iterator<String> it=ids.iterator();
		//obtengo el primer id
		String parentid=it.next();
		//me muevo hacia el hijo y obtengo el id de la siguiente ventana
		String childid=it.next();
		//le pido que se mueva a la ventana qu eme interesa
		driver.switchTo().window(childid);
		//obtengo el titulo de la venta hija 
		System.out.println(driver.getTitle());
		//a partir de ahora puedo seguir trabajando en la segunda pagina
		//para volver a la pagina padre tengo que switch back
		
		driver.switchTo().window(parentid);
		System.out.println(driver.getTitle());




	}

}
