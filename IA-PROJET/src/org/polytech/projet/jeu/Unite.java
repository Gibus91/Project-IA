package org.polytech.projet.jeu;

import java.util.ArrayList;

public abstract class Unite {

	private String name;
	private int distance;
	private double force;
	private double armure;
	private double vie;
	private ArrayList<Unite> listeUnite;

	/**
	 * Création d'une unité du jeu
	 * 
	 * @param name
	 * @param dist
	 * @param force
	 * @param armure
	 */
	Unite(String name, int dist, double force, double armure, double vie) {
		this.setName(name);
		this.distance = dist;
		this.force = force;
		this.armure = armure;
		this.vie = vie;
		listeUnite = new ArrayList<Unite>();
	}
	/**
	 * Lors d'un combat, il est possible que la force de l'enemie, soit inférieur à l'armure
	 * il faut donc soustraire la valeur de la force de l'enemie au bouclier
	 * @param degatArmure
	 * @return
	 */
	double reduireArmure(double degatArmure) {
		return armure - degatArmure;
	}
	/**
	 * Lors d'un combat, les unités perdent de la vie...
	 * @param degatVie
	 * @return
	 */
	double reduireVie(double degatVie) {
		return vie - degatVie;
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

	public ArrayList<Unite> getListeUnite() {
		return listeUnite;
	}

	public void setListeUnite(ArrayList<Unite> listeUnite) {
		this.listeUnite = listeUnite;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
