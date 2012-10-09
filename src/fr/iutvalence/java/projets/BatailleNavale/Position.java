package fr.iutvalence.java.projets.BatailleNavale;

/**
 * 
 * @author chizate & Salgues
 *
 */
public class Position {

	//****************** ATTRIBUTS ********************************
	/**
	 * variable x qui correspond aux abscisses d'une position
	 */
	private int x;
	
	/**
	 * variable y qui correspond aux ordonnées d'une position
	 */
	private int y;
	
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
}
