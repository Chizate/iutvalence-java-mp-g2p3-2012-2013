package fr.iutvalence.java.projets.BatailleNavale;

/**
* @author Chizat & Salgues
* Classe Plateau
* gère les créations et les positions des bateaux, les positions des tirs et 
* l'état des cases ( "rien fait", "touché pas coulé", "touché coulé" et "pas touché"
*/

import java.util.*;
public class Plateau {
	//********** ATTRIBUTS ***************
	
	// FIXME définir des constantes pour les valeurs possibles des éléments du tableau
    /**
     * tableau a deux dimensions qui représente le plateau de jeu
     */
	private int[][] cases; 
	
	// FIXME corriger le commentaire
	/**
	 * taille du plateau
	 */
	private final static int CAPACITE = 10;
    
	
	/**
     * définit le porte avion
     */
	// FIXME respecter les conventions d'écriture
	private final Bateau porte_avion;
    
	// FIXME est il pertinent de gérer les bateaux individuellement ?
	/**
     * définit le cuirassé
     */
	private final Bateau cuirasse;
	
    /**
     * définit le croiseur1
     */
	private final Bateau croiseur1;
    
	/**
     * définit le croiseur2
     */
	private final Bateau croiseur2;
    
	/**
     * définit le vedette
     */
	private final Bateau vedette;

	//******* Constructeur ************************
	/**
	 * Constructeur plateau
	 * initial: toutes les cases à '0'
	 * crée les bateaux
	 */
	public Plateau()
	{
		int x, y;
		//crée un plateau de 10 cases sur 10
		this.cases = new int[this.CAPACITE][this.CAPACITE];
		// met toutes les cases du plateau à  '0' : état "rien fait"
		for(x=0; x<10;x++)
		{
			for(y=0;y<10;y++)
				this.cases[x][y]=0;
		}
		
		//cree un nouveau bateau de capacité 5
		this.porte_avion = new Bateau(5);
		//cree un nouveau bateau de capacité 4
		this.cuirasse = new Bateau(4);
		//cree un nouveau bateau de capacité 3
		this.croiseur1 = new Bateau(3);
		//cree un nouveau bateau de capacité 3
		this.croiseur2 = new Bateau(3);
		//cree un nouveau bateau de capacité 2
		this.vedette = new Bateau(2);
	}

	
	//*********** METHODES ************************
	
	// FIXME supprimer cette méthode qui est dépendante de l'IHM (le code peut être conservé pour plus tard ailleurs)
	/**
	 * positionne les bateaux
	 */
	public void Position ()
	{
		int a, b;
		a=10;
		
		Scanner y = new Scanner(System.in);
		System.out.println("Veuillez saisir une lettre pour les ordonnées :");
		String stry = y.nextLine();
		char carac = stry.charAt(0);
		
		// converti les lettres des ordonnées en chiffres pour avoir les 
		// chiffres qui correspondent aux cases du tableau du plateau
		switch (carac)
		{
			case 'A':
				a = 9;
				break;
			case 'B':
				a= 8;
				break;
			case 'C':
				a= 7;
				break;	
			case 'D':
				a= 6;
				break;
			case 'E':
				a= 5;
				break;
			case 'F':
				a= 4;
				break;
			case 'G':
				a= 3;
				break;
			case 'H':
				a= 2;
				break;
			case 'I':
				a= 1;
				break;
			case 'J':
				a= 0;
				break;
		}
			
		while (a > 9)
		// lettre supérieure à J
		{
		System.out.println("Veuillez saisir une lettre entre A et J");
		}
		// lettre entre A et J
		System.out.println("Vous avez saisi : " + carac);
		
		
		Scanner x = new Scanner(System.in);
		System.out.println("Veuillez saisir un chiffre pour les abscisses :");
		int i  = x.nextInt();
		b=i-1;
		while ( b > 9)
		// chiffre supérieur à 10
		{
		System.out.println("Veuillez saisir un chiffre entre 1 et 10");
		}
		// chiffre entre 1 et 10
		System.out.println("Vous avez saisi : " + i);
		
		// à compléter -> vérification cases libres
		//				demander choix du bateau
		//				choix "fin" du bateau
		//				vérifier que le bateau rentre dans le plateau
		
		
	}
}
