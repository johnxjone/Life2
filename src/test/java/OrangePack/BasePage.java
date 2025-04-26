package OrangePack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

public class BasePage {
	
	static WebDriver driver;
	
	@BeforeAll
	public static void main() {
		
	    driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30));
		
	}
@AfterAll
public static void taredown() {
	
	driver.quit();

}

public static WebDriver getDriver() {
	
	return driver;
}
}
