package fr.monopoly;

public class Impot extends Case {

	private double impot=20000.0;
	
public String toString() {
		
		return "IMPOT ";
	}
	

void debiter(Joueur J) {
	
	J.retirer(impot);
}

	
	
}
