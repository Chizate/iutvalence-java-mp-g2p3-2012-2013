package fr.iutvalence.java.projets.BatailleNavale;


/**
* Classe Bateau
* sert à savoir l'etat, la position de la tete, et la direction d'un bateau
* 
* @author Chizat & Salgues
*/

public class Bateau {
	
	
	//********** ATTRIBUTS ***************
	/**
	 * un bateau sous forme de tableau
	 * l'indice '0' du tableau est le début du bateau
	 * l'indice capa-1 est la fin du bateau
	 */
	private Etat[] bateau; 
	
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
		this.bateau = new Etat[capa];
		for(int a=0; a<this.capacite; a++)
		{
				this.bateau[a]=Etat.PAS_TOUCHE;
				// toutes les cases du bateau sont a '1' car leur état est 'PAS_TOUCHE'
		}

	}


	//*********** METHODES ************************
	/**
	 * etat du bateau 
	 * @param bateau
	 */
	public Etat[] getEtatBateau()
	{
		return this.bateau;
	}
	
	/**
	 * 
	 * @param bat: un bateau
	 * @return tab: un tableau avec les positions des cases du bateau
	 */
	public Position[] tabPositions()
	{
		Position[] tab = new Position[this.capacite];
		for (int i =0; i< this.capacite; i++)
		{
			int X = this.positionBat.getX();
			int Y = this.positionBat.getY();
			if (this.dir) //horizontal
			{
				for(int a=0; a<this.capacite; a++)
				{
					tab[a]= ; // à finir
					X++;
				}
			}
			else //verticale
			{
				
			}
		}
		return tab;
	}

	public String toString() 
	{
		String res="";
		res= res +"[";
		int a;
		String d="";
		for (a=0; a<this.capacite-1; a++ )
		{
			res= res + this.bateau[a] + "|";
		}
		res = res + this.bateau[a];
		res = res +"]\n";
		if (this.dir == true)
		{
			d ="Horizontale";
		}
		else
		{
			d= "Verticale";
		}
		res = res + "Direction : " + d + "\nPosition : " + this.positionBat;
		return res;
	}

}