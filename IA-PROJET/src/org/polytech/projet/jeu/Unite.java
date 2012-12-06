package org.polytech.projet.jeu;

import java.util.ArrayList;
/**
 * 
 * @author jean-baptisteborel
 *
 */
public abstract class Unite {

	private String name;


	/**
	 * Création d'une unité du jeu
	 * 
	 * @param name
	 * @param dist
	 * @param force
	 * @param armure
	 */
	Unite(String name) {
		this.setName(name);

	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
