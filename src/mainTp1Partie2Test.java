import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;



public class mainTp1Partie2Test {

	mainTp1Partie2 main;
	
	@Before
	public void AvantChaqueTest() {
		main = new mainTp1Partie2();
		
	}
	
	@After
	public void AprèsChaqueTest() {
		main = null;
		
	}
	
	@Test
	public void testAjouterClient() {
		
		mainTp1Partie2.ajouterClient( "Hamza" );
		
		assertFalse(mainTp1Partie2.listClients.isEmpty());
		
		
	}
	
	@Test
	public void testAjouterCommande() {
		
		mainTp1Partie2.ajouterClient( "Hamza" );
		
		mainTp1Partie2.ajouterPlat( "pâte 3" );
		
		mainTp1Partie2.ajouterCommande( "Hamza pâte 3" );
		
		assertFalse(mainTp1Partie2.listCommandes.isEmpty());
	}
	
	@Test
	public void testAjouterCommandePlatInex(){
		
        mainTp1Partie2.ajouterClient( "Hamza" );
		
		mainTp1Partie2.ajouterCommande( "Hamza pâte 3" );
		
		assertTrue(mainTp1Partie2.listCommandes.isEmpty());
		
	}
	
}
