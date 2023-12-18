package com.max.ObjectRepo;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class FacebookPage {

	AndroidDriver driver;
	public FacebookPage(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements( driver, this);
	}
	
	public void facebook() {
		
	}
}
