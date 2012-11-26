
package fr.iutvalence.java.projets.BatailleNavale.test;

import fr.iutvalence.java.projets.BatailleNavale.HorsPlateauException;
import fr.iutvalence.java.projets.BatailleNavale.Plateau;
import fr.iutvalence.java.projets.BatailleNavale.Position;

/**
 * 
 * @author chizate & Salgues
 * classe de test de la classe Bateau
 *
 */
public class TestPlateau {
	
	public static void main (String [] args) throws HorsPlateauException
	{
		Plateau p = new Plateau();
		System.out.println(p);
		
		Position testPos = new Position(1,3);
		try {
			p.getEtatCase(testPos);
		}
		catch (HorsPlateauException e){}


	}
}
