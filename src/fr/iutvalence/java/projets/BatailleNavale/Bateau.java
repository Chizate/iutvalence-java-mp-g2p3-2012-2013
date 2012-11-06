package fr.iutvalence.java.projets.BatailleNavale;


// FIXME (fixed) corriger le commentaire : le commentaire ici peut s'appliquer à n'importe quelle classe, sans pour autant qu'on comprenne à quoi elle sert du point de vue du modèle
/**
* Classe Bateau
* déclare un bateau
* construit un bateau
* initialise l'état des bateaux à '0' -> état 'RIEN'
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
	
	private boolean dir;
	private Position positionBat;
	
	//*********** Constructeurs *******************
	 
	/**
	 * construit un bateau de taille capa (?)
	 * @param capa : la taille du bateau
	 * @param dir : un booléen pour la direction du bateau: true -> verticale; false -> horizontale
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
		res = res +"]";
		return res;
	}

}
