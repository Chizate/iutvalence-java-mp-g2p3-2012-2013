package fr.iutvalence.java.projets.BatailleNavale;


/**
* Un joueur est caractérisé par son pseudo qui sera saisi en début de partie par l'utilisateur
* le joueur va tirer sur le plateau du joueur adverse pour essayer de toucher ses bateaux
* 
* @author Chizat & Salgues
* 
*/

public class Joueur {

	//********** ATTRIBUTS ***************
	
	/**
	 * pseudo du joueur
	 */
	private String pseudo;
	
	
	//******* Constructeur ************************
	/**
	 * affecte un pseudo à un joueur
	 * @param nom
	 */
	public Joueur(String nom)
	{
		this.pseudo = nom;	
	}
	
	//******* METHODES ****************************
	/**
	 * affichage du pseudo du joueur
	 */
	public String toString()
	{
		return this.pseudo;
	}
	
	/**
	 * renvoie le pseudo
	 * @return pseudo
	 */
	public String getPseuso()
	{
		return this.pseudo;
	}
	
	/**
	 * modification du pseudo
	 * @param newPseudo
	 */
	public void setPseudo(String newPseudo)
	{
		this.pseudo = newPseudo;
	}
}