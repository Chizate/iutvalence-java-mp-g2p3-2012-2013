package fr.iutvalence.java.projets.BatailleNavale;

/**
* Classe Plateau
* gère les créations et les positions des bateaux, les positions des tirs et 
* l'état des cases ( "rien fait", "touché pas coulé", "touché coulé" et "pas touché"
* @author Chizat & Salgues
*/

public class Plateau {
	//********** ATTRIBUTS ***************
	
	// FIXME (fixed) déplacer la définition des attributs après celles des constantes
    
	/**
	 * losqu'une case du plateau a pour valeur la constante RIEN=0: le joueur n'a rien fait sur cette case
	 */
	private final static int RIEN = 0;
	
	/**
	 * losqu'une case du plateau a pour valeur la constante PAS_TOUCHE=1: la partie du bateau est intacte
	 */
	private final static int PAS_TOUCHE=1;
	
	/**
	 * losqu'une case du plateau a pour valeur la constante TOUCHE=2: la partie du bateau est touchée
	 */
	private final static int TOUCHE=2;
	
	/**
	 * losqu'une case du plateau a pour valeur la constante COULE=3: toutes les parties du bateau sont touchées, le bateau est coulé
	 */
	private final static int COULE=3;
	
	/**
	 * le plateau est une grille de 10 cases sur 10
	 * 
	 */
	// FIXME (fixed) renommer la constante, le nom est mal choisi
	private final static int TAILLE = 10;
    
	/**
     * tableau a deux dimensions qui représente le plateau de jeu
     */
	private int[][] grille; 
	
	
	// FIXME est il pertinent de gérer les bateaux individuellement ?
	/**
     * définit le porte avion
     */
	private final Bateau porteAvion;
    
	
	/**
     * définit le cuirassé
     */
	private final Bateau cuirasse;
	
    /**
      * définit le croiseur1
     */
	private final Bateau croiseur1;
    
	/**
     * définit le croiseur2
     */
	private final Bateau croiseur2;
    
	/**
     * définit le vedette
     */
	private final Bateau vedette;


	//******* Constructeur ************************
	/**
	 * Constructeur plateau
	 * initial: toutes les cases à '0'
	 * crée les bateaux
	 */
	public Plateau()
	{
		
		int x, y;
		//crée un plateau de 10 cases sur 10
		
		// FIXME corriger : une constante ne s'appelle pas sur un objet mais sur la classe qui la définit 
		this.grille = new int[this.TAILLE][this.TAILLE];
		// met toutes les cases du plateau à  '0' : état "rien fait"
		for(x=0; x<10;x++)
		{
			for(y=0;y<10;y++)
				this.grille[x][y]=0;
		}
		
		//cree un nouveau bateau de capacité 5
		this.porteAvion = new Bateau(5);
		//cree un nouveau bateau de capacité 4
		this.cuirasse = new Bateau(4);
		//cree un nouveau bateau de capacité 3
		this.croiseur1 = new Bateau(3);
		//cree un nouveau bateau de capacité 3
		this.croiseur2 = new Bateau(3);
		//cree un nouveau bateau de capacité 2
		this.vedette = new Bateau(2);
	}

	
	//*********** METHODES ************************
	
	// FIXME écrire un application de test basique pour cette classe
		
}
