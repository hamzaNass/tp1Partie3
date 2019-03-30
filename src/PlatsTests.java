import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PlatsTests {

	Plats plat;

	@Before
	public void AvantChaqueTest() {
		plat = new Plats(null, 0);
	}

	@After
	public void ApresChaqueTest() {
		plat = null;

	}

	@Test
	public void testGetPrix() {
		plat = new Plats("Jus", 2);

		Assert.assertEquals(2.00, plat.getPrix(), 0);

	}

	@Test
	public void testPlatEquals() {
		plat = new Plats("Jus", 2);

		Assert.assertEquals(plat.Equals("Jus"), true);

	}

}
