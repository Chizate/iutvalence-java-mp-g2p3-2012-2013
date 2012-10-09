package fr.iutvalence.java.projets.BatailleNavale;

/**
* @author Chizat & Salgues
* Classe Plateau
* gère les créations et les positions des bateaux, les positions des tirs et 
* l'état des cases ( "rien fait", "touché pas coulé", "touché coulé" et "pas touché"
*/

public class Plateau {
	//********** ATTRIBUTS ***************
	
	// FIXME(fixed) définir des constantes pour les valeurs possibles des éléments du tableau
    /**
     * tableau a deux dimensions qui représente le plateau de jeu
     */
	private int[][] cases; 
	
	/**
	 * losqu'une case du tableau a pour valeur la constante RIEN=0: le joueur n'a rien fait sur cette case
	 */
	private final static int RIEN=0;
	
	/**
	 * losqu'une case du tableau a pour valeur la constante PAS_TOUCHE=1: la partie du bateau est intacte
	 */
	private final static int PAS_TOUCHE=1;
	
	/**
	 * losqu'une case du tableau a pour valeur la constante TOUCHE=2: la partie du bateau est touchée
	 */
	private final static int TOUCHE=2;
	
	/**
	 * losqu'une case du tableau a pour valeur la constante COULE=3: toutes les parties du bateau sont touchées, le bateau est coulé
	 */
	private final static int COULE=3;
	
	// FIXME(fixed) corriger le commentaire
	/**
	 * le plateau est une grille de 10 cases sur 10
	 * on utilise CAPACITE=10 pour créer une grille de 10 cases de larges sur 10 cases de haut
	 */
	private final static int CAPACITE = 10;
    
	
	/**
     * définit le porte avion
     */
	// FIXME(fixed) respecter les conventions d'écriture
	private final Bateau porteAvion;
    
	// FIXME est il pertinent de gérer les bateaux individuellement ?
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
		this.cases = new int[this.CAPACITE][this.CAPACITE];
		// met toutes les cases du plateau à  '0' : état "rien fait"
		for(x=0; x<10;x++)
		{
			for(y=0;y<10;y++)
				this.cases[x][y]=0;
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
	
	// FIXME(fixed) supprimer cette méthode qui est dépendante de l'IHM (le code peut être conservé pour plus tard ailleurs)
	
		
}
