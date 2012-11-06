package fr.iutvalence.java.projets.BatailleNavale;

/**
 * Position représentée par un couple (abscisse, ordonnée)
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
	
	
	
	//*********************** CONSTRUCTEURS *************************
    
    public Position(int abcisse, int ordonnee)
    {
    	this.x = abcisse;
    	this.y = ordonnee;
    }


	//************************** METHODES ***************************
	/**
	 * méthode qui permet de retourner x
	 * @return x
	 */
    public int getX()
	{
		return this.x;
	}

	/**
	 * méthode qui permet de retourner y
	 * @return x
	 */
	public int getY()
	{
		return this.y;
	}
	
	
	// FIXME (fixed) compléter le commentaire
	/**
	 * redéfinition de la methode toString
	 * retourne les coordonnées de la position sous la forme (x,y)
	 * @see java.lang.Object#toString()
	 */
	public String toString ()
	{
		return "("+this.x+","+this.y+")";
	}
	
	/**
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals (Object o)
	{
		if (o == null) return false;
		if (o == this) return true;
		if (!( o instanceof Position)) return false;
		Position temp =(Position) o;
		return (this.x == temp.x) && (this.y == temp.y);
	}
	
	/**
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode ()
	{
		return this.x+this.y;
	}
	
	// FIXME (fixed) écrire un application de test basique pour cette classe
}
