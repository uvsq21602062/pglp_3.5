package fr.uvsq.uvsq21602062.projet_maven;

public class Affichage {
	private String nomClasse;
	
	Affichage(String nomClasse) {
		this.nomClasse = nomClasse;
	}
	
	public String getNomClasse() {
		return this.nomClasse;
	}
	
	public void setNomClasse(String nomClasse) {
		this.nomClasse = nomClasse;
	}
	
	public void avertissement(String nomMethode) {
		System.out.println("Appel à la methode " + nomMethode + " de la classe " + this.nomClasse);
	}
}
