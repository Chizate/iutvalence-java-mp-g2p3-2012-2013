package fr.iutvalence.java.projets.BatailleNavale;


// FIXME corriger le commentaire dire à quoi sert la classe, pas ce qu'elle fait.
/**
* Classe Bateau
* 
* @author Chizat & Salgues
*/

public class Bateau {
	
	//********** CONSTANTES ***************
	/**
	 * la partie du bateau est intacte
	 */
	public final static int PAS_TOUCHE=1;
	
	/**
	 * la partie du bateau est touchée
	 */
	public final static int TOUCHE=2;
	
	/**
	 * toutes les parties du bateau sont touchées, le bateau est coulé
	 */
	public final static int COULE=3;
	
	/**
	 * les tir est dans l'eau
	 */
	public final static int DANS_LEAU=4;
	
	//********** ATTRIBUTS ***************
	/**
	 * un bateau sous forme de tableau
	 * l'indice '0' du tableau est le début du bateau
	 * l'indice capa-1 est la fin du bateau
	 */
	private int[] bateau; 
	
	/**
	 * la capacité du tableau qui represente un bateau pour la redifinition de la methode toString
	 */
	private int capacite;
	
	/**
	 * la direction du bateau ( horizontale = true ou verticale = false )
	 */
	private boolean dir;
	
	/**
	 * position de la tete du bateau
	 */
	private Position positionBat;

	
	//*********** Constructeurs *******************
	 
	/**
	 * construit un bateau de taille capa (?)
	 * @param capa : la taille du bateau
	 * @param dir : un booléen pour la direction du bateau: true -> horizontale; false -> verticale
	 * @param positionBat : position du bateau
	 */
	public Bateau(int capa, boolean d, Position p)
	{
		this.dir=d;
		this.positionBat=p;
		this.capacite = capa;
		this.bateau = new int[capa];
		for(int a=0; a<this.capacite; a++)
		{
				this.bateau[a]=PAS_TOUCHE;
				// toutes les cases du bateau sont a '1' car leur état est 'PAS_TOUCHE'
		}

	}


	//*********** METHODES ************************


	public String toString() 
	{
		String res="";
		res= res +"[";
		int a;
		for (a=0; a<this.capacite-1; a++ )
		{
			res= res + this.bateau[a] + "|";
		}
		res = res + this.bateau[a];
		res = res +"]\n";
		res = res + "Direction : " + this.dir + "\nPosition : " + this.positionBat;
		return res;
	}

}