package fr.monopoly;

import java.util.Random;

public class Communaute extends Case{

public String toString() {
		
		return "CAISSE DE COMMUNAUTE ";
	}
	
	
void choisir(Joueur J,Banque B) {
	
	
	Random ran=new Random();
	int x=ran.nextInt(1);
	if(x==1)
	{ int y=ran.nextInt(11)+1;//on deplace le joueuer
		J.deplacer(y);
		System.out.println("vous devez vous déplacer de "+y+"cases\n");
	}else {// il paye les taxe
		
		J.retirer(10000.0);
		B.ajouter(10000);
		System.out.println("vous devez payer 10000 € de taxe\n");
		
	}
	
	
}


}
