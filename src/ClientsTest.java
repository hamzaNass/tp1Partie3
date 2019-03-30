import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ClientsTest {
	
	Clients client;
	

	@Before
	public void AvantChaqueTest() {
		client = new Clients( null );
		
	}
	
	@After
	public void ApresChaqueTest() {
		client = null;
		
		
	}
	
	@Test
	public void testSetNom() {
		client.setNom( "Hamza" );
		
		assertEquals("Hamza", client.getNom());
		
	}
	
	@Test
	public void testNulle(){
		
		client.setNom( null );
		
		assertEquals( null, client.getNom() );
		
		
	}

}
