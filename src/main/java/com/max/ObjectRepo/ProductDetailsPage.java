package com.max.ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class ProductDetailsPage 
{
	AndroidDriver driver;
	
	@FindBy(xpath="//android.widget.Button[@text='ADD TO BASKET']")
	private WebElement addtoBasket;
	
	@FindBy(xpath="//android.widget.TextView[@text='3-4 Y']")
	private WebElement selectsize;
	
  public ProductDetailsPage(AndroidDriver driver)
  {
	  this.driver=driver;
	  PageFactory.initElements(driver, this);
  }

public WebElement getAddtoBasket() {
	return addtoBasket;
}

public WebElement getSelectsize() {
	return selectsize;
}


public AndroidDriver getDriver() {
	return driver;
}

public void clickonAddtoBasket()
{
	addtoBasket.click();
	selectsize.click();
	addtoBasket.click();
}
  
}
