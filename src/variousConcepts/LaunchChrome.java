package variousConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\burha\\selenium workspace\\first_Selenium\\driver\\chromedriver.exe" );
			WebDriver driver = new ChromeDriver();
			// go to web site
			driver.get("https://www.google.com");
			// Maximize the browser
			driver.manage().window().maximize();
			//Stop execution
			Thread.sleep(3000);
			// close the browser
			driver.close();
			
	}

}
