package inertnetproject;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class basic {
	@Test
	public static void auth() {
		//System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

        // Initialize WebDriver
        //WebDriver driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();

        try {
            // Open the website with basic authentication
            String username = "username";
            String password = "password";
            String baseUrl = "https://" + username + ":" + password + "@the-internet.herokuapp.com/basic_auth";

            driver.get(baseUrl);

            // Optionally, you can interact with the page after authentication
            // For example, you can verify if authentication was successful
            // by checking for an element that is present after successful login
            boolean isLoggedIn = driver.findElement(By.xpath("//p[contains(text(),'Congratulations! You must have the proper credentials.')]")).isDisplayed();
            System.out.println("Is logged in: " + isLoggedIn);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            //driver.quit();
        }
    }
	}


