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
	
	public void avertissementDebut(String nomMethode) {
		System.out.println("Debut de l'appel à la methode " + nomMethode + " de la classe " + this.nomClasse);
	}
	
	public void avertissementFin(String nomMethode) {
		System.out.println("Fin de l'appel à la methode " + nomMethode + " de la classe " + this.nomClasse);
	}
}
