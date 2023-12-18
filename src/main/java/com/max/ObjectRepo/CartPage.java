package com.max.ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class CartPage {

	AndroidDriver driver;
	
	@FindBy(xpath="//android.widget.EditText[@text='Enter Pincode']")
	private WebElement pincode;
	
	@FindBy(xpath="//android.widget.TextView[@text='Men Solid Boxy Fit Casual Shirt']")
	private WebElement productName;
	
	@FindBy(xpath="//android.widget.Button[@text='PROCEED']")
	private WebElement proccedBtn;
	
	public CartPage(AndroidDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	
	public WebElement getPincode() {
		return pincode;
	}

	public WebElement getProductName() {
		return productName;
	}

	public void cart(String pinco) 
	{
		pincode.sendKeys(pinco);
		proccedBtn.click();
	}
}
