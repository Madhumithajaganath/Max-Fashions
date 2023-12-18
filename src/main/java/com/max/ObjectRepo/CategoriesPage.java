package com.max.ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class CategoriesPage {

	AndroidDriver driver;
	
	public CategoriesPage(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements( driver, this);
	}
	
	@FindBy(id = "com.applications.max:id/navigation_explore_dest")
	private WebElement categorybtn;
	
	@FindBy(id = "com.applications.max:id/text_item_search")
	private WebElement search;
	
	@FindBy(id = "com.applications.max:id/editSearch")
	private WebElement searchbar;
	
	@FindBy(xpath = "(//android.widget.RelativeLayout[@resource-id='com.applications.max:id/search_result_item'])[1]")
	private WebElement result;
	
	@FindBy(xpath = "(//android.widget.ImageView[@resource-id='com.applications.max:id/imageProduct']/..//android.widget.TextView[@resource-id='com.applications.max:id/textProductName'])[1]")
	private WebElement product;
	
	@FindBy(id = "com.applications.max:id/textProductName")
	private WebElement productName;
	
	public void categories(String key) throws Throwable {
//		categorybtn.click();
		search.click();
		searchbar.sendKeys(key);
		Thread.sleep(3000);
		result.click();
		product.click();
		String prod = productName.getText();
		System.out.println(prod);
	}
}
