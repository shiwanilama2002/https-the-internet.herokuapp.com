package inertnetproject;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown1 {
	@Test
	public static void dropdownhanding() throws InterruptedException {
		WebDriverManager .chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Dropdown')]")).click();
		Select dropdown= new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
		dropdown.selectByVisibleText("Option 2");
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}
