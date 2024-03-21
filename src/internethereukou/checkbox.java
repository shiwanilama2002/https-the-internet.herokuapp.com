package inertnetproject;

import org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner.stdDSA;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkbox {
	@Test
	public static void checkboxhandling() throws InterruptedException {
		String url="https://the-internet.herokuapp.com/";
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(text(),'Checkboxes')]")).click();
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).isSelected();
		Thread.sleep(800);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		Thread.sleep(800);
		driver.close();
		
	
	}

}
