package org.polytech.projet.jeu.ressource;

/**
 * 
 * @author jean-baptisteborel
 * 
 */
public abstract class Ressources {

	private String types;
	private int quantite;

	public Ressources(String types, int quantite) {
		this.types = types;
		this.quantite = quantite;
	}

	public String getTypes() {
		return types;
	}

	public void setTypes(String types) {
		this.types = types;
	}

	public int getCapaciter() {
		return quantite;
	}

	public void setCapaciter(int capaciter) {
		this.quantite = capaciter;
	}

}
