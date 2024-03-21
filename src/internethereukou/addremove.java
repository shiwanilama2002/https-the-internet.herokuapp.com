package inertnetproject;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class addremove {
	@Test
	public static void addremoveelement() throws InterruptedException {
		String url="https://the-internet.herokuapp.com/";
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get(url);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(text(),'Add/Remove Elements')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Add Element')]")).click();
		Thread.sleep(8000);
		
		driver.findElement(By.xpath("//button[contains(text(),'Delete')]")).click();
		//Thread.sleep(30000);
		//driver.close();
	}

}
