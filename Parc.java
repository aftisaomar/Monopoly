package fr.monopoly;

public class Parc extends Case {

	
public String toString() {
		
		return "PARC GRATUIT ";
	}
	

void recupere(Joueur J,Banque B) {
	
	
	J.ajouter(B.getSolde());
	B.vider();
}


	
}
