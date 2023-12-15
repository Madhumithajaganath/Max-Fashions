package com.max.ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class LoginPage {

	AndroidDriver driver;
	
	@FindBy(xpath="//android.widget.EditText[@resource-id='com.applications.max:id/tilSignUpMobileNumberEdt']")
	private WebElement mobileno;
	
	@FindBy(xpath="//android.widget.Button[@text='CONTINUE']")
	private WebElement continueBtn;
	
	public LoginPage(AndroidDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	
	public WebElement getMobileno() {
		return mobileno;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}

	public void login(String mobilenumber) 
	{
		mobileno.sendKeys(mobilenumber);
		continueBtn.click();
	}
}
