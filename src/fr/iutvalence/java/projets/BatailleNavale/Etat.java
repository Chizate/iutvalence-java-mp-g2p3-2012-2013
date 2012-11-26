package fr.iutvalence.java.projets.BatailleNavale;

public enum Etat 
{
	/**
	 * pas de bateau, case de la grille vide
	 */
	RIEN, 
	/**
	 * case de la grille où il y a un bateau qui n'est pas touché
	 */
	PAS_TOUCHE, 
	/**
	 * case de la grille où il y a un bateau qui est touché
	 */
	TOUCHE, 
	/**
	 * case de la grille où il y a un bateau qui est coulé
	 */
	COULE;

}
