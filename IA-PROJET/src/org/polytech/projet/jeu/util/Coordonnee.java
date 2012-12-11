package org.polytech.projet.jeu.util;

/**
 * 
 * @author jean-baptisteborel
 * 
 */
public class Coordonnee {

	private int x;
	private int y;

	public Coordonnee(int x, int y) {
		this.x = x;
		this.y = y;
	}

	
	@Override
	public String toString() {
		return "Coordonnee [x=" + x + ", y=" + y + "]";
	}


	public int getX() {
		return this.x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return this.y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
