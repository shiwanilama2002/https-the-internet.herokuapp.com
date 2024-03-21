package inertnetproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dynamicloading {
	public static String url="https://the-internet.herokuapp.com/";
	@Test
	public static void d1() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Dynamic Loading')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Example 1: Element on page that is hidden')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Start')]")).click();
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish")));
		
		driver.quit();

	}
}
