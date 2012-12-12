package org.polytech.projet.jeu.batiment;

import java.util.ArrayList;

import org.polytech.projet.jeu.Carte;
import org.polytech.projet.jeu.unite.UniteCombat;
import org.polytech.projet.jeu.util.Coordonnee;

public abstract class BatimentProduction extends Batiment {

	private ArrayList<UniteCombat> listUnit;
	
	BatimentProduction(String name, char symbole, int levelBatiment,
			Coordonnee coordonneeBatiment) {
		super(name, symbole, levelBatiment, coordonneeBatiment);
		this.setListUnit(new ArrayList<UniteCombat>());
	}

	public abstract void updateAllUnit();
	public abstract void makeAction(Carte carte);

	public void addUnit(UniteCombat u) {
		this.listUnit.add(u);
	}
	
	public ArrayList<UniteCombat> getListUnit() {
		return listUnit;
	}

	public void setListUnit(ArrayList<UniteCombat> listUnit) {
		this.listUnit = listUnit;
	}

}