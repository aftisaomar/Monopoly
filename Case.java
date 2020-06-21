package fr.monopoly;

public abstract class Case {

	protected String nom;
	protected boolean estPosseder,disponible;
	protected double prix=20000.0;

	public boolean isEstPosseder() { // je pense qu elle sert pas a grand chose :3 
		return estPosseder;
	}
	
	public String toString() {
		
		return " " +nom;
		
	}
	
	
	 void choisir(Joueur J,Banque B) {}
	 void debiter(Joueur J) {}
	 void estEnPrison(Joueur J) {}
	 void recupere(Joueur J,Banque B) {}
}
