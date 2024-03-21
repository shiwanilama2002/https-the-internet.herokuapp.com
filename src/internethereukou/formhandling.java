package inertnetproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class formhandling {
	@Test
	public static void handlingform() {
	String url="https://the-internet.herokuapp.com/";
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver= new ChromeDriver();
	
	driver.get(url);
	driver.findElement(By.xpath("//a[contains(text(),'Form Authentication')]")).click();
	
	driver.findElement(By.id("username")).sendKeys("tomsmith");
	driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
	
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	//driver.quit();
	
	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(15));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[contains(text(),'Welcome to the Secure Area. When you are done click logout below.')]")));
	
	driver.quit();
}
}
