package fr.iutvalence.java.projets.BatailleNavale;
/**
 * 
 * @author chizate & Salgues
 * classe de test de la classe Position
 *
 */

public class TestPosition {
	
	public static void main (String [] args)
	{

		Position p = new Position(2,6);
		System.out.println("X= "+ p.getX());
		System.out.println("Y= "+ p.getY());
		System.out.println("Position = " +p);
	
	}

}