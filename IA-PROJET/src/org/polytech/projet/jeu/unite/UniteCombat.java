package org.polytech.projet.jeu.unite;

import java.util.ArrayList;

import org.polytech.projet.jeu.Carte;
import org.polytech.projet.jeu.util.Coordonnee;

/**
 * 
 * @author jean-baptisteborel
 * 
 */
public abstract class UniteCombat extends Unite {

	private char symbole;
	private int distanceUnite;
	private int porteeArme;
	// Position x et y de l'unit� sur la carte
	private Coordonnee coordonnee;
	private double force;
	private double armure;
	private double vie;
	private ArrayList<Coordonnee> listCoordAccessible;

	/**
	 * 
	 * @param name
	 * @param dist
	 * @param portee
	 * @param dx
	 * @param dy
	 * @param force
	 * @param armure
	 * @param vie
	 */

	public UniteCombat(String name, char symbole, int dist, int portee,
			Coordonnee coord, double force, double armure, double vie) {
		super(name);
		this.setSymbole(symbole);
		this.setDistance(dist);
		this.setPorteeArme(portee);
		this.setCoordonnee(coord);
		this.setForce(force);
		this.setArmure(armure);
		this.setVie(vie);
		this.listCoordAccessible = new ArrayList<Coordonnee>();
	}

	public abstract void updateUnit();

	public abstract void updateUnitForge();

	public abstract String toString();

	/**
	 * Lors d'un combat, il est possible que la force de l'enemie, soit
	 * inf�rieur � l'armure il faut donc soustraire la valeur de la force de
	 * l'enemie au bouclier
	 * 
	 * @param degatArmure
	 * @return
	 */
	public double reduireArmure(double degatArmure) {
		return armure - degatArmure;
	}

	/**
	 * Fonction qui permet lors d'un combat de r�duire la vie de l'unit�.
	 * 
	 * @param degatVie
	 * @return
	 */
	public double reduireVie(double degatVie) {
		return vie - degatVie;
	}

	/**
	 * Fonction de d�placement des unit�s de combat, seul unit� qui peut se
	 * d�placer sur la carte.
	 * 
	 * @param mouvementX
	 * @param mouvementY
	 */
	public void mouvement(int mouvementX, int mouvementY) {
		int dist = this.distanceUnite;
		/**
		 * TODO: Enlever commentaires debug. Rajouter une exception si le
		 * d�placement est illicite. Prendre en compte la liste des mouvements
		 * autoriser. Simplifie grandement la fonction mouvement�
		 */
		System.out.println("Dist " + dist);
		System.out.println("deplacement axe x : "
				+ (mouvementX + this.getCoordonnee().getX()));
		if (this.distanceUnite >= (mouvementX + this.getCoordonnee().getX())
				&& (dist -= (mouvementX + this.getCoordonnee().getX())) >= 0) {
			this.getCoordonnee().setX(mouvementX + this.getCoordonnee().getX());
		} else
			System.out.println("Deplacement illicite");

		System.out.println("Dist " + dist);
		System.out.println("deplacement axe y : "
				+ (mouvementY + this.getCoordonnee().getY()));
		if (this.distanceUnite >= mouvementY + this.getCoordonnee().getY()
				&& (dist -= (mouvementY + this.getCoordonnee().getY())) >= 0) {
			this.getCoordonnee().setX(mouvementY + this.getCoordonnee().getY());
		} else
			System.out.println("Deplacement illicite");
		System.out.println("Dist " + dist);
	}

	/**
	 * Fonction qui permet de lancer le calcul des positions accessible pour
	 * chaque unit�
	 * 
	 * @param c
	 */
	public void listPosDisponible(Carte c) {

		int posX = this.coordonnee.getX();
		int posY = this.coordonnee.getY();
		int distance = this.distanceUnite;
		getCoord(c, distance, posX, posY);
	}

	/**
	 * Fonction r�curcive qui calcul les positions accessible au nord, au sud, �
	 * l'est et � l'ouest
	 * 
	 * @param c
	 *            une carte dans laquelle �volue l'unit�
	 * @param distance
	 *            la distance maximum que peut parcourir l'unit�
	 * @param posX
	 *            la position X de l'unit�
	 * @param posY
	 *            la position Y de l'unit�
	 */
	public void getCoord(Carte c, int distance, int posX, int posY) {

		while (distance > 0) {
			distance = distance - 1;
			// Case droite
			if (posY + 1 < c.getWidth()) {
				if (c.caseVide(posX, posY + 1)) {
					Coordonnee coordTemp = new Coordonnee(posX, posY + 1);
					if (!this.listCoordAccessible.contains(coordTemp)) {
						this.listCoordAccessible.add(coordTemp);
						getCoord(c, distance, coordTemp.getX(),
								coordTemp.getY());
					}
				}
			}
			// Case gauche
			if (posY - 1 >= 0) {
				if (c.caseVide(posX, posY - 1)) {
					Coordonnee coordTemp = new Coordonnee(posX, posY - 1);
					if (!this.listCoordAccessible.contains(coordTemp)) {
						this.listCoordAccessible.add(coordTemp);
						getCoord(c, distance, coordTemp.getX(),
								coordTemp.getY());
					}
				}
			}
			// Case bas
			if (posX + 1 < c.getHeight()) {
				if (c.caseVide(posX + 1, posY)) {
					Coordonnee coordTemp = new Coordonnee(posX + 1, posY);
					if (!this.listCoordAccessible.contains(coordTemp)) {
						this.listCoordAccessible.add(coordTemp);
						getCoord(c, distance, coordTemp.getX(),
								coordTemp.getY());
					}
				}
			}
			// Case haut
			if (posX - 1 >= 0) {
				if (c.caseVide(posX - 1, posY)) {
					Coordonnee coordTemp = new Coordonnee(posX - 1, posY);
					if (!this.listCoordAccessible.contains(coordTemp)) {
						this.listCoordAccessible.add(coordTemp);
						getCoord(c, distance, coordTemp.getX(),
								coordTemp.getY());
					}
				}
			}
		}
	}

	// Accesseur
	public int getDistance() {
		return distanceUnite;
	}

	public void setDistance(int distance) {
		this.distanceUnite = distance;
	}

	public double getForce() {
		return force;
	}

	public void setForce(double force) {
		this.force = force;
	}

	public double getArmure() {
		return armure;
	}

	public void setArmure(double armure) {
		this.armure = armure;
	}

	public int getPorteeArme() {
		return porteeArme;
	}

	public void setPorteeArme(int porteeArme) {
		this.porteeArme = porteeArme;
	}

	public Coordonnee getCoordonnee() {
		return coordonnee;
	}

	public void setCoordonnee(Coordonnee coordonnee) {
		this.coordonnee = coordonnee;
	}

	public char getSymbole() {
		return symbole;
	}

	public void setSymbole(char symbole) {
		this.symbole = symbole;
	}

	public ArrayList<Coordonnee> getListCoordAcceccible() {
		return listCoordAccessible;
	}

	public void setListCoordAcceccible(ArrayList<Coordonnee> listCoordAcceccible) {
		this.listCoordAccessible = listCoordAcceccible;
	}

	public double getVie() {
		return vie;
	}

	public void setVie(double vie) {
		this.vie = vie;
	}

}
