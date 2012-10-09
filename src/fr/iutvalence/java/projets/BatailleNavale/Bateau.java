package fr.iutvalence.java.projets.BatailleNavale;


// FIXME (fixed) corriger le commentaire : ici, on ne doit pas parler du tableau, juste dire à quoi sert la classe
/**
* @author Chizat & Salgues
* Classe Bateau
* déclare un bateau
* construit un bateau
*/

public class Bateau {
	
	//********** ATTRIBUTS ***************
	
	// FIXME(fixed)corriger le commentaire (préciser la manière dont le bateau est représenté par le tableau)
	/**
	 * un bateau sous forme de tableau
	 * l'indice '0' du tableau est le début du bateau
	 * l'indice capa-1 est la fin du bateau
	 */
	private int[] bateau; 
	
	//*********** Constructeurs *******************
	
	// FIXME(fixed) corriger le commentaire : il faut expliquer quel bateau on obtient sans parler du tableau
	/**
	 * construit un bateau de taille capa
	 * @param capa
	 */
	public Bateau(int capa)
	{
		this.bateau = new int[capa];
	}
	
	//*********** METHODES ************************
	// à compléter

}

