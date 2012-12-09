package org.polytech.projet.jeu.unite;

import java.util.ArrayList;

import org.polytech.projet.jeu.util.Coordonnee;

/**
 * 
 * @author jean-baptisteborel
 * 
 */
public class UniteCombat extends Unite {

	private int distance;
	private int porteeArme;
	// Position x et y de l'unitŽ sur la carte
	private Coordonnee coordonnee;
	private double force;
	private double armure;
	private double vie;

	/**
	 * 
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
	public UniteCombat(String name, int dist, int portee, Coordonnee coord,
			double force, double armure, double vie) {
		super(name);
		this.distance = dist;
		this.setPorteeArme(portee);
		this.setCoordonnee(coord);
		this.force = force;
		this.armure = armure;
		this.vie = vie;
	}

	/**
	 * Lors d'un combat, il est possible que la force de l'enemie, soit
	 * infŽrieur ˆ l'armure il faut donc soustraire la valeur de la force de
	 * l'enemie au bouclier
	 * 
	 * @param degatArmure
	 * @return
	 */
	public double reduireArmure(double degatArmure) {
		return armure - degatArmure;
	}

	/**
	 * Fonction qui permet lors d'un combat de rŽduire la vie de l'unitŽ.
	 * 
	 * @param degatVie
	 * @return
	 */
	public double reduireVie(double degatVie) {
		return vie - degatVie;
	}

	/**
	 * Fonction de dŽplacement des unitŽs de combat, seul unitŽ qui peut se
	 * dŽplacer sur la carte.
	 * 
	 * @param mouvementX
	 * @param mouvementY
	 */
	public void mouvement(int mouvementX, int mouvementY) {
		int dist = this.distance;
		/**
		 * TODO: Enlever commentaires debug. Rajouter une exception si le
		 * dŽplacement est illicite.
		 */
		System.out.println("Dist " + dist);
		System.out.println("deplacement axe x : "
				+ (mouvementX + this.getCoordonnee().getX()));
		if (this.distance >= (mouvementX + this.getCoordonnee().getX())
				&& (dist -= (mouvementX + this.getCoordonnee().getX())) >= 0) {
			this.getCoordonnee().setX(mouvementX + this.getCoordonnee().getX());
		} else
			System.out.println("Deplacement illicite");

		System.out.println("Dist " + dist);
		System.out.println("deplacement axe y : "
				+ (mouvementY + this.getCoordonnee().getY()));
		if (this.distance >= mouvementY + this.getCoordonnee().getY()
				&& (dist -= (mouvementY + this.getCoordonnee().getY())) >= 0) {
			this.getCoordonnee().setX(mouvementY + this.getCoordonnee().getY());
		} else
			System.out.println("Deplacement illicite");
		System.out.println("Dist " + dist);
	}

	public ArrayList<Coordonnee> listPosDisponible() {
		ArrayList<Coordonnee> listPos = new ArrayList<Coordonnee>();
		return null;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
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

}
