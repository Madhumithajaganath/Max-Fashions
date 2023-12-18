package MaxFahions;

import org.testng.annotations.Test;

import GenericUtilities.BaseClass;

public class TestScript extends BaseClass{

	@Test
	public void search() throws Throwable {
		cat.categories("maxi");
	}
}
