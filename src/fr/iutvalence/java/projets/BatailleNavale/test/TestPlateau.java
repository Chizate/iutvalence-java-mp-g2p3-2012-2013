
package fr.iutvalence.java.projets.BatailleNavale.test;

import fr.iutvalence.java.projets.BatailleNavale.Plateau;
import fr.iutvalence.java.projets.BatailleNavale.Position;

/**
 * 
 * @author chizate & Salgues
 * classe de test de la classe Bateau
 *
 */
public class TestPlateau {
	
	public static void main (String [] args)
	{
		Plateau p = new Plateau();
		System.out.println(p);
		
		Position testPos = new Position(1,3);
		p.getEtatCase(testPos);

	}
}
