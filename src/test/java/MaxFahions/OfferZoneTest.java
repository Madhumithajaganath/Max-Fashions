package MaxFahions;

import org.testng.annotations.Test;

import GenericUtilities.BaseClass;

public class OfferZoneTest extends BaseClass
{
@Test
public void offer()
{
	hp.offerZone();
	ozp.selectProduct("Boys Colourblock Pocket T-shirt", gutil);
	pdp.clickonAddtoBasket();
	cp.cart("562123");
}
}
