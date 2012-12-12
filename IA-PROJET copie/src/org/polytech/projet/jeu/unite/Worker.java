package org.polytech.projet.jeu.unite;

import org.polytech.projet.jeu.ressource.Ressources;

/**
 * Classe qui permet de cr�er un travailleur
 * 
 * @author jean-baptisteborel
 * 
 */
public class Worker extends Unite {

	private Ressources typeRessources;

	/**
	 * Le travailleur r�colte une ressource d'un type d�finit pour le moment une
	 * seule ressource, mais a terme, il peut y avoir plusieur ressources.
	 * 
	 * @param type
	 */
	public Worker(Ressources type) {
		super("Worker");
		this.setTypeRessources(type);
	}

	/**
	 * Permet de connaitre la ressource exploit� par le workeur
	 * 
	 * @return
	 */
	public Ressources getTypeRessources() {
		return typeRessources;
	}

	/**
	 * Permet de modifier le type de ressource que le worker va exploiter. Il
	 * est possible de modifier l'assignation de chaque workeur au cours de la
	 * dur�e d'une partie.
	 * 
	 * @param typeRessources
	 */
	public void setTypeRessources(Ressources typeRessources) {
		this.typeRessources = typeRessources;
	}
}
