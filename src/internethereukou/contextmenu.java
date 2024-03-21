package inertnetproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class contextmenu {
	@Test
	public static void contextmenuautomating() throws InterruptedException {
		String url="https://the-internet.herokuapp.com/";
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get(url);
		driver.findElement(By.xpath("//a[contains(text(),'Context Menu')]")).click();
		Actions action = new Actions(driver);
		WebElement cmenu= driver.findElement(By.xpath("//div[@id='hot-spot']"));
		action.contextClick(cmenu).perform();
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
		driver.quit();
	}
}
