package pages;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dashboard {
	WebDriver driver;
	
	public Dashboard(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By dashboardpageverify = By.cssSelector(".name");
	By accountSummary = By.xpath("//*[@id=\"topbar\"]/div[1]/div/div[1]");
	
	public void verifyDashboard(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(dashboardpageverify));
		driver.findElement(dashboardpageverify).getText();
		Assert.assertTrue(dashboardpageverify.equals(dashboardpageverify));
		driver.findElement(accountSummary).click();
		
	}
	
}
