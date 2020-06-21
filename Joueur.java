package fr.monopoly;

import java.util.ArrayList;
import java.util.Random;

public class Joueur {

	private ArrayList<Couleur> Tabcouleur = new ArrayList<Couleur>();//c'est un tableau de propriete
	private ArrayList<Double> TabPossession=new ArrayList<Double>();
	
	private Double solde;
	private int cptCouleur;
	private String nom;
	private int jeuton;
	private boolean estPrison;
	private boolean tourJouer;
	private int postion;
	
	public Joueur(String nom,int jeuton) {
		
		this.nom=nom;
		this.jeuton=jeuton;
		tourJouer=true;
		estPrison=false;
		cptCouleur=0;
		solde=150000.0;
		postion=0;
	}
	
	
	
	public boolean getTourJouer() {
		return tourJouer;
	}



	public void setTourJouer(boolean tourJouer) {
		this.tourJouer = tourJouer;
	}



	int jeter () {
		
		Random ran=new Random();
		int x=ran.nextInt(5) +1;
		int y=ran.nextInt(5) +1;
		int z=x+y;
		System.out.println("-"+this.nom+" lance les dés ===> 1dés: "+x+" |2dés: "+y+" |Totale :"+z+"\n");
		return (z);
		
	}
	
	
	void jouer() {
		if(tourJouer) {
		Random ran=new Random();
		int x=ran.nextInt(5)+1;
		int y=ran.nextInt(5)+1;
		System.out.println(this.nom+" lance les dés===> 1des:"+x+" |2des: "+y+"\n");
		deplacer(x+y);
		
		}
		else {
			tourJouer=true;
			System.out.println(this.nom+" est suspendu pour ce tour ");
			estPrison=false;
			
			
		}
		
		
	}
	
	
	void ajouter(Double argent)
	{
		
		this.solde+=argent;}
	
	
	void retirer(Double argent)
	{
		
		this.solde=this.solde - argent;}
	
	
	
	void deplacer(int nbrCase) {
		
		
		this.postion+=nbrCase;
		if(this.postion>38)
		{	
			this.postion-=38;
			
		if(!this.estPrison)
			System.out.println("Vous allez recevoir 2000€ \n");
			this.solde+=2000.0;
		
		if(this.estPrison) {
			
			System.out.println("Vous N'allez pas recevoir 2000€ pour ce tour \n");
			this.estPrison=false;
		}
		
		}
		
		
	}
	
	
	void ajouterTabCouleur(Couleur C) {
		
		Tabcouleur.add(C);
		
	}
	
	
void ajouterTabPossession(Double D) {
		
	TabPossession.add(D);
		
	}
	





boolean possedeProrpriete(int indice) {
	
	for(int i=0;i<this.TabPossession.size();i++)
		{if(indice==this.TabPossession.get(i))
			return true;}
	
	return false;
}



public String getNom() {
	return nom;
}




public int getJeuton() {
	return jeuton;
}



public int getPostion() {
	return postion;
}



public void setPostion(int postion) {
	this.postion = postion;
}



public boolean getEstPrison() {
	return estPrison;
}



public void setEstPrison(boolean estPrison) {
	this.estPrison = estPrison;
}



public int FailliteJoueur() {
	
	if(this.solde==0) {
		
		return 0;
		
	}
	
	return 1;
	
}



public Double getSolde() {
	return solde;
}



public void setSolde(Double solde) {
	this.solde = solde;
}


	
	
}
