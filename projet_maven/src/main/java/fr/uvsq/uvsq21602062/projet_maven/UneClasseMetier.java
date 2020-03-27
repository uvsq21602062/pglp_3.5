package fr.uvsq.uvsq21602062.projet_maven;

public class UneClasseMetier {
	private String metier;
	
	UneClasseMetier(String metier) {
		this.metier = metier;
	}
	
	public String getMetier() {
		return this.metier;
	}
	
	public void setMetier(String metier) {
		this.metier = metier;
	}
}
