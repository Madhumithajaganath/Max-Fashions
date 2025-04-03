package MaxFahions;

import org.testng.annotations.Test;

import com.max.ObjectRepo.FavoritePage;
import com.max.ObjectRepo.GirlsFashionPage;

import GenericUtilities.BaseClass;
import io.appium.java_client.AppiumBy;

public class GirlsFashionTest extends BaseClass {
	
	FavoritePage fp = new FavoritePage(driver);
	GirlsFashionPage gp = new GirlsFashionPage(driver);
	
	@Test
	public void girlsFashion()
	{
		gp.wishlistProduct();
		fp.addingProduct();
		
	}

}
