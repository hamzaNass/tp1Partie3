import org.junit.Assert;
import org.junit.Test;

public class TaxeTest {

	@Test
	public void testAjouterTaxe() {
		double prix = 10;

		Assert.assertEquals(11.5, Taxe.ajouterTaxes(prix), 0.25);

	}
	
	@Test
	public void testAjouterTaxeValeur0() {
		double prix = 0;

		Assert.assertEquals(0, Taxe.ajouterTaxes(prix), 0);

	}
}
