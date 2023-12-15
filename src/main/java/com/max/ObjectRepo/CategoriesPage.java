package com.max.ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class CategoriesPage {

	AndroidDriver driver;
	
	public CategoriesPage(AndroidDriver driver) {
		PageFactory.initElements( driver, this);
		
	}
	
	@FindBy(id = "com.applications.max:id/navigation_explore_dest")
	private WebElement categorybtn;
	
	
	
	public void categories() {
		
	}
}
