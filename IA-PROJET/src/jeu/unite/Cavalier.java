package jeu.unite;

import jeu.unite.impl.UniteCombatImpl;
import jeu.util.Coordonnee;
import jeu.util.impl.UtilFactoryImpl;

public class Cavalier extends UniteCombatImpl {

	public Cavalier(Coordonnee c) {
		super();
		this.setName("Cavalier");
		this.setArme(100.0);
		this.setCoordonneeUnit(c);
		this.setSymbole('C');
	}

	public static void main(String[] argv) {
		Coordonnee coord = new UtilFactoryImpl().createCoordonnee();
		coord.setX(2);
		coord.setY(3);
		UniteCombat c = new Cavalier(coord);
		System.out.println(c.getCoordonneeUnit());

	}
}
