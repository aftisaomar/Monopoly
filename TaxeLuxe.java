package fr.monopoly;

public class TaxeLuxe extends Case{
	
	private double prixPayer=10000.0;
	
	public String toString() {
		
		return "TAXE DE LUXE ";
	}
	
	
	void debiter(Joueur J) {
		
		J.retirer(prixPayer);
	}
	
	

}
