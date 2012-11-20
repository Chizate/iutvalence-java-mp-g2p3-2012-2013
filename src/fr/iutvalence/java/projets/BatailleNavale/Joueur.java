package fr.iutvalence.java.projets.BatailleNavale;


// FIXME si cette classe gère un joueur (ce qu'elle drevrait faire) quel est le sens des 2 attributs et de l'implementation du constructeur (à discuter)
/**
* Un joueur est caractérisé par son pseudo qui sera saisi en début de partie par l'utilisateur
* le joueur va positionner ses bateaux sur son plateau 
* puis il va tirer sur le plateau du joueur adverse qui aura lui aussi positionné ses bateaux
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
	
	public Joueur()
	{
		this.pseudo= "";	
	}
	
	public Joueur(String nom)
	{
		this.pseudo= nom;	
	}
	
	//******* METHODES ****************************
	// FIXME (fixed) à compléter
	
	public String toString()
	{
		return this.pseudo;
	}
	
	public String getPseuso()
	{
		return this.pseudo;
	}
	
	public void setPseudo(String newPseudo)
	{
		this.pseudo = newPseudo;
	}
}