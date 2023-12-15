package com.max.ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class StoreLocatorPage {

	AndroidDriver driver;

	
	@FindBy(xpath = "//android.widget.TextView[@text='Find our stores']")
	private WebElement findStores;
	
	@FindBy(id="com.applications.max:id/spinner_store_region")
	private WebElement stateSpinner;
	
	@FindBy(id="com.applications.max:id/city_spinner")
	private WebElement citySpinner;
	
	@FindBy(xpath = "//android.widget.CheckedTextView[@text='TAMIL NADU']")
	private WebElement state;
	
	@FindBy(xpath = "//android.widget.CheckedTextView[@text='Hosur']")
	private WebElement city;
	
	@FindBy(id = "com.applications.max:id/lnrStoreInfo")
	private WebElement storeAddress;
	
	
	public StoreLocatorPage(AndroidDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements( driver, this);
	}
	
	public void store() {
		String address = storeAddress.getText();
		System.out.println(address);
	}
}
