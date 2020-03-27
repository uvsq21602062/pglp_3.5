package fr.uvsq.uvsq21602062.projet_maven;

import static org.junit.Assert.*;

import org.junit.Test;

public class AffichageTest {

	@Test
	public void testGetClasse() {
		Affichage a = new Affichage("Une classe");
		assertTrue(a.getNomClasse() == "Une classe");
	}
	
	@Test
	public void testSetClasse() {
		Affichage a = new Affichage("Une classe");
		a.setNomClasse("Une autre classe");
		assertTrue(a.getNomClasse() == "Une autre classe");
	}

}
