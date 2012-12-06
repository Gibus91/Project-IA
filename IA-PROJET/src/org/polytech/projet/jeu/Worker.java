package org.polytech.projet.jeu;
/**
 * Classe qui permet de cr�er un travailleur
 * @author jean-baptisteborel
 *
 */
public class Worker extends Unite {
	
	private Ressources typeRessources;
	/**
	 * Le travailleur r�colte une ressource d'un type d�finit
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
