package fr.iutvalence.java.projets.BatailleNavale;

/**
* 
* @author Chizat & Salgues
* Classe Bateau
*/
public class Bateau {

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
	private final int capacite5;
	private final int capacite4;
	private final int capacite3;
	private final int capacite2;
	
	/**
	 * Constructeur
	 * @return 
	 */
	public Bateau(){
		/**
		 *  taille du bateau: ici 5 cases
		 */
		this.capacite5 = 5;
		/**
		 *  crée un bateau de 5 cases
		 */
		this.bateau5 = new int[this.capacite5];
		
		/**
		 *  taille du bateau: ici 4 cases
		 */
		this.capacite4= 4;
		/**
		 *  crée un bateau de 4 cases
		 */
		this.bateau4 = new int[this.capacite4];
		

		/**
		 *  taille du bateau: ici 3 cases
		 */
		this.capacite3= 3;
		/**
		 *  crée un bateau de 3 cases
		 */
		this.bateau3 = new int[this.capacite3];
		

		/**
		 *  taille du bateau: ici 2 cases
		 */
		this.capacite2= 2;
		/**
		 *  crée un bateau de 2 cases
		 */
		this.bateau2 = new int[this.capacite2];
			
	}
}
