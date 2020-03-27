package fr.uvsq.uvsq21602062.projet_maven;

import static org.junit.Assert.*;

import org.junit.Test;

public class UneClasseMetierTest {

	@Test
	public void testGetMetier() {
		UneClasseMetier m = new UneClasseMetier("Plombier");
		assertTrue(m.getMetier() == "Plombier");
	}
	
	@Test
	public void testSetMetier() {
		UneClasseMetier m = new UneClasseMetier("Plombier");
		m.setMetier("Electricien");
		assertTrue(m.getMetier() == "Electricien");
	}

}
