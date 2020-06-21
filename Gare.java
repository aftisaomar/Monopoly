package fr.monopoly;

public class Gare extends Case {
	
	
	private int cpt;
	private double loyer;
	
	
	
	public Gare(String nom) {
		super.nom=nom;
		super.disponible=true;
		cpt=0;
	}
	
	
	
	
	
public String toString() {
		
		return nom;
	}


public boolean getDispo() {
	return disponible;
}


public void setDispo(boolean dispo) {
	this.disponible = dispo;
}


public int getCpt() {
	return cpt;
}


public void setCpt(int cpt) {
	this.cpt = cpt;
}
	


public double getLoyer() {
	return loyer;
}




public void setLoyer(double loyer) {
	this.loyer = loyer;
}


public void Acheter(Joueur j,Double indice){
	this.disponible=false;
	j.retirer(prix);
	j.ajouterTabPossession(indice);
	
}

}
