package fr.iutvalence.java.projets.BatailleNavale;

/**
* Classe Plateau
* gère les créations et les positions des bateaux, les positions des tirs et 
* l'état des cases ( "rien fait", "touché pas coulé", "touché coulé" et "pas touché"
* @author Chizat & Salgues
*/

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

	
	//******* Constructeur ************************
	/**
	 * Constructeur plateau
	 * initial: toutes les cases à '0'
	 * crée les bateaux
	 */
	public Plateau()
	{
		//crée un plateau de 10 cases sur 10
		
		// FIXME (fixed) corriger : une constante ne s'appelle pas sur un objet mais sur la classe qui la définit 
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
		// initialisation: met toutes les cases en relation avec un bateau
		this.bateaux[0] = new Bateau(2, true, );
		this.bateaux[1] = new Bateau(3);
		this.bateaux[2] = new Bateau(4);
		this.bateaux[3] = new Bateau(4);
		this.bateaux[4] = new Bateau(5);

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
		res = res + "\n\nBateau n°1: " + this.bateaux[0] +"\n";
		res = res + "Bateau n°2: " + this.bateaux[1] +"\n";
		res = res + "Bateau n°3: " + this.bateaux[2] +"\n";
		res = res + "Bateau n°4: " + this.bateaux[3] +"\n";
		res = res + "Bateau n°5: " + this.bateaux[4] +"\n";
	return res;
	}
}
