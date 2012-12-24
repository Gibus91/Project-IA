package org.polytech.projet.jeu.unite;

import java.util.ArrayList;

import org.polytech.projet.jeu.exception.SizeArmyException;
import org.polytech.projet.jeu.util.Coordonnee;

public class Armee {

	private ArrayList<UniteCombat> listOfUnit;
	private ArrayList<Coordonnee> listCoordAccessible;
	private Coordonnee coordArmy;
	static private int tailleArmee = 1;

	public Armee(Coordonnee coord) {
		this.setListOfUnit(new ArrayList<UniteCombat>());
		this.setListCoordAccessible(new ArrayList<Coordonnee>());
		this.setCoordArmy(coord);
	}

	public ArrayList<UniteCombat> getListOfUnit() {
		return listOfUnit;
	}

	public void setListOfUnit(ArrayList<UniteCombat> listOfUnit) {
		this.listOfUnit = listOfUnit;
	}

	public void ajouterSoldat(UniteCombat u) throws SizeArmyException {
		if (this.listOfUnit.size() < this.tailleArmee)
			this.listOfUnit.add(u);
		else throw new SizeArmyException();
	}

	public Coordonnee getCoordArmy() {
		return coordArmy;
	}

	public void setCoordArmy(Coordonnee coordArmy) {
		this.coordArmy = coordArmy;
	}

	public ArrayList<Coordonnee> getListCoordAccessible() {
		return listCoordAccessible;
	}

	public void setListCoordAccessible(ArrayList<Coordonnee> listCoordAccessible) {
		this.listCoordAccessible = listCoordAccessible;
	}
	
	

}
