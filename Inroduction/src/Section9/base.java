package Section9;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fsaru\\Documents\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//this timeout is applied in global
		
		


		String[] itemsNeeded = { "Cucumber", "Brocolli","Beetroot" };

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		addItems(driver,itemsNeeded);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();;
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
			
		}

	public static void addItems(WebDriver driver, String[] itemsNeeded ) 
	{
		int j=0;
	// add items in the cart
			List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
			for (int i = 0; i < products.size(); i++) {
				String[] nameP = products.get(i).getText().split("-");

				//split is going to gave me two values
				String formattedName=nameP[0].trim(); 
				 // first I need to check if the name i extracted is present in the array#
				//I need to convert array into arrayList
				
				List itemsNeededList = Arrays.asList(itemsNeeded);

				
				if (itemsNeededList.contains(formattedName)) {
					  
					j++;
					// click product
					driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
					if (j==itemsNeeded.length)
					{
						break;
					}
	 			} 
			}
		//driver.close();

	}
}
