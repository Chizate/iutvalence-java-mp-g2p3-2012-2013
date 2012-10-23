package fr.iutvalence.java.projets.BatailleNavale;


// FIXME (fixed?)corriger le commentaire : le commentaire ici peut s'appliquer à n'importe quelle classe, sans pour autant qu'on comprenne à quoi elle sert du point de vue du modèle
/**
* Classe Bateau
* déclare un bateau
* construit un bateau
* initialise l'état des bateaux à '0' -> état 'RIEN'
* 
* @author Chizat & Salgues
*/

public class Bateau {
	
	//********** ATTRIBUTS ***************
	/**
	 * un bateau sous forme de tableau
	 * l'indice '0' du tableau est le début du bateau
	 * l'indice capa-1 est la fin du bateau
	 * par exemple un bateau de 5 cases sera représenté par un tableau : [0|1|2|3|4]
	 */
	private int[] bateau; 
	
	//*********** Constructeurs *******************
	
	// FIXME (fixed) compléter la balise "@param capa" 
	/**
	 * construit un bateau de taille capa
	 * par exemple un bateau de 6 cases sera représenté par un tableau : [0|1|2|3|4|5]
	 * @param capa la capacité du tableau qui represente un bateau
	 */
	public Bateau(int capa)
	{
		this.bateau = new int[capa];
		// FIXME (fixed) il faut donner une valeur aux éléments du tableau
		int a;
		for(a=0; a<capa;a++)
		{
				this.bateau[a]=0;
				// toutes les cases du bateau sont a '0' car leur état est 'RIEN' -> cf attributs de Plateau
		}
		
	}


	public String toString() 
	{
		String res="";
		// ...remplir la chaine
		return res;
	}
	
	//*********** METHODES ************************


// FIXME écrire un application de test basique pour cette classe
	

}
