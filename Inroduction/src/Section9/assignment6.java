package Section9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fsaru\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		driver.manage().window().maximize();

		WebElement myCheckBox = driver.findElement(By.id("checkBoxOption3"));
		String myOption = driver.findElement(By.xpath("//div[@id='checkbox-example']//label[3]")).getText();
		myCheckBox.click();
		
		WebElement dropdown=driver.findElement(By.id("dropdown-class-example"));
		Select opt=new Select(dropdown);
		opt.selectByVisibleText(myOption);
		
		driver.findElement(By.id("name")).sendKeys(myOption);
		driver.findElement(By.id("alertbtn")).click();
		String validation = driver.switchTo().alert().getText();
		if(validation.contains(myOption)) {
			System.out.println("EXITO");
		}
		else
			System.out.println("FRACASO :(");

	}

}
