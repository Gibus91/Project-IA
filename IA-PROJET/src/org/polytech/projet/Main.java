package org.polytech.projet;

import org.polytech.projet.ia.model.carte.Carte;
import org.polytech.projet.ia.model.carte.CarteFactory;
import org.polytech.projet.ia.model.unite.Unite;
import org.polytech.projet.ia.model.unite.UniteFactory;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Unite u1 = UniteFactory.eINSTANCE.createUniteCombat();
		Carte c = CarteFactory.eINSTANCE.createCarte();


		c.generateMap();
	}

}
