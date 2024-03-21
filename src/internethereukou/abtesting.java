package inertnetproject;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class abtesting {
	@Test
	public static void abtestingexample() throws InterruptedException {
		String url="https://the-internet.herokuapp.com/";
		
		//getting webdriver
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		
		//getting url
		driver.get(url);
		
		//maximize window
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(text(),'A/B Testing')]")).click();
		
		Thread.sleep(3000);
		driver.close();
	}
}
