package org.polytech.projet.jeu.batiment;

import org.polytech.projet.jeu.Carte;
import org.polytech.projet.jeu.unite.UniteCombat;
import org.polytech.projet.jeu.util.Coordonnee;

public class Forge extends BatimentProduction {

	public Forge(Coordonnee coordonneeBatiment) {
		super("Forge", 'F', 1, coordonneeBatiment);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void updateAllUnit() {
		for (UniteCombat u : this.getListUnit())
			u.updateUnitForge();
	}

	@Override
	public void makeAction(Carte carte) {
		
	}

}
