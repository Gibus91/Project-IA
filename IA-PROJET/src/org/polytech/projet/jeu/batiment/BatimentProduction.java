package org.polytech.projet.jeu.batiment;

import org.polytech.projet.jeu.unite.UniteCombat;
import org.polytech.projet.jeu.util.Carte;
import org.polytech.projet.jeu.util.Coordonnee;

public abstract class BatimentProduction extends Batiment {

	BatimentProduction(String name, char symbole, int levelBatiment,
			Coordonnee coordonneeBatiment) {
		super(name, symbole, levelBatiment, coordonneeBatiment);

	}

	public void updateForce() {
		for (UniteCombat u : this.getListUnit()) {
			u.updateUnitForce();
		}
	}

	public void updateDefence() {
		for (UniteCombat u : this.getListUnit()) {
			u.updateUnitDefence();
		}
	}

	public void updateUnit() {
		for (UniteCombat u : this.getListUnit()) {
			u.updateUnit();
		}
	}

	/**
	 * TODO faire une visitor pour rendre la fonction générique
	 */
	public abstract void makeAction(Carte carte);

	public void addUnit(UniteCombat u) {
		this.getListUnit().add(u);
	}
}