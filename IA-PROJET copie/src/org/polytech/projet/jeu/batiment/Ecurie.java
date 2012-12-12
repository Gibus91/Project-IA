package org.polytech.projet.jeu.batiment;

import org.polytech.projet.jeu.unite.Cavalier;
import org.polytech.projet.jeu.unite.UniteCombat;
import org.polytech.projet.jeu.util.Carte;
import org.polytech.projet.jeu.util.Coordonnee;

public class Ecurie extends BatimentProduction {

	public Ecurie(Coordonnee c) {
		super("Ecurie", 'E', 1, c);

		// TODO Auto-generated constructor stub
	}

	public void updateAllUnit() {
		for (UniteCombat c : this.getListUnit()) {
			c.updateUnit();
		}
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
			Cavalier c = new Cavalier(coordCreateUnit);
			this.getListUnit().add(c);
			carte.getListUnit().add(c);
			carte.setUniteCarte();
		} else
			System.out.println("Error");
	}
}
