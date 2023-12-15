package com.max.ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class FavoritePage {

	AndroidDriver driver;
	
	@FindBy(id="com.applications.max:id/favSearch")
	private WebElement searchButton;
	
	@FindBy(xpath = "//android.widget.ImageView[@resource-id='com.applications.max:id/imageFavRemove']")
	private WebElement closeButton;
	
	@FindBy(xpath = "//android.widget.TextView[@text='ADD TO BASKET']")
	private WebElement addToBasket;
	
	@FindBy(xpath = "//android.widget.Spinner[@resource-id='com.applications.max:id/spinnerSize']")
	private WebElement selectdropdown;
	
	@FindBy(xpath = "//android.widget.CheckedTextView[@text='XS']")
	private WebElement selectSize;
	
	@FindBy(xpath = "//android.widget.TextView[@text='REMOVE ALL']")
	private WebElement removeAll;
	
	@FindBy(id="android:id/button1")
	private WebElement OKButton;
	
	@FindBy(id="android:id/button2")
	private WebElement cancelButton;
	
	public FavoritePage(AndroidDriver driver) {
		PageFactory.initElements( driver, this);
	}
	
	public void favorite() {
		
	}
	
}
