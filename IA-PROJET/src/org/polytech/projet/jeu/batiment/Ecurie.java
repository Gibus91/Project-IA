package org.polytech.projet.jeu.batiment;

import java.util.ArrayList;

import org.polytech.projet.jeu.unite.Cavalier;
import org.polytech.projet.jeu.util.Coordonnee;

public class Ecurie extends Batiment{

	private ArrayList<Cavalier> listCavalier;
	
	public Ecurie(Coordonnee c) {
		super("Ecurie",'E',1,c);
		this.listCavalier = new ArrayList<Cavalier>();
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Cavalier> getListCavalier() {
		return listCavalier;
	}

	public void setListCavalier(ArrayList<Cavalier> listCavalier) {
		this.listCavalier = listCavalier;
	}

	public void updateAllCavalier(){
		for(Cavalier c :listCavalier){
			c.updateUnit();
		}
	}
	
	
	
}
