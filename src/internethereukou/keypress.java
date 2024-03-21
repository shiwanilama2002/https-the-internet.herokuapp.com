package inertnetproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class keypress {
	@Test
	public static void keypressedhandling() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Key Presses')]")).click();
		
		driver.findElement(By.id("target")).sendKeys(Keys.TAB);
			
		driver.findElement(By.id("target")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("target")).sendKeys(Keys.ESCAPE);
		Thread.sleep(6000);
		driver.quit();
	}

}
