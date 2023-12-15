package com.max.ObjectRepo;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class FavoritePage {

	AndroidDriver driver;
	public FavoritePage(AndroidDriver driver) {
		PageFactory.initElements( driver, this);
	}
	
	public void favorite() {
		
	}
	
}
