package fr.monopoly;

public class CompagneDistribution extends Case {

	double prix;
	
	
	public CompagneDistribution(String nom) {
		
		
		super.nom=nom;
		prix=15000.0;
		super.disponible=true;
		
	}
	
	void Acheter(Joueur J, double indice) {
		disponible=false;
		J.retirer(this.prix);
		J.ajouterTabPossession(indice);
		}
	
	
	
	
}
