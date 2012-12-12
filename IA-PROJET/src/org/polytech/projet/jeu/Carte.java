package org.polytech.projet.jeu;

import java.util.ArrayList;

import org.polytech.projet.jeu.batiment.Batiment;
import org.polytech.projet.jeu.batiment.BatimentProduction;
import org.polytech.projet.jeu.batiment.Ecurie;
import org.polytech.projet.jeu.batiment.Forge;
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

	public ArrayList<UniteCombat> getListUnit() {
		return listUnit;
	}

	public void setListUnit(ArrayList<UniteCombat> listUnit) {
		this.listUnit = listUnit;
	}

	private int width;
	private int height;

	public Carte() {
		width = 20;
		height = 20;
		carte = new String[width][height];
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
				carte[i][j] = "";
			}
		}
	}

	public Boolean caseVide(int x, int y) {
		Boolean retour = false;
		if (carte[x][y].isEmpty()) {
			retour = true;
		}
		return retour;
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

		Carte c = new Carte();
		BatimentProduction b = new Ecurie(coord);
		b.makeAction(c);

		b.makeAction(c);
		for (UniteCombat u : b.getListUnit())
			System.out.println(u);

		b.updateAllUnit();
		for (UniteCombat u : b.getListUnit())
			System.out.println(u);
		/*
		 * System.out.println("carte avant"); c.afficheCarte(); u.mouvement(3,
		 * 1); c.jouerTour(); System.out.println("carte apr�s");
		 * c.afficheCarte();
		 */

	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
}
