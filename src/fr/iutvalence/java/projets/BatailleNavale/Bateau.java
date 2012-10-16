package fr.iutvalence.java.projets.BatailleNavale;
import java.util.Scanner;

// FIXME corriger le commentaire : le commentaire ici peut s'appliquer à n'importe quelle classe, sans pour autant qu'on comprenne à quoi elle sert du point de vue du modèle
/**
* Classe Bateau
* déclare un bateau
* construit un bateau
* 
* @author Chizat & Salgues
*/

public class Bateau {
	
	//********** ATTRIBUTS ***************
	
	// FIXME corriger le commentaire (indiquer quelles valeurs peuvent prendre les cases du tableau, prendre un exemple)
	/**
	 * un bateau sous forme de tableau
	 * l'indice '0' du tableau est le début du bateau
	 * l'indice capa-1 est la fin du bateau
	 */
	private int[] bateau; 
	
	//*********** Constructeurs *******************
	
	// FIXME corriger le commentaire : indiquer à quoi ressemble le bateau une fois construit 
	// FIXME compléter la balise "@param capa" 
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

// FIXME écrire un application de test basique pour cette classe

