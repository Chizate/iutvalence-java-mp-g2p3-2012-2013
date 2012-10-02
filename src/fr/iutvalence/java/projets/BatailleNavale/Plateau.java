package fr.iutvalence.java.projets.BatailleNavale;

/**
* 
* @author Chizat & Salgues
* Classe Plateau
*/

public class Plateau {
	//********** VARIBLES DE CLASSE ***************
	
    //tableau a deux dimensions qui représente le plateau de jeu
	private int[][] cases; 

	// taille du plateau
	private final static int CAPACITE = 10;
	
	 //définit l'ensemble des bateaux
	private final BateauBis porte_avion;
	private final BateauBis cuirasse;
	private final BateauBis croiseur1;
	private final BateauBis croiseur2;
	private final BateauBis vedette;
	
	//******* Constructeur ************************
	/**
	 * Constructeur plateau
	 */
	public Plateau()
	{
		int x, y;
		//crée un plateau de 10 cases sur 10
		this.cases = new int[this.CAPACITE][this.CAPACITE];
		// met toutes les cases du plateau à '0' : état "rien fait"
		for(x=0; x<10;x++)
		{
			for(y=0;y<10;y++)
				this.cases[x][y]=0;
		}
		
		//cree un nouveau bateau de capacité 5
		this.porte_avion = new BateauBis(5);
		//cree un nouveau bateau de capacité 4
		this.cuirasse = new BateauBis(4);
		//cree 2 nouveaux bateaux de capacité 3
		this.croiseur1 = new BateauBis(3);
		this.croiseur2 = new BateauBis(3);
		//cree un nouveau bateau de capacité 2
		this.vedette = new BateauBis(2);
	}
	
	//*********** METHODES ************************

}
