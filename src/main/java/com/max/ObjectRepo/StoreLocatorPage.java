package com.max.ObjectRepo;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.common.collect.ImmutableMap;

import GenericUtilities.BaseClass;
import GenericUtilities.GestureUtility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

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
	private List<WebElement> storeAddress;

	public StoreLocatorPage(AndroidDriver driver) 
	{
		this.driver=driver;

		PageFactory.initElements( driver, this);
	}
	
	public AndroidDriver getDriver() {
		return driver;
	}

	public WebElement getFindStores() {
		return findStores;
	}

	public WebElement getStateSpinner() {
		return stateSpinner;
	}

	public WebElement getCitySpinner() {
		return citySpinner;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getCity() {
		return city;
	}

	public List<WebElement> getStoreAddress() {
		return storeAddress;
	}

	public void store() {

		findStores.click();
		stateSpinner.click();
		citySpinner.click();
		state.click();
		city.click();
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Find our stores\"));"));
		int count = storeAddress.size();
		System.out.println("Getting the address");
		for(int i=0;i<count;i++)
		{
		String address = storeAddress.get(i).getText();
		System.out.println(address);
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
			    "left", 100, "top", 100, "width", 100, "height", 100,
			    "direction", "left",
			    "percent", 0.75
			));
		}
	}
}
