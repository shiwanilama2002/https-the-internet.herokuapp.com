package inertnetproject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class jsalert {
	@Test
	public static void alert() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(text(),'JavaScript Alerts')]")).click();
		
		//driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
		//driver.switchTo().alert().accept();
		
		//driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
		//Thread.sleep(4000);
		//driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
		
		Thread.sleep(5000);
		Alert alertwindow = driver.switchTo().alert();
		alertwindow.sendKeys("hello");
		alertwindow.accept();
		
		driver.quit();
	}

}
