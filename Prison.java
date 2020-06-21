package fr.monopoly;

public class Prison extends Case {
	
public String toString() {
		
		return 	"ALLER EN PRISON ";
	}


public void estEnPrison(Joueur J) {
	
	
	J.setEstPrison(true);
	J.setTourJouer(false);
	
}


}
