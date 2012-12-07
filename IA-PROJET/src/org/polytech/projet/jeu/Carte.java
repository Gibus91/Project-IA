package org.polytech.projet.jeu;

import java.util.ArrayList;

public class Carte {

	private String[][] carte;
	private ArrayList<UniteCombat> listUnit;

	public Carte() {
		carte = new String[20][20];
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {
				carte[i][j] = " ";
			}
		}
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

	public void setUniteCarte() {
		for (UniteCombat u : listUnit)
			carte[u.getPositionX()][u.getPositionY()] = u.getName();
	}

	void mouvement(UniteCombat u, int mouvementX, int mouvementY) {
		u.setPositionX(mouvementX + u.getPositionX());
		u.setPositionY(mouvementY + u.getPositionY());
	}

	public static void main(String[] argv) {
		UniteCombat u = new Cavalier(1,0,0);
		UniteCombat u1 = new Cavalier(2,3,0);

		Carte c = new Carte();
		c.listUnit.add(u);
		c.listUnit.add(u1);
		System.out.println("carte 1");
		c.afficheCarte();
		c.setUniteCarte();
		System.out.println("carte 2");
		c.afficheCarte();
		c.mouvement(u, 1, 0);
		System.out.println(u.getPositionX());
		c.setUniteCarte();
		System.out.println("carte 3");
		c.afficheCarte();

	}
}
