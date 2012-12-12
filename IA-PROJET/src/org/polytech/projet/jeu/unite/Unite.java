package org.polytech.projet.jeu.unite;

/**
 * Classe abstraite d'unit�
 * @author jean-baptisteborel
 * 
 */
public abstract class Unite {

	private String name;

	/**
	 * Cr�ation d'une unit� du jeu
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
