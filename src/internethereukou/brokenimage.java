package inertnetproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class brokenimage {
	@Test
	public static void imageisbbroken() throws InterruptedException {
		String url="https://the-internet.herokuapp.com/";
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(text(),'Broken Images')]")).click();
		
		WebElement img1=driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/img[1]"));
		if(img1.getAttribute("naturalWidth").equals("0")) {
			System.out.println("Image1 is broken image");
		}
		else {
			System.out.println("Image1 is not broken image");
			
		}
		
		WebElement img2= driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/img[2]"));
		if(img2.getAttribute("naturalWidth").equals("0")) {
			System.out.println("Image2 is broken");
		}
		else {
			System.out.println("Image2 is not broken");
		}
		
		WebElement img3= driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/img[3]"));
		if(img3.getAttribute("naturalWidth").equals("0")) {
			System.out.println("Image3 is broken image");
		}
		else {
			System.out.println("Image3 is not a broken image");
		}
		Thread.sleep(5000);
		driver.quit();
	}

}
