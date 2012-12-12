package org.polytech.projet.jeu.unite;

import org.polytech.projet.jeu.util.Coordonnee;

/**
 * 
 * @author jean-baptisteborel
 * 
 */
public class Cavalier extends UniteCombat {
	/**
	 * On cr�e un cavalier avec les coordonn�es de d�part sur la carte.
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
		// Level
		// Armure
		// Vie
		super("Cavalier", 'c', 2, 1, c, 4.0, 1, 10.0, 100.0);
	}

	/**
	 * On modifie les valeurs de la force et de l'armure du cavalier selon un
	 * pourcentage d�fini � l'avance. D�s qu'on am�liore l'�curie ou l'unit� en
	 * elle m�me on met � jour les valeurs.
	 */
	public void updateUnit() {
		if (this.getLevel() > 1) {
			double oldArmure = this.getArmure();
			double oldForce = this.getForce();
			this.setArmure(oldArmure * 1.1);
			this.setForce(oldForce * 1.15);
		}
	}

	@Override
	public String toString() {
		return "Cavalier [symbole=" + this.getSymbole() + ", distanceUnite="
				+ this.getDistance() + ", porteeArme=" + this.getPorteeArme()
				+ ", coordonnee=" + this.getCoordonnee() + ", force="
				+ this.getForce() + ", level=" + this.getLevel() + ", armure="
				+ this.getArmure() + ", vie=" + this.getVie() + "]";
	}
}
