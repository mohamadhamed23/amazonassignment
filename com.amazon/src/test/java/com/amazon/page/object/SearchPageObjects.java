package com.amazon.page.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPageObjects {

	@FindBy(xpath = "//div[@class='s-main-slot s-result-list s-search-results sg-row']/div[4]//div[@class='sg-col-inner']/div[1]//span[@class='a-price']/span[1]")
	public WebElement itemBasePrice;
	
	@FindBy(xpath = "//div[@class='s-main-slot s-result-list s-search-results sg-row']/div[4]//a[@class='a-link-normal a-text-normal']")
	public WebElement firstItemName;
	
	public SearchPageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

}
