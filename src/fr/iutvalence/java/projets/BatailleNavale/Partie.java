package fr.iutvalence.java.projets.BatailleNavale;

/**
 * Classe principale Partie
 * gère l'initialisation de la partie, les tours des joueurs
 * une partie est caratérisée par 2 joueurs, 2 plateaux avec des bateaux que les joueurs positionnent
 * 
 *  @author Chizat & Salgues
 */

public class Partie {

	//********** ATTRIBUTS ***************
	/**
	 * plateau sur lequel sont placés les bateaux du joueur1
	 */
	private Plateau plateauJoueur1; 
	
	/**
	 * plateau sur lequel sont placés les tirs du joueur1
	 */
	private Plateau plateauJoueur2; 
	
	/**
	 * joueur 1
	 */
	private Joueur joueur1;
	
	/**
	 * joueur 2
	 */
	private Joueur joueur2;
	
	//******* Constructeur ************************
	/**
	 * Constructeur Partie
	 * crée les joueurs et leur plateaux
	 * @throws HorsPlateauException 
	 */
	public Partie() throws HorsPlateauException
	{
		joueur1 = new Joueur("Joueur1");
		joueur2 = new Joueur("Joueur2");
		plateauJoueur1 = new Plateau();
		plateauJoueur2 = new Plateau();
		
	}
		
	//******* METHODES ****************************
	// FIXME à compléter

	public Etat tirer(Position pos, Plateau plateau) throws HorsPlateauException
	{
		Etat caseVisée = plateau.getEtatCase(pos);
		
		if( caseVisée == Etat.PAS_TOUCHE)
		{
			caseVisée = Etat.TOUCHE;
			
		}

			
		return caseVisée;
	}
	
}
