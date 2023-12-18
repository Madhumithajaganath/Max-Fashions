package MaxFahions;

import org.testng.annotations.Test;

import com.max.ObjectRepo.FavoritePage;

import GenericUtilities.BaseClass;
import io.appium.java_client.AppiumBy;

public class GirlsFashionTest extends BaseClass {
	
	FavoritePage fp = new FavoritePage(driver);
	
	@Test
	public void girlsFashion()
	{
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Girls']")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Dresses']")).click();
		driver.findElement(AppiumBy.xpath("(//android.widget.ImageView[@resource-id='com.applications.max:id/imageFavourite'])[1]")).click();
		driver.findElement(AppiumBy.id("com.applications.max:id/ivFavourite")).click();
		fp.addingProduct();
		
		
//		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Girls Polka Dot Printed Fit & Flare Dress']")).click();
	}

}
