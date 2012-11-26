package fr.iutvalence.java.projets.BatailleNavale;

/**
* Classe Plateau
* gère les créations et les positions des bateaux, les positions des tirs et 
* l'état des cases ( "rien fait", "touché pas coulé", "touché coulé" et "pas touché"
* @author Chizat & Salgues
*/
import java.util.*;
	
public class Plateau {


	/**
	 * le plateau est une grille de 10 cases sur 10
	 * 
	 */
	private final static int TAILLE = 10;
    
	//********** ATTRIBUTS ***************
	/**
     * tableau a deux dimensions qui représente le plateau de jeu
     */
	
	private Etat[][] grille; 
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
	 * @throws HorsPlateauException 
	 */
	public Plateau() throws HorsPlateauException
	{
		//crée un plateau de 10 cases sur 10
		this.grille = new Etat[Plateau.TAILLE][Plateau.TAILLE];
		
		// met toutes les cases du plateau à  '0' : état "rien fait"
		for(int x=0; x<TAILLE ;x++)
		{
			for(int y=0; y<TAILLE; y++)
				this.grille[x][y]= Etat.RIEN;
		}
	
		// crée le tableau de bateaux
		nbBat=5;
		this.bateaux = new Bateau[nbBat];
		for ( int i=0; i< nbBat; i++ )
		{  
			int capa = i+2;
			Random abscisse = new Random();
			int a = abscisse.nextInt(TAILLE); // a = abscisse
			Random ordonnee = new Random();
			int o = ordonnee.nextInt(TAILLE); // o = ordonnee
			Random direction = new Random();
			boolean dirHorizontal = direction.nextBoolean();
			
			
			while (TAILLE - capa <= o || TAILLE - capa <= a)
			{
				o = ordonnee.nextInt(TAILLE);// change la valeur de o tant que le bateau dépasse de la grille
				a = abscisse.nextInt(TAILLE); // change la valeur de a tant que le bateau dépasse de la grille
			}
			Position pos = new Position(a, o);
			
			if (!placeDispo(pos)) 
			{
				if (dirHorizontal)
				{
					Position posIntermédiaire1 = new Position(a+capa,o);
					System.out.println(posIntermédiaire1);
					if (!placeDispo(posIntermédiaire1))
					{
						o = ordonnee.nextInt(TAILLE);// change la valeur de o tant que le bateau dépasse de la grille
						a = abscisse.nextInt(TAILLE); // change la valeur de a tant que le bateau dépasse de la grille
					}
				}
				else
				{
					Position posIntermédiaire2 = new Position(a,o+capa);
					if (!placeDispo(posIntermédiaire2))
					{
						o = ordonnee.nextInt(TAILLE);// change la valeur de o tant que le bateau dépasse de la grille
						a = abscisse.nextInt(TAILLE); // change la valeur de a tant que le bateau dépasse de la grille
					}
				}
				
			}
			
			
			this.bateaux[i] = new Bateau(capa, dirHorizontal, pos);
			this.grille[a][o] = Etat.PAS_TOUCHE; // positionne la tete du bateau
			if (dirHorizontal)// horizontale
			{
				for (int m = 1; m < capa; m++) // contruit le reste du bateau
				{
					this.grille[a + m][o] = Etat.PAS_TOUCHE;
				}
				
				} 
			else // verticale
			{
				for (int m = 1; m < capa; m++) //construit le reste du bateau 
				{
					this.grille[a][o + m] = Etat.PAS_TOUCHE;
				}
			}
		}
		
	}

	
	//*********** METHODES ************************
	/**
	 * @param pos: une position
	 * @return res: la valeur de la case pos
     * @throws HorsPlateauException 
	 */
	// FIXME (fixed) gérer les débordement 
	public Etat getEtatCase(Position pos) throws HorsPlateauException
	{
		int abs = pos.getX();
		int ord = pos.getY();
		
		if (abs < 0 || abs >= TAILLE || ord < 0 || ord >= TAILLE )
		{
			throw new HorsPlateauException();
		}
		
			return this.grille[abs][ord];

	}


	/**
	 * @param pos : une position
	 * @return un booléen: true = libre, false = non libre
	 * @throws HorsPlateauException 
	 */
	public boolean placeDispo(Position pos) throws HorsPlateauException
	{
		return (this.getEtatCase(pos) == Etat.RIEN);
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
				if (this.grille[x][y] == Etat.RIEN) 
				{
					res = res + " |  ";
				}
				else
					res = res + " | " + "X";
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
		res = res + "getEtatCase = ";
		try {
			getEtatCase(testPos);
		}
		catch (HorsPlateauException e){}
		res = res + "\n\n";
		res = res + testPos.getX() + " / " + testPos.getY() +"\n\n";
	return res;
	}
	

}