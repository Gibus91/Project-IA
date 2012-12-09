package org.polytech.projet.jeu.unite;

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
