package org.polytech.projet.jeu.unite;

import org.polytech.projet.jeu.util.Coordonnee;

/**
 * 
 * @author jean-baptisteborel
 * 
 */
public class Cavalier extends UniteCombat {
	/**
	 * On crée un cavalier avec les coordonnées de départ sur la carte.
	 * 
	 * @param x
	 * @param y
	 */
	public Cavalier(Coordonnee c) {
		super("C", 2, 1, c, 4.0, 10.0, 100.0);
		// TODO Auto-generated constructor stub
	}
}
