import static org.junit.Assert.*;

import org.junit.Test;

public class CommandeTest {

	Commande commande;
	@Test
	public void testCalculeFactureAvecTaxe() {

		commande = new Commande(new Clients("Hamza"), new Plats("Pâte", 10.0), 1);
		
		assertEquals("10,00 $", commande.getFacture());
	}

}
