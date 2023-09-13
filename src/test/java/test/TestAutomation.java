package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.Dashboard;
import pages.LandingPage;
import pages.LoginPage;
import utility.BusinessMethod;

public class TestAutomation{
	WebDriver driver;
	BusinessMethod businessMethod = new BusinessMethod();
	LandingPage landingPage = new LandingPage(driver);
	LoginPage loginPage = new LoginPage(driver);
	Dashboard dashboard = new Dashboard(driver);
	
	
	
	@Test
	public void VerifyApplicationLaunchedSucessfully() {
		
		WebDriver driver = businessMethod.launchApp();
		landingPage.verifyLandingButtons(driver);
		loginPage.login(driver);
		dashboard.verifyDashboard(driver);
		}
}
