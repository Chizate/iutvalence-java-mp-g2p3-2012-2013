package fr.iutvalence.java.projets.BatailleNavale;

/**
* Classe Plateau
* gère les créations et les positions des bateaux, les positions des tirs et 
* l'état des cases ( "rien fait", "touché pas coulé", "touché coulé" et "pas touché"
* @author Chizat & Salgues
*/
import java.util.*;
	
public class Plateau {
	//********** ATTRIBUTS ***************

    
	/**
	 * lorsqu'une case du plateau a pour valeur la constante RIEN=0: le joueur n'a rien fait sur cette case
	 */
	public final static int RIEN = 0;
	
	/**
	 * le plateau est une grille de 10 cases sur 10
	 * 
	 */
	private final static int TAILLE = 10;
    
	/**
     * tableau a deux dimensions qui représente le plateau de jeu
     */
	
	private int[][] grille; 
	/**
	 * Tableau de bateaux 
	 */
	
	private Bateau[] bateaux;
	
	/**
	 * Nombre de bateaux
	 */
	private int nbBat; // = 5;
	
	private Position pos;
	
	//******* Constructeur ************************
	/**
	 * Constructeur plateau
	 * initial: toutes les cases à '0'
	 * crée les bateaux
	 */
	public Plateau()
	{
		//crée un plateau de 10 cases sur 10
		this.grille = new int[Plateau.TAILLE][Plateau.TAILLE];
		
		// met toutes les cases du plateau à  '0' : état "rien fait"
		for(int x=0; x<10;x++)
		{
			for(int y=0;y<10;y++)
				this.grille[x][y]=0;
		}
	
		// crée le tableau de bateaux
		nbBat=5;
		this.bateaux = new Bateau[nbBat];
		for ( int i=0; i< 5; i++ )
		{
			Random abscisse = new Random(); 
			int a = abscisse.nextInt(10);
			Random ordonnee = new Random();
			int o = ordonnee.nextInt(10);
			Random direction = new Random();
			int b = direction.nextInt(2);
			int capa = 3;
			boolean d;
			if (b == 0) // verticale
			{
				d = false;
			}
			else
			{
				d = true; // horizontale
			}
		    pos = new Position(a, o);
		    this.bateaux[i] = new Bateau(capa, d, pos);  
		    this.grille[a][o]= 2;
		    
		    if (d == false)// verticale
		    {
		    	for (int m = o; m< i+2; m++)
		    	{
		    		this.grille[a][m]=1;
		    	}
		    	
		    }
		    else // horizontale
		    {
		    	for (int m = a; m< i+2; m++)
		    	{
		    		this.grille[m][o]=3;
		    	}
		    }
		}

		
	}

	
	//*********** METHODES ************************
	
	public String toString() 
	{
		String res="";
		res = "    1   2   3   4   5   6   7   8   9   10 \n";
		res = res + "  ----------------------------------------- \n";
		char lettre;
		lettre = (int) 'A';
		int x;
		int y;
		for (x=0; x<Plateau.TAILLE; x++ )
		{
			res = res + ((char)(lettre+x));
			for (y=0; y < Plateau.TAILLE; y++)
			{
				res = res + " | " + this.grille[x][y];
			}
			res = res +" | \n";
			res = res + "  ----------------------------------------- \n";
			
		}
		res = res + "\n\nBateau n°1: " + this.bateaux[0] +"\n\n";
		res = res + "Bateau n°2: " + this.bateaux[1] +"\n\n";
		res = res + "Bateau n°3: " + this.bateaux[2] +"\n\n";
		res = res + "Bateau n°4: " + this.bateaux[3] +"\n\n";
		res = res + "Bateau n°5: " + this.bateaux[4] +"\n\n";
	return res;
	}
}
