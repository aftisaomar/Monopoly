package fr.monopoly;

public class Propriete extends Case {
	
	private double prix;
	private int couleurPropriete;
	
	
	
	public Propriete(int prix,int couleurPropriete,String nom) {
		
		super.prix=prix;
		this.couleurPropriete=couleurPropriete;
		super.nom=nom;
		super.estPosseder=false;
		}
	
	
	void Acheter(Joueur J, double indice) {
		Couleur C=new Couleur (this.couleurPropriete,indice);
		estPosseder=true;
		J.retirer(this.prix);
		J.ajouterTabPossession(indice);
		
		J.ajouterTabCouleur(C);}
		
		
	
	
	
	
	

}
