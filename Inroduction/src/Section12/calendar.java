package Section12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fsaru\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		// I will provide month name and day
		driver.findElement(By.id("travel_date")).click();
		WebElement month = driver
				.findElement(By.xpath("//div[@class='datepicker-days']/table/thead/tr/th[@class='datepicker-switch']"));
//looking for the month I want
		//if i want to change the day only need to change what is inside contains
		while (!month.getText().contains("April 2020")) {
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
			
			
			System.out.println(month.getText());

		}
		//se ubica en abril y luego carga el dia que esta en el codigo de abajo
		

		List<WebElement> days = driver.findElements(By.className("day"));
		int count = driver.findElements(By.className("day")).size();
		for (int i = 0; i < count; i++) {

			String textIWant = days.get(i).getText();

			if (textIWant.equals("23")) {
				days.get(i).click();
				break;
			}

		}

	}

}
