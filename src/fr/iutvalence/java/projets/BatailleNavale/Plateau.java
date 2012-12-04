package fr.iutvalence.java.projets.BatailleNavale;

/**
 * Classe Plateau
 * gère les créations et les positions des bateaux, les positions des tirs et 
 * l'état des cases ( "rien fait", "touché pas coulé", "touché coulé" et "pas touché"
 * @author Chizat & Salgues
 */
import java.util.*;

public class Plateau {

	/**
	 * le plateau est une grille de 10 cases sur 10
	 * 
	 */
	private final static int TAILLE = 10;

	// ********** ATTRIBUTS ***************
	/**
	 * tableau a deux dimensions qui représente le plateau de jeu
	 */

	private Etat[][] grille;
	/**
	 * Tableau de bateaux
	 */

	private Bateau[] bateaux;

	/**
	 * Nombre de bateaux
	 */
	private int nbBat; // = 5;

	// ******* Constructeur ************************
	/**
	 * Constructeur plateau initial: toutes les cases à '0' crée les bateaux
	 * 
	 * @throws HorsPlateauException
	 */
	public Plateau() {
		// crée un plateau de 10 cases sur 10
		this.grille = new Etat[Plateau.TAILLE][Plateau.TAILLE];

		// met toutes les cases du plateau à  '0' : état "rien fait"
		for (int x = 0; x < TAILLE; x++) {
			for (int y = 0; y < TAILLE; y++)
				this.grille[x][y] = Etat.RIEN;
		}

		// crée le tableau de bateaux
		nbBat = 5;
		this.bateaux = new Bateau[nbBat];

		// generateur nombre aléatoire
		Random gna = new Random();

		// Placer tous les bateaux
		for (int i = 0; i < nbBat; i++) {
			while (true) {
				int capa = i + 2;
				int a = gna.nextInt(TAILLE); // a = abscisse
				int o = gna.nextInt(TAILLE); // o = ordonnee
				boolean dirHorizontal = gna.nextBoolean();
				Position pos = new Position(a, o);
				if (!placeDispo(pos))
					continue;

				// La tete du bateau est disponible
				if (dirHorizontal) {
					// on regarde si le bateau à la place ou 
					// si il va en chevaucher un autre

					boolean chevauchement = false;

					for (int b = 1; b < capa; b++) {
						if (!placeDispo(new Position(a + b, o))) {
							chevauchement = true;
							break;
						}
					}
					if (chevauchement)
						continue;

				}

				else {
					boolean chevauchement = false;

					for (int b = 1; b < capa; b++) {
						if (!placeDispo(new Position(a, o+b))) {
							chevauchement = true;
							break;
						}
					}
					if (chevauchement)
						continue;

				}

				this.bateaux[i] = new Bateau(capa, dirHorizontal, pos);
				this.grille[a][o] = Etat.PAS_TOUCHE; // positionne la tete du
														// bateau
				if (dirHorizontal)// horizontale
				{
					for (int m = 1; m < capa; m++) // contruit le reste du
													// bateau
					{
						this.grille[a + m][o] = Etat.PAS_TOUCHE;
					}

				} else // verticale
				{
					for (int m = 1; m < capa; m++) // construit le reste du
													// bateau
					{
						this.grille[a][o + m] = Etat.PAS_TOUCHE;
					}
				}
				break;
			}
		}

	}

	// *********** METHODES ************************
	/**
	 * @param pos
	 *            : une position
	 * @return res: la valeur de la case pos
	 * @throws HorsPlateauException
	 */
	public Etat getEtatCase(Position pos) throws HorsPlateauException {
		int abs = pos.getX();
		int ord = pos.getY();

		if (abs < 0 || abs >= TAILLE || ord < 0 || ord >= TAILLE) {
			throw new HorsPlateauException();
		}

		return this.grille[abs][ord];

	}

	/**
	 * @param pos
	 *            : une position
	 * @return un booléen: true = libre, false = non libre
	 * @throws HorsPlateauException
	 */
	public boolean placeDispo(Position pos) 
	{
		try {
			return (this.getEtatCase(pos) == Etat.RIEN);
		} catch (HorsPlateauException e) {
			return false;
		}
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		String res = "";
		res = "    1   2   3   4   5   6   7   8   9   10 \n";
		res = res + "  ----------------------------------------- \n";
		char lettre;
		lettre = (int) 'A';
		int x;
		int y;
		for (y = 0; y < Plateau.TAILLE; y++) {
			res = res + ((char) (lettre + y));
			for (x = 0; x < Plateau.TAILLE; x++) {
				if (this.grille[x][y] == Etat.RIEN) {
					res = res + " |  ";
				} else
					res = res + " | " + "X";
			}
			res = res + " | \n";
			res = res + "  ----------------------------------------- \n";

		}
		res = res + "\n\nBateau n°1: " + this.bateaux[0] + "\n\n";
		res = res + "Bateau n°2: " + this.bateaux[1] + "\n\n";
		res = res + "Bateau n°3: " + this.bateaux[2] + "\n\n";
		res = res + "Bateau n°4: " + this.bateaux[3] + "\n\n";
		res = res + "Bateau n°5: " + this.bateaux[4] + "\n\n";
		res = res + "\n\n";
		return res;
	}

}