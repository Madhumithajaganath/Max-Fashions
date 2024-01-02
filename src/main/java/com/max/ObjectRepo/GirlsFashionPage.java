package com.max.ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class GirlsFashionPage {
	
	AndroidDriver driver;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Girls']")
	private WebElement girlsbtn;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Dresses']")
	private WebElement dressesbtn;
	
	@FindBy(xpath = "//android.widget.ImageView[@resource-id='com.applications.max:id/imageFavourite'])[1]\")")
	private WebElement addFavbtn;
	
	@FindBy(id = "com.applications.max:id/ivFavourite")
	private WebElement wishlistBtn;

	public GirlsFashionPage(AndroidDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements( driver, this);
	}
	
	public AndroidDriver getDriver() {
		return driver;
	}

	public WebElement getGirlsbtn() {
		return girlsbtn;
	}

	public WebElement getDressesbtn() {
		return dressesbtn;
	}

	public WebElement getAddFavbtn() {
		return addFavbtn;
	}

	public WebElement getWishlistBtn() {
		return wishlistBtn;
	}
	
	public void wishlistProduct()
	{
		girlsbtn.click();
		dressesbtn.click();
		addFavbtn.click();
		wishlistBtn.click();
	}
	
}
