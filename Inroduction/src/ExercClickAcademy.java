import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	
	
public class ExercClickAcademy {
	



			public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\fsaru\\Documents\\chromedriver.exe");	
			WebDriver driver = new ChromeDriver();
			WebDriverWait wait = new WebDriverWait(driver, 10);

			driver.get("http://www.qaclickacademy.com/");
			driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-right']//a[contains(text(),'Interview Guide')]")).click();
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("usuario[username]")));
			//click en appium
			driver.findElement(By.xpath("//*[@id=\"tablist1-tab1\"]")).click();
			
			//click en selenium
			driver.findElement(By.xpath("//*[@id=\"tablist1-tab1\"]/following-sibling::li[1]")).click();
			//click en soap
			driver.findElement(By.xpath("//*[@id=\"tablist1-tab1\"]/following-sibling::li[2]")).click();
			//click en testing
			driver.findElement(By.xpath("//*[@id=\"tablist1-tab1\"]/following-sibling::li[3]")).click();

			driver.quit();

}
}
