package fr.cattieuw.animal.animal_sauteur.animal_volant; // le package détermine le point de stockage de la classe

import fr.cattieuw.zoo.animal.animal_sauteur.animal_sauteur;

public class animal_volant extends animal_sauteur {

	protected boolean ailes;
	protected boolean rapace;
	protected int nbPlume = 5000;

	public animal_volant(String nom, String race, int poids, int age, String couleur, boolean griffes,
			boolean membre_extensible, boolean longue_extremite, int longueur_pateAR, boolean ailes, boolean rapace,
			int nbPlume) {
		super(nom, race, poids, age, couleur, griffes, membre_extensible, longue_extremite, longueur_pateAR);
		this.ailes = ailes;
		this.rapace = rapace;
		this.nbPlume = nbPlume;
	}

	/**
	 * @return the rapace
	 */
	public Boolean getRapace() {
		return rapace;
	}

	/**
	 * @param rapace the rapace to set
	 */
	public void setRapace(Boolean rapace) {
		this.rapace = rapace;
	}

	/**
	 * @return the ailes
	 */
	public Boolean getAiles() {
		return ailes;
	}

	/**
	 * @param ailes the ailes to set
	 */
	public void setAiles(Boolean ailes) {
		this.ailes = ailes;
	}
}
