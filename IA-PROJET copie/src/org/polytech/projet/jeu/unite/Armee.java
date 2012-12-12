package org.polytech.projet.jeu.unite;

import java.util.ArrayList;

public class Armee {

	private ArrayList<UniteCombat> listOfUnit;
	
	public Armee(){
		setListOfUnit(new ArrayList<UniteCombat>());
	}

	public ArrayList<UniteCombat> getListOfUnit() {
		return listOfUnit;
	}

	public void setListOfUnit(ArrayList<UniteCombat> listOfUnit) {
		this.listOfUnit = listOfUnit;
	}
	
}
