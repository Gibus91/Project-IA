package org.polytech.projet.jeu.unite;

/**
 * Classe abstraite d'unité
 * @author jean-baptisteborel
 * 
 */
public abstract class Unite {

	private String name;

	/**
	 * Création d'une unité du jeu
	 * 
	 * @param name
	 */
	public Unite(String name) {
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
