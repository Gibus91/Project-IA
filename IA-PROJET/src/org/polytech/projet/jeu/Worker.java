package org.polytech.projet.jeu;
/**
 * Classe qui permet de créer un travailleur
 * @author jean-baptisteborel
 *
 */
public class Worker extends Unite {
	
	private Ressources typeRessources;
	/**
	 * Le travailleur récolte une ressource d'un type définit
	 * @param type
	 */
	Worker(Ressources type) {
		super("Worker");
		this.setTypeRessources(type);
	}

	public Ressources getTypeRessources() {
		return typeRessources;
	}

	public void setTypeRessources(Ressources typeRessources) {
		this.typeRessources = typeRessources;
	}
}
