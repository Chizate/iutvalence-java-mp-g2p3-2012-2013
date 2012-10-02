package fr.iutvalence.java.projets.BatailleNavale;

/**
* @author Chizat & Salgues
* Classe Bateau
*/
public class Bateau {

	//********** VARIBLES DE CLASSE ****************
	/**
	 * tableaux qui contient les positions du bateau de 5 cases, puis de 4,
	 * 3 et 2 cases
	 *  ex : [e4; e5; e6; e7 ; e8]
	 */
	private int[] bateau5; 
	private int[] bateau4; 	
	private int[] bateau3; 	
	private int[] bateau2; 
	/**
	 *  taille du bateau (donc du tableau)
	 */
	private final static int CAPACITE5 = 5;
	private final static int CAPACITE4 = 4;
	private final static int CAPACITE3 = 3;
	private final static int CAPACITE2 = 2;
	
	
	//*********** Constructeur ************************
	/**
	 * Constructeur
	 * @return 
	 */
	public Bateau()
	{
		
		/**
		 *  construit un bateau de 5 cases
		 */
		this.bateau5 = new int[this.CAPACITE5];
		

		/**
		 *  construit un bateau de 4 cases
		 */
		this.bateau4 = new int[this.CAPACITE4];
		


		/**
		 *  construit un bateau de 3 cases
		 */
		this.bateau3 = new int[this.CAPACITE3];
		

		
		/**
		 *  construit un bateau de 2 cases
		 */
		this.bateau2 = new int[this.CAPACITE2];
			
	}
}
