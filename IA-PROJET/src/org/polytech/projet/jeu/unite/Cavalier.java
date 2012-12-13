package org.polytech.projet.jeu.unite;

import org.polytech.projet.jeu.util.Coordonnee;

/**
 * 
 * @author jean-baptisteborel
 * 
 */
public class Cavalier extends UniteCombat {
	/**
	 * On crée un cavalier avec les coordonnées de départ sur la carte.
	 * 
	 * @param x
	 * @param y
	 */
	public Cavalier(Coordonnee c) {
		// Nom
		// Symbole
		// Distance
		// Portee arme
		// Coordonnee
		// Force
		// Armure
		// Vie
		super("Cavalier", 'c', 2, 1, c, 4.0, 10.0, 100.0);
	}

	/**
	 * On modifie les valeurs de la force et de l'armure du cavalier selon un
	 * pourcentage défini à l'avance. Dès qu'on améliore l'écurie les unités
	 * sont automatiquements mis à jour
	 */
	public void updateUnit() {
		int oldDistance = this.getDistance();
		this.setDistance(oldDistance + 1);
	}

	public void updateUnitForge() {
		double oldArmure = this.getArmure();
		double oldForce = this.getArme();
		this.setArmure(oldArmure * 1.1);
		this.setArme(oldForce * 1.15);
	}

	@Override
	public String toString() {
		return "Cavalier [symbole=" + this.getSymbole() + ", distanceUnite="
				+ this.getDistance() + ", porteeArme=" + this.getPorteeArme()
				+ ", coordonnee=" + this.getCoordonnee() + ", force="
				+ this.getArme() + ", armure=" + this.getArmure() + ", vie="
				+ this.getVie() + "]";
	}
}
