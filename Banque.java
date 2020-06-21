package fr.monopoly;

public class Banque {
	
	private double solde=0;
	
	void ajouter(double argent) {
		
		solde+=argent;}
	
	
	
	void vider() {
		
		solde=0;
	}



	public double getSolde() {
		return solde;
	}



	public void setSolde(double solde) {
		this.solde = solde;
	}




	
	
	
	
}
