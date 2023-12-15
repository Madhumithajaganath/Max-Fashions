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
	private WebElement searchbar;
	
	@FindBy(xpath = "(//android.widget.RelativeLayout[@resource-id='com.applications.max:id/search_result_item'])[1]")
	private WebElement item;
	
	
	
	public void categories() {
		
	}
}
