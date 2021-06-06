package com.amazon.utility;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonMethods{
	public static WebDriver driver;

	public void initialDriver(String browser) {

		// String browser = driver;
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}else if (browser.equals("fireFox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
	}
	
	public void navigateto(String url) {
		this.driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	public void clickElement(WebElement element ) {
		clickableCondition(element).click();
	}
	public WebDriverWait getWait() {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		return wait;
	}
	
	
	public WebElement clickableCondition(WebElement element) {
		return getWait().until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public WebElement visibilityOfElementCondition(WebElement element) {
		return getWait().until(ExpectedConditions.visibilityOf(element));
	}
	
	public void sendTextValue(WebElement element, String value) {
		visibilityOfElementCondition(element).sendKeys(value);
	}
	
	public String getTextValue(WebElement element) {
		return visibilityOfElementCondition(element).getText();
	}
	
	public void validatingTexts(String expected, String actual) {
		Assert.assertEquals(expected, actual);
	}
	
}
