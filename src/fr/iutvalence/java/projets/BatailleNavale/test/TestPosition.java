//FIXME (fixed) déplacer dans un autre paquetage
package fr.iutvalence.java.projets.BatailleNavale.test;

import fr.iutvalence.java.projets.BatailleNavale.Position;

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
		System.out.println("Position = " + p);

	}

}