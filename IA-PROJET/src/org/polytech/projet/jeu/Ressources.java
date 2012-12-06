package org.polytech.projet.jeu;

public abstract class Ressources {

	private String types;
	private int capaciter;
	public Ressources (String types, int capaciter){
		this.types = types;
		this.capaciter = capaciter;
	}
	public String getTypes() {
		return types;
	}
	public void setTypes(String types) {
		this.types = types;
	}
	public int getCapaciter() {
		return capaciter;
	}
	public void setCapaciter(int capaciter) {
		this.capaciter = capaciter;
	}
	
	
}
