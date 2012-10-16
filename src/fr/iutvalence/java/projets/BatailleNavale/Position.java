package fr.iutvalence.java.projets.BatailleNavale;

// FIXME (fixed) compléter le commentaire
/**
 * position des bateaux
 * contient des méthodes qui retournent x et y (abscisse et ordonnée d'une position)
 * redéfinit toString, equals et hashCode
 * @author chizate & Salgues
 *
 */
public class Position {

	//****************** ATTRIBUTS ********************************
	public final static int MIN = 0;
	public final static int MAX = 9;

	
	/**
	 * abscisse d'une position
	 */
	private int x;
	
	/**
	 * ordonnée d'une position
	 */
	private int y;
	
	
	// FIXME (fixed) est-ce vraiment utile ? (à discuter)
	
	
	//*********************** CONSTRUCTEURS *************************


	//************************** METHODES ***************************
	/**
	 * méthode qui permet de retourner x
	 * @return x
	 */
	private int getX()
	{
		return this.x;
	}

	/**
	 * méthode qui permet de retourner y
	 * @return x
	 */
	private int getY()
	{
		return this.y;
	}
	
	
	// FIXME (fixed)redéfinir toString
	public String toString ()
	{
		return "("+this.x+","+this.y+")";
	}
	
	// FIXME (fixed) redéfinir equals et hashCode
	public boolean equals (Object o)
	{
		if (o == null) return false;
		if (o == this) return true;
		if (!( o instanceof Position)) return false;
		Position temp =(Position) o;
		return (this.x == temp.x) && (this.y == temp.y);
	}
	
	public int hashCode ()
	{
		return this.x+this.y;
	}
	
	// FIXME écrire un application de test basique pour cette classe
}
