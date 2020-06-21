package fr.monopoly;

import java.util.ArrayList;
import java.util.Scanner;

public class Plateau {
	
	
	public static void main(String[] args) {

		
   ArrayList<Joueur> tabJoueur= new ArrayList<Joueur>();
   Banque B=new Banque();
   Case tab[]=new Case[40];
   int tabCouleur[]=new int[4];
   String Couleur[]= {"","Rouge","Bleu","Jaune","Vert"};
   int tabTrie[]=new int[4];
   String nom,carte;
   int x,C,i,Max,indice=0,j;
   Joueur J;
		
		Scanner sc=new Scanner(System.in);
		tab[0]=new Depart();
		tab[1]=new Propriete(6000,2,"BOUL. DE BELLVILLE");
		tab[2]=new Communaute();
		tab[3]=new Propriete(6000,2,"RUE LECOURBE");
		tab[4]=new Impot();
		tab[5]=new Gare("GARE DE MONTPARNASSE");
		tab[6]=new Propriete(10000,4,"RUE DE VAUGIRARD");
		tab[7]=new Chance();
		tab[8]=new Propriete(10000,4,"RUE DE COURCELLE ");								
	    tab[9]=new Propriete(12000,4,"AVENUE DE LA REPUBLIQUE");
	    tab[10]=new Propriete(14000,2,"BOUL. DE LA VILLETTE");
		tab[11]=new CompagneDistribution("COMPAGNIE DE DIST D'ELECTRICITE");
		tab[12]=new Propriete(14000,2,"AVENUE DE NEUILLY");								
	    tab[13]=new Propriete(16000,2,"RUE DE PARADIS ");
	    tab[14]=new Gare("GARE DE LYON");
	    tab[15]=new Propriete(18000,4,"AVENUE MOZART");
	  	tab[16]=new	Communaute();
	    tab[17]=new Propriete(18000,4,"BOULEVARD SAINT MICHEL");
	    tab[18]=new Propriete(20000,4,"PLACE PIGALLE");
	    tab[19]=new Parc(); 
	    tab[20]=new Propriete(22000,2,"AVENUE MATIGNON");
	    tab[21]=new Chance();
	    tab[22]=new Propriete(22000,2,"BOULEVARD MALESHERBES");
	    tab[23]=new Propriete(24000,2,"AVENUE HENRI-MARTIN");
	    tab[24]=new Gare("GARE DU NORD");
	    tab[25]=new Propriete(26000,3,"FAUBOURG SAINT-HONORE");
	    tab[26]=new Propriete(26000,3,"PLACE DE LA BOURSE ");
	    tab[27]=new CompagneDistribution("COMPAGNIE DE DIST DES EAUX");
	    tab[28]=new Propriete(28000,3,"RUE LAFAYETTE");
	    tab[29]=new Prison();
	    tab[30]=new Propriete(30000,3,"AVENUE DE BREDEUIL");
	    tab[31]=new Propriete(30000,3,"AVENUE FOCH");
	    tab[32]=new Communaute();		
	    tab[33]=new  Propriete(32000,3,"BOUL DES CAPUCINES");
	    tab[34]=new Gare("GARE SAINT-LAZARE");
	    tab[35]=new Chance();
	    tab[36]=new  Propriete(35000,1," AVENUE CHAMPS ELYSEES");
	    tab[37]=new TaxeLuxe();
	    tab[38]=new  Propriete(40000,1," RUE DE LA PAIX");
	    
	    /*Menu de jeu****/
	    System.out.println("Menu:");
	    System.out.println("    1. Inscrire les joueurs");
		System.out.println("    2. Quitter");
		
		Scanner sc1 = new Scanner(System.in);
		int choix = sc1.nextInt();
		while(choix!=1 && choix!=2)
		{
			
			System.out.println("1. Inscrire les joueurs");
			System.out.println("2. Quitter");
			choix = sc1.nextInt();
		}
	    
	    if(choix==1) {
	    
	    
	    
	    
	    
		System.out.println("-------------------MONOPOLY GAME-------------------\n");
		
		do {
			System.out.println("Entrez le nombre de joueur :\n");
		 x=sc.nextInt();
		}while(x>4 || x<=0);
		for( i=0;i<x;i++){
			 j=i+1;		
		System.out.println(+j+"- Joueur: |Nom Joueur "+ "|Couleur :1->Rouge");
		System.out.println("                                2->Bleu");
		System.out.println("                                3->Jaune");
		System.out.println("                                4->Vert\n");
		nom=sc.next();
		C=sc.nextInt();
		if(C!=tabCouleur[0] && C!=tabCouleur[1] && C!=tabCouleur[2] && C!=tabCouleur[3])
		{tabCouleur[i]=C;
        tabJoueur.add(new Joueur(nom,C));
		}else {
			System.out.println("!!!!!La Couleur est prise!!!!!!\n");
			i--;
			j--;
			
		}
	
		}
		
	System.out.println("-------------------La liste des Joueurs-------------------\n");
	for(i=0;i<tabJoueur.size();i++)
	{    x=i+1;
		System.out.println(+x+"-Joueur |Nom: "+tabJoueur.get(i).getNom()+" |Couleur: "+Couleur[tabJoueur.get(i).getJeuton()]+"\n");
		
	}

	System.out.println("-------------------Determiner l'ordre de passage des joueurs-------------------\n");

	for(i=0;i<tabJoueur.size();i++) {
		x=tabJoueur.get(i).jeter();
		tabTrie[i]=x;
		}
	
	for(i=0;i<tabJoueur.size();i++) {
		
		Max=tabTrie[0];
		for(j=1;j<tabJoueur.size();j++) {
	    if(Max<tabTrie[j])
	    { Max=tabTrie[j];
          indice=j;
	    
	    }}
		tabTrie[indice]=-1;
		J=tabJoueur.get(i);
		tabJoueur.set(i, tabJoueur.get(indice));
		tabJoueur.set(indice, J);
		}
	
	System.out.println("\n");
	System.out.println("-------------L'ordre de passage---------------\n");
	for(i=0;i<tabJoueur.size();i++)
	{    x=i+1;
	System.out.println(+x+"-Joueur |Nom: "+tabJoueur.get(i).getNom()+" |Couleur: "+Couleur[tabJoueur.get(i).getJeuton()]+"\n");
		
	}
	
	//System.out.println("Cliquer sur 'C' pour commencer la partie \n");
	
	System.out.println("Note: on clique sur 'c' pour continuer\n");
	nom=sc.next();
	if(nom.equals("c")) {
	
	System.out.println("-------------------START GAME-------------------\n");
	
	/*tabJoueur.get(1).jouer();
	System.out.println(tab[tabJoueur.get(1).getPostion()]);*/
	
	x=0;
	for(i=0;i<tabJoueur.size();i++) {
		
		x=x+tabJoueur.get(i).FailliteJoueur();}
	
	/*****************************************************************/
	
	while(x!= 1 && !nom.equals("")){
		for(i=0;i<tabJoueur.size();i++){
			j=i+1;
			System.out.println("-------------------"+j+"-Joueur-------------------\n");
		
	  
	   if(tabJoueur.get(i).getTourJouer()) {
	   
		   System.out.println("Nom: "+tabJoueur.get(i).getNom()+" |Couleur : "+Couleur[tabJoueur.get(i).getJeuton()]+" |Position actuelle : "+tab[tabJoueur.get(i).getPostion()]+" |Solde :"+tabJoueur.get(i).getSolde()+"€ \n");
		   tabJoueur.get(i).jouer();
		   System.out.println("====>La Nouvelle position de "+tabJoueur.get(i).getNom()+" est : "+tab[tabJoueur.get(i).getPostion()]+"\n");
		   
		   
	  int pos=tabJoueur.get(i).getPostion();
	  //les propriete
	  if(pos==1 || pos==3 || pos==6 || pos==8 || pos==9 || pos==10 || pos==12|| pos==13 || pos==15 || pos==17 || pos==18 || pos==20 || pos==22 || pos==23 || pos==25 || pos==26 || pos==28 || pos==30 || pos==31 || pos==33 || pos==36 || pos==38)
	  {
		  if (!tab[pos].isEstPosseder()){
			  if(!tabJoueur.get(i).possedeProrpriete(pos)){
				  if(tabJoueur.get(i).getSolde()>tab[pos].prix) {
				  System.out.println("Note: Voulez vous acheter cette propriete pour "+tab[pos].prix+"Euros? [o/n]");
				  String str=sc.next();
				  if(str.equals("o")){
					  
					  System.out.println("==>Felicitation vous etes le "
					  + "nouveau proprietaire de "+tab[tabJoueur.get(i).getPostion()]+"\n");
					  tabJoueur.get(i).retirer(tab[pos].prix);//on soustrait l'argent
					  tab[pos].estPosseder=true;//la case devient posseder
					  tabJoueur.get(i).ajouterTabPossession((double)pos);// on ajoute la case a la liste des proriete possede par le joueur
					  System.out.println("Résultat-----> Nom: "+tabJoueur.get(i).getNom()+" |Couleur : "+Couleur[tabJoueur.get(i).getJeuton()]+" |Position actuelle : "+tab[tabJoueur.get(i).getPostion()]+" |Solde :"+tabJoueur.get(i).getSolde()+"€ \n");
	
					  }else {System.out.println("Dommage ");}
					  }else {
						  
						  System.out.println("-Votre solde ne permet pas d'acheter  :"+tab[tabJoueur.get(i).getPostion()]);
						  
					  }
				  
			  
			 
		  }
		  else if(tabJoueur.get(i).possedeProrpriete(pos)){
			  System.out.println("Vous posseder cette propriete \n");
		  }
		  }else{
			  // ICI ON DOIT TROUVER LE JOUEUR QUI POSSEDE LA GARE 
	    	  //POUR LUI DONNER LE LOYER
			  j=0;
			  while(j<tabJoueur.size() && !tabJoueur.get(j).possedeProrpriete(pos)) {
				  j++;
				  
				  }
			  
			  
			if  (tabJoueur.get(j).possedeProrpriete(pos)) {
	    	  System.out.println("-Vous devez payer le loyer (2000 Euros) au joueur :"+tabJoueur.get(j).getNom()+"\n");
	    	  tabJoueur.get(j).ajouter(2000.0);
	    	  tabJoueur.get(i).retirer(2000.0);
	        System.out.println("Résultat-----> Nom: "+tabJoueur.get(i).getNom()+" |Couleur : "+Couleur[tabJoueur.get(i).getJeuton()]+" |Position actuelle : "+tab[tabJoueur.get(i).getPostion()]+" |Solde :"+tabJoueur.get(i).getSolde()+"€ \n");
		  
			}
			}
	  }
	  //les Gare
	  if(pos==5  || pos==14|| pos== 24|| pos== 34){
		if(tab[pos].disponible){
			if(tabJoueur.get(i).getSolde() > tab[pos].prix) {
			      System.out.println("Voulez vous acheter cette GARE pour "+tab[pos].prix+"€? [o/n]");
			      String str=sc.next();
			      if(str.equals("o")){
			    	  
					  System.out.println("Felicitation vous etes le "
					  + "nouveau proprietaire de "+tab[tabJoueur.get(i).getPostion()]+"\n");
					  tabJoueur.get(i).retirer(tab[pos].prix);
					  tab[pos].disponible=false;
					  tabJoueur.get(i).ajouterTabPossession((double)pos);
					  System.out.println("Résultat-----> Nom: "+tabJoueur.get(i).getNom()+" |Couleur : "+Couleur[tabJoueur.get(i).getJeuton()]+" |Position actuelle : "+tab[tabJoueur.get(i).getPostion()]+" |Solde :"+tabJoueur.get(i).getSolde()+"€ \n");
			    	  }else {System.out.println("Dommage ");}
			    	  
			    	  }else {
			    		  
			    		  System.out.println("-Votre solde ne permet pas d'acheter  :"+tab[tabJoueur.get(i).getPostion()]);  
			    	  }
			    
		}  
		  else if (tabJoueur.get(i).possedeProrpriete(pos)){
	    	  System.out.println("Vous possedez cette gare \n");
	      }
	      else{
	    	  // ICI ON DOIT TROUVER LE JOUEUR QUI POSSEDE LA GARE 
	    	  //POUR LUI DONNER LE LOYER
	    	  
	    	  j=0;
			  while(j<tabJoueur.size() && !tabJoueur.get(j).possedeProrpriete(pos)) {
				  j++;
				  
				  }
				if  (tabJoueur.get(j).possedeProrpriete(pos)) {
			  System.out.println("-Vous devez payer le loyer (1500 €) au joueur :"+tabJoueur.get(j).getNom()+"\n");
	    	  tabJoueur.get(j).ajouter(1500.0);
	    	  tabJoueur.get(i).retirer(1500.0);
	    	  System.out.println("Résultat-----> Nom: "+tabJoueur.get(i).getNom()+" |Couleur : "+Couleur[tabJoueur.get(i).getJeuton()]+" |Position actuelle : "+tab[tabJoueur.get(i).getPostion()]+" |Solde :"+tabJoueur.get(i).getSolde()+"€ \n");
				}
	    	
	      }
	  }
	  
	  //Caisse de communauté
	  
	  if(pos==2 || pos==16 || pos==32) {
		  
		  System.out.print("Tirer une carte de CAISSE DE COMMUNAUTE [t] \n");
		  
		  carte=sc.next();
		  
		  while(!carte.equals("t")) {
			  
			  System.out.print("Tirer une carte de CAISSE DE COMMUNAUTE [t] \n");
			  
			  carte=sc.next(); }
		  
		  tab[tabJoueur.get(i).getPostion()].choisir(tabJoueur.get(i),B);
		  System.out.println("Résultat-----> Nom: "+tabJoueur.get(i).getNom()+" |Couleur : "+Couleur[tabJoueur.get(i).getJeuton()]+" |Position actuelle : "+tab[tabJoueur.get(i).getPostion()]+" |Solde :"+tabJoueur.get(i).getSolde()+"€ \n");
		  
		  }
	  
	  //carte chance
	  
	  if(pos==7 || pos==21 || pos== 35) {
		  
          System.out.print("Tirer une carte  CHANCE [t] \n");
		  
		  carte=sc.next();
		  
		  while(!carte.equals("t")) {
			  
			  System.out.print("Tirer une carte CHANCE [t] \n");
			  
			  carte=sc.next(); }
		  
		  tab[tabJoueur.get(i).getPostion()].choisir(tabJoueur.get(i),B);
		  System.out.println("Résultat-----> Nom: "+tabJoueur.get(i).getNom()+" |Couleur : "+Couleur[tabJoueur.get(i).getJeuton()]+" |Position actuelle : "+tab[tabJoueur.get(i).getPostion()]+" |Solde :"+tabJoueur.get(i).getSolde()+"€ \n");
		  }
	  
	  
	  
	  
	  //Impot 
	  
	  if(pos==4) {
		  
		 System.out.println("-Vous devez payer une Taxe de :2000€"); 
		 B.ajouter(2000.0);//on ajoute a banque l'argent des impot
		 tab[tabJoueur.get(i).getPostion()].debiter(tabJoueur.get(i));
		 System.out.println("Résultat-----> Nom: "+tabJoueur.get(i).getNom()+" |Couleur : "+Couleur[tabJoueur.get(i).getJeuton()]+" |Position actuelle : "+tab[tabJoueur.get(i).getPostion()]+" |Solde :"+tabJoueur.get(i).getSolde()+"€ \n");
		 
		  		  
	  }
	  
	  
	  
	  
	  
	  //les compagnie de distribution
	  
	  if(pos==11 || pos==27)
	  {if(tab[pos].disponible){
			if(tabJoueur.get(i).getSolde() > tab[pos].prix) {
			      System.out.println("-Voulez vous acheter cette Compagnie de distribution pour "+tab[pos].prix+"€? [o/n]");
			      String str=sc.next();
			      if(str.equals("o")){
			    	  
					  System.out.println("Felicitation vous etes le "
					  + "nouveau proprietaire de "+tab[tabJoueur.get(i).getPostion()]+"\n");
					  tabJoueur.get(i).retirer(tab[pos].prix);
					  tab[pos].disponible=false;
					  tabJoueur.get(i).ajouterTabPossession((double)pos);
					  System.out.println("Résultat-----> Nom: "+tabJoueur.get(i).getNom()+" |Couleur : "+Couleur[tabJoueur.get(i).getJeuton()]+" |Position actuelle : "+tab[tabJoueur.get(i).getPostion()]+" |Solde :"+tabJoueur.get(i).getSolde()+"€ \n");
			    	  }else {System.out.println("Dommage ");}
			    	  
			    	  }else {
			    		  
			    		  System.out.println("-Votre solde ne permet pas d'acheter  :"+tab[tabJoueur.get(i).getPostion()]);  
			    	  }
			    
		}  
		  else if (tabJoueur.get(i).possedeProrpriete(pos)){
	    	  System.out.println("Vous possedez cette gare \n");
	      }
	      else{
	    	  // ICI ON DOIT TROUVER LE JOUEUR QUI POSSEDE LA GARE 
	    	  //POUR LUI DONNER LE LOYER
	    	  
	    	  j=0;
			  while(j<tabJoueur.size() && !tabJoueur.get(j).possedeProrpriete(pos)) {
				  j++;
				  
				  }
				if  (tabJoueur.get(j).possedeProrpriete(pos)) {
			  System.out.println("-Vous devez payer le loyer (3000 €) au joueur :"+tabJoueur.get(j).getNom()+"\n");
	    	  tabJoueur.get(j).ajouter(3000.0);
	    	  tabJoueur.get(i).retirer(3000.0);
	    	  System.out.println("Résultat-----> Nom: "+tabJoueur.get(i).getNom()+" |Couleur : "+Couleur[tabJoueur.get(i).getJeuton()]+" |Position actuelle : "+tab[tabJoueur.get(i).getPostion()]+" |Solde :"+tabJoueur.get(i).getSolde()+"€ \n");
				}
	    	
	      } }
	  
	  
	  
	  
	  //Taxe de Luxe 
	  
	  if(pos==37) {
		  
		 System.out.println("-Vous devez payer une Taxe de Luxe qui s'eleve à  :2000 €\n");
		 B.ajouter(2000.0);
		 tab[tabJoueur.get(i).getPostion()].debiter(tabJoueur.get(i));
		System.out.println("Résultat-----> Nom: "+tabJoueur.get(i).getNom()+" |Couleur : "+Couleur[tabJoueur.get(i).getJeuton()]+" |Position actuelle : "+tab[tabJoueur.get(i).getPostion()]+" |Solde :"+tabJoueur.get(i).getSolde()+"€ \n");
			}
	  
	  
	  
	  //Prison
	  
	  
	  if(pos==29) {
		  
		  
		  System.out.println("-Vous etes suspendu pour  le prochain tour \n");
		  tab[tabJoueur.get(i).getPostion()].estEnPrison(tabJoueur.get(i));
		  System.out.println("Résultat-----> Nom: "+tabJoueur.get(i).getNom()+" |Couleur : "+Couleur[tabJoueur.get(i).getJeuton()]+" |Position actuelle : "+tab[tabJoueur.get(i).getPostion()]+" |Solde :"+tabJoueur.get(i).getSolde()+"€ \n");
		 }
	  
	  
	  //Parc Gratuit
	  
	  if(pos==19) {
		  
		  System.out.println("-Vous allez recevoir l'argent qui a sur le tapis du jeu qui est ="+B.getSolde());
	tab[tabJoueur.get(i).getPostion()].recupere(tabJoueur.get(i), B);
	System.out.println("Résultat-----> Nom: "+tabJoueur.get(i).getNom()+" |Couleur : "+Couleur[tabJoueur.get(i).getJeuton()]+" |Position actuelle : "+tab[tabJoueur.get(i).getPostion()]+" |Solde :"+tabJoueur.get(i).getSolde()+"€ \n");
		  
		  
	  }
	  
	  
	  
	  
	  //on teste si ya une fin de jeu
	  x =0;
		for( int z=0;z<tabJoueur.size();z++){
			x=x+tabJoueur.get(z).FailliteJoueur();
			
		}
	  
	  
	  
	  try {
		Thread.sleep(100);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  nom=sc.next();
		}else {
			
		tabJoueur.get(i).setTourJouer(true);
			
			
		}
	   
		
		}
		}
	

	    }else {
	    	
	    	System.out.println("Fin du jeu.");
			System.exit(1);
	    	
	    }
	    }
	
	}
		
	    
	}
	
	
	

