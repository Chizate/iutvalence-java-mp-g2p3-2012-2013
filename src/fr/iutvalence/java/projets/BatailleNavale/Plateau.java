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
	
	/**
	 * position de la tete du bateau
	 */
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
		for(int x=0; x<TAILLE ;x++)
		{
			for(int y=0; y<TAILLE; y++)
				this.grille[x][y]= RIEN;
		}
	
		// crée le tableau de bateaux
		nbBat=5;
		this.bateaux = new Bateau[nbBat];
		for ( int i=0; i< nbBat; i++ )
		{
			int m;
			int capa = i+2;
			boolean d;
			

			Random abscisse = new Random();
			int a = abscisse.nextInt(10); // a = abscisse
			Random ordonnee = new Random();
			int o = ordonnee.nextInt(10); // o = ordonnee
			Random direction = new Random();
			int b = direction.nextInt(2); // b = 0 ou b = 1
			while (TAILLE - capa <= o || TAILLE - capa <= a) {
				o = ordonnee.nextInt(10);// change la valeur de o tant que le bateau dépasse de la grille
				a = abscisse.nextInt(10); // change la valeur de a tant que le bateau dépasse de la grille
			}
			if (b == 0) // verticale
			{
				d = false;
			} else {
				d = true; // horizontale
			}
			pos = new Position(a, o);
			this.bateaux[i] = new Bateau(capa, d, pos);
			this.grille[a][o] = 2; // positionne la tete du bateau
			if (d == false)// verticale
			{
				for (m = 1; m < capa; m++) //construit le reste du bateau 
				{
					this.grille[a][o + m] = 1;
				}
				} 
			else // horizontale
			{
				for (m = 1; m < capa; m++) // contruit le reste du bateau
				{
					this.grille[a + m][o] = 3;
				}
			}
		}
		
	}

	
	//*********** METHODES ************************
	/**
	 * @param pos: une position
	 * @return res: la valeur de la case pos
	 */
	public int getEtatCase(Position pos)
	{
		int res = 0;
		int abs;
		int ord;
		abs = pos.getX();
		ord = pos.getY();
		
		if (0 < abs && abs < 10)
		{
			if (0 < ord && abs < 10)
			{
				res = this.grille[abs][ord];
			}
			else
			{
				res = -2 ;
			}
		}
		else 
		{
			res = -1;
		}
		return res;
	}
	
	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() 
	{
		String res="";
		res = "    1   2   3   4   5   6   7   8   9   10 \n";
		res = res + "  ----------------------------------------- \n";
		char lettre;
		lettre = (int) 'A';
		int x;
		int y;
		for (y=0; y<Plateau.TAILLE; y++ )
		{
			res = res + ((char)(lettre+y));
			for (x=0; x < Plateau.TAILLE; x++)
			{
				if (this.grille[x][y] == RIEN) 
				{
					res = res + " |  ";
				}
				else
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
		Position testPos = new Position(9,9);
		res = res + "getEtatCase = " + getEtatCase(testPos) +"\n\n";
		res = res + testPos.getX() + " / " + testPos.getY() +"\n\n";
	return res;
	}
	

}