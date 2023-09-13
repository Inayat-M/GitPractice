package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BusinessMethod {
	WebDriver driver;
//	@BeforeTest
	public WebDriver launchApp() {
		System.setProperty("webdriver.chrome.driver", "../FrameWork/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.icicibank.com/");
		driver.manage().window().maximize();
//		System.out.println(driver);
		return driver;
	}
	
}
