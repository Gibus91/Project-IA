package org.polytech.projet.jeu.batiment;

import org.polytech.projet.jeu.unite.Archer;
import org.polytech.projet.jeu.util.Carte;
import org.polytech.projet.jeu.util.Coordonnee;

public class Archery extends BatimentProduction {

	Archery(Coordonnee coordonneeBatiment) {
		super("Archery", 'a', 1, coordonneeBatiment);
		// TODO Auto-generated constructor stub
	}

	/**
	 * On crée un nouveau cavalier en bas de l'écurie. Il faut pour cela que la
	 * case soit vide sinon il n'est pas possible d'en crée un nouveau
	 */
	public void makeAction(Carte carte) {
		Coordonnee coordCreateUnit = new Coordonnee(this
				.getCoordonneeBatiment().getX() + 1, this
				.getCoordonneeBatiment().getY());
		if (carte.caseVide(coordCreateUnit.getX(), coordCreateUnit.getY())) {
			Archer c = new Archer(coordCreateUnit);
			this.getListUnit().add(c);
			carte.setCarte();
		} else
			System.out.println("Error");
	}

}
