package com.max.ObjectRepo;

import org.openqa.selenium.support.PageFactory;

import GenericUtilities.GestureUtility;
import io.appium.java_client.android.AndroidDriver;

public class OfferZonePage 
{
	AndroidDriver driver;
	
	
  public OfferZonePage(AndroidDriver driver)
  {
	  this.driver=driver;
	  PageFactory.initElements(driver, this);
  }
  
  public void selectProduct(String product)
  {
	  GestureUtility gutil= new GestureUtility(driver);
	  gutil.scroll(product);
  }
}
