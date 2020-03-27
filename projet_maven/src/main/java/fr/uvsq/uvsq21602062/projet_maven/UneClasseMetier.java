package fr.uvsq.uvsq21602062.projet_maven;

public class UneClasseMetier {
	private String metier;
	private Affichage a;
	
	UneClasseMetier(String metier) {
		this.metier = metier;
		this.a = new Affichage("UneClasseMetier");
	}
	
	public String getMetier() {
		return this.metier;
	}
	
	public void setMetier(String metier) {
		this.metier = metier;
	}
	
	public void uneMethodeMetier() {
		
	}
}
