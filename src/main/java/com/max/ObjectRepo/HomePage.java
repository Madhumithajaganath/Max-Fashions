package com.max.ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtilities.GestureUtility;
import io.appium.java_client.android.AndroidDriver;

public class HomePage {

	AndroidDriver driver;
	@FindBy(xpath="//android.widget.Button[@text='Login']")
	private WebElement login;
	
	@FindBy(xpath="//android.widget.TextView[@text='Home']")
	private WebElement Home;
	
	@FindBy(xpath="//android.widget.TextView[@text='Categories']")
	private WebElement Categories;
	
	@FindBy(xpath="//android.widget.TextView[@text='Basket']")
	private WebElement Basket;
	 
	@FindBy(xpath="//android.widget.TextView[@text='Favourites']")
	private WebElement Favourites;
	
	@FindBy(xpath="//android.widget.TextView[@text='Account']")
	private WebElement Account;
	
	@FindBy(xpath="//android.view.ViewGroup[@resource-id='com.applications.max:id/llLandingItem']")
	private WebElement flat199;
	
	public HomePage(AndroidDriver driver) 
	{
		this.driver=driver;
PageFactory.initElements( driver, this);
	}

	public WebElement getHome() {
		return Home;
	}

	public WebElement getCategories() {
		return Categories;
	}

	public WebElement getBasket() {
		return Basket;
	}

	public WebElement getFavourites() {
		return Favourites;
	}

	public WebElement getAccount() {
		return Account;
	}
	
	public WebElement getFlat199() {
		return flat199;
	}

	public void ClickOnBasket()
	{
		Basket.click();
	}
	public void ClickOnHome()
	{
		Home.click();
	}
	public void ClickOnAccount()
	{
		Account.click();
	}
	public void ClickOnCategories()
	{
		Categories.click();
	}
	public void ClickOnFavourites()
	{
		Favourites.click();
	}
	public void offerZone(String text)
	
	{
	    GestureUtility gutil=new GestureUtility(driver);
	    gutil.scroll(text);
	    flat199.click();
	}
}
