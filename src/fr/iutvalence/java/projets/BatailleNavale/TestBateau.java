//FIXME déplacer dans un autre paquetage
package fr.iutvalence.java.projets.BatailleNavale;
/**
 * 
 * @author chizate & Salgues
 * classe de test de la classe Bateau
 *
 */
public class TestBateau {
	
	/**
	 * @param args
	 */
	public static void main (String [] args)
	{
		Position pos;
		double abscisse = Math.floor(Math.random()*9);
		double ordonnee = Math.floor(Math.random()*9);
		double direction = Math.floor(Math.random()*2);
		boolean d;
		if (direction == 0)
		{
			d = false;
		}
		else
		{
			d = true;
		}
			
		int u = (int)abscisse;
		int v = (int)ordonnee;
	    pos = new Position(u,v);
		System.out.println(new Bateau(6, d, pos));
	}
}
