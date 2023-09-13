package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.BusinessMethod;

public class LoginPage extends BusinessMethod {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	By headerLoginPage = By.xpath("(//*[text()='Login to Internet Banking'])[1]");
	By btnUserId = By.id("DUMMY1");
	By txtUserId = By.id("AuthenticationFG.USER_PRINCIPAL");
	By txtPassword = By.id("AuthenticationFG.ACCESS_CODE");
	By btnLogin = By.id("VALIDATE_CREDENTIALS1");
	
	public void login(WebDriver driver) {
		String loginPageHeader = driver.findElement(headerLoginPage).getText();
		Assert.assertTrue(loginPageHeader.equalsIgnoreCase("Login to Internet Banking"));
		driver.findElement(btnUserId).click();
		driver.findElement(txtUserId).sendKeys("B576728924");
		driver.findElement(txtPassword).sendKeys("Hiiminayat@786");
		driver.findElement(btnLogin).click();
//		Ayya kya ba wa 
//		Ab ya si wa ya si wa yoch karne ka 
		
		
	}
}
