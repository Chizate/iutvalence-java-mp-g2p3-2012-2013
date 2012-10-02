package fr.iutvalence.java.projets.BatailleNavale;

// FIXME clarifier le commentaire
/**
* 
* @author Chizat & Salgues
* Classe Plateau
*/

public class Plateau {
	//********** VARIBLES DE CLASSE ***************
	// FIXME corriger le commentaire
    //tableau a deux dimensions qui représente le plateau de jeu
	private int[][] cases; 

	// FIXME corriger le commentaire
	// taille du plateau
	private final static int CAPACITE = 10;
	
	// FIXME corriger le commentaire
	 //définit l'ensemble des bateaux
	private final BateauBis porte_avion;

	// FIXME corriger le commentaire
	private final BateauBis cuirasse;

	// FIXME corriger le commentaire
	private final BateauBis croiseur1;
	
	// FIXME corriger le commentaire
	private final BateauBis croiseur2;
	
	// FIXME corriger le commentaire
	private final BateauBis vedette;

	//******* Constructeur ************************
	// FIXME clarifier le commentaire
	/**
	 * Constructeur plateau
	 */
	public Plateau()
	{
		int x, y;
		//crée un plateau de 10 cases sur 10
		this.cases = new int[this.CAPACITE][this.CAPACITE];
		// met toutes les cases du plateau Ã  '0' : état "rien fait"
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
