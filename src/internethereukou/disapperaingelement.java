package inertnetproject;

import java.time.Duration;

import org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner.stdDSA;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class disapperaingelement {
	@Test
	public static void disapperele() {
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver = new ChromeDriver();
		 
		 driver.get("https://the-internet.herokuapp.com/");
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.xpath("//a[contains(text(),'Disappearing Elements')]")).click();
		 
		 driver.findElement(By.xpath("//a[contains(text(),'About')]")).click();
		 
		 WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(15));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Not Found')]")));
		 driver.quit();
	}

}
