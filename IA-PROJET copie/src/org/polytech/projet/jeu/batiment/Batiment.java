package org.polytech.projet.jeu.batiment;

import org.polytech.projet.jeu.util.Coordonnee;

/**
 * 
 * @author jean-baptisteborel
 * 
 */
public abstract class Batiment {
	private String name;
	private char symbole;
	private int levelBatiment;
	private Coordonnee coordonneeBatiment;

	Batiment(String name, char symbole, int levelBatiment,
			Coordonnee coordonneeBatiment) {
		this.setName(name);
		this.setSymbole(symbole);
		this.setLevelBatiment(levelBatiment);
		this.setCoordonneeBatiment(coordonneeBatiment);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSymbole() {
		return symbole;
	}

	public void setSymbole(char symbole) {
		this.symbole = symbole;
	}

	public int getLevelBatiment() {
		return levelBatiment;
	}

	public void setLevelBatiment(int levelBatiment) {
		this.levelBatiment = levelBatiment;
	}

	public Coordonnee getCoordonneeBatiment() {
		return coordonneeBatiment;
	}

	public void setCoordonneeBatiment(Coordonnee coordonneeBatiment) {
		this.coordonneeBatiment = coordonneeBatiment;
	}

}
