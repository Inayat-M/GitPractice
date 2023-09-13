package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.BusinessMethod;

public class LandingPage extends BusinessMethod {
	WebDriver driver;
	LoginPage lp = new LoginPage(driver);

	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By loginBtn = By.id("login-btn");
	
	
	public void verifyLandingButtons(WebDriver driver) {
		 driver.findElement(loginBtn).click();
		 
	}
	
}
