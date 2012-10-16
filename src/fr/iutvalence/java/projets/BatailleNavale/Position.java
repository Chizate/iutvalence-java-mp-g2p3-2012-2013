package fr.iutvalence.java.projets.BatailleNavale;

// FIXME compléter le commentaire
/**
 * 
 * @author chizate & Salgues
 *
 */
public class Position {

	//****************** ATTRIBUTS ********************************
	/**
	 * abscisse d'une position
	 */
	private int x;
	
	/**
	 * ordonnée d'une position
	 */
	private int y;
	
	
	// FIXME est-ce vraiment utile ? (à discuter)
	/**
	 * tableau de 2 cases contenant les résultats de getX() et getY()
	 */
	private int[] tabPositions;
	
	//*********************** CONSTRUCTEURS *************************
	public Position()
	{
	this.tabPositions=new int[2];
	this.tabPositions[0]=getX();
	this.tabPositions[1]=getY();
	}
	
	//************************** METHODES ***************************
	/**
	 * méthode qui permet de retourner x
	 * @return x
	 */
	private int getX()
	{return this.x;}

	/**
	 * méthode qui permet de retourner y
	 * @return x
	 */
	private int getY()
	{return this.y;}
	
	
	// FIXME redéfinir toString
	
	// FIXME redéfinir equals et hashCode
	
	// FIXME écrire un application de test basique pour cette classe
}
