package org.polytech.projet.jeu;

import java.util.ArrayList;

import org.polytech.projet.jeu.unite.Cavalier;
import org.polytech.projet.jeu.unite.UniteCombat;
import org.polytech.projet.jeu.util.Coordonnee;

/**
 * 
 * @author jean-baptisteborel
 * 
 */
public class Carte {

	private String[][] carte;
	private ArrayList<UniteCombat> listUnit;

	public Carte() {
		carte = new String[20][20];
		initCarte();
		listUnit = new ArrayList<UniteCombat>();
	}

	public void afficheCarte() {
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {
				System.out.print(carte[i][j]);
				System.out.print("|");
			}
			System.out.println("\n__________________________________________");
		}
	}

	public void initCarte() {
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {
				carte[i][j] = " ";
			}
		}
	}

	public void jouerTour() {
		initCarte();
		setUniteCarte();
	}

	public void setUniteCarte() {
		for (UniteCombat u : listUnit)
			carte[u.getCoordonnee().getX()][u.getCoordonnee().getY()] = u
					.getName();
	}

	public static void main(String[] argv) {
		Coordonnee coord = new Coordonnee(0, 0);
		Coordonnee coord1 = new Coordonnee(3, 0);
		UniteCombat u = new Cavalier(coord);
		UniteCombat u1 = new Cavalier(coord1);

		Carte c = new Carte();
		c.listUnit.add(u);
		c.listUnit.add(u1);
		c.setUniteCarte();
		System.out.println("carte avant");
		c.afficheCarte();
		u.mouvement(3, 1);
		c.jouerTour();
		System.out.println("carte aprs");
		c.afficheCarte();

	}
}
