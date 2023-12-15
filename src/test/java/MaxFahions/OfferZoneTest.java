package MaxFahions;

import org.testng.annotations.Test;

import GenericUtilities.BaseClass;

public class OfferZoneTest extends BaseClass
{
@Test
public void offer()
{
	hp.offerZone("Bestsellers");
	ozp.selectProduct("Boys Colourblock Pocket T-shirt");
	pdp.clickonAddtoBasket();
	cp.cart("562123");
}
}
