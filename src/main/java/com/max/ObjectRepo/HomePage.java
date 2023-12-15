package com.max.ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import net.bytebuddy.asm.Advice.This;

public class HomePage {

	AndroidDriver driver;
	public HomePage(AndroidDriver driver) {
		PageFactory.initElements( driver, this);
	}
	
	public void home() {
		
	}
}
