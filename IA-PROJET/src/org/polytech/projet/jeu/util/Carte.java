package org.polytech.projet.jeu.util;

import java.util.ArrayList;

import org.polytech.projet.jeu.batiment.Batiment;
import org.polytech.projet.jeu.batiment.BatimentProduction;
import org.polytech.projet.jeu.batiment.Ecurie;
import org.polytech.projet.jeu.exception.SizeArmyException;
import org.polytech.projet.jeu.unite.Armee;
import org.polytech.projet.jeu.unite.UniteCombat;

/**
 * 
 * @author jean-baptisteborel
 * 
 */
public class Carte {

	private String[][] carte;
	private ArrayList<Batiment> listBatiment;

	public ArrayList<Batiment> getListBatiment() {
		return listBatiment;
	}

	public void setListBatiment(ArrayList<Batiment> listBatiment) {
		this.listBatiment = listBatiment;
	}
	
	public void addBatiment(Batiment b){
		this.listBatiment.add(b);
	}

	private int width;
	private int height;

	public Carte() {
		width = 20;
		height = 20;
		carte = new String[width][height];
		initCarte();
		listBatiment = new ArrayList<Batiment>();
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
		setCarte();
	}

	public void setCarte() {
		for (Batiment b : listBatiment) {
			carte[b.getCoordonneeBatiment().getX()][b.getCoordonneeBatiment().getY()] = Character.toString(b.getSymbole());
			for (UniteCombat u : b.getListUnit()) {
				carte[u.getCoordonnee().getX()][u.getCoordonnee().getY()] = Character
						.toString(u.getSymbole());
			}
		}
	}

	public static void main(String[] argv) {
		Coordonnee coord = new Coordonnee(0, 0);

		Carte c = new Carte();
		Armee a = new Armee(new Coordonnee(0,1));
		
		BatimentProduction b = new Ecurie(coord);
		c.addBatiment(b);
		b.makeAction(c);

		b.makeAction(c);
		for(Batiment lb : c.getListBatiment()){
			for(UniteCombat u : lb.getListUnit()){
				System.out.println(u);
				// u.listPosDisponible(c);
				u.afficheListPosDispo();
				try {
					a.ajouterSoldat(u);
				} catch (SizeArmyException e) {
					// TODO Auto-generated catch block
				}
			}
		}
		/*for (Batiment u : b.getListUnit()) {
			System.out.println(u);
			// u.listPosDisponible(c);
			u.afficheListPosDispo();
			try {
				a.ajouterSoldat(u);
			} catch (SizeArmyException e) {
				// TODO Auto-generated catch block
			}
		}

		
		 * b.updateAllUnit(); for (UniteCombat u : b.getListUnit())
		 * System.out.println(u); c.afficheCarte();
		 */
		/*
		 * System.out.println("carte avant"); c.afficheCarte(); u.mouvement(3,
		 * 1); c.jouerTour(); System.out.println("carte aprs");
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
