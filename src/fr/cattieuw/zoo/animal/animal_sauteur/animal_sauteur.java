package fr.cattieuw.zoo.animal.animal_sauteur;

import fr.cattieuw.zoo.animal.Animal;

public class animal_sauteur extends Animal {
// récupèrere tout ce qui est public et protected.

	protected boolean membre_extensible;
	protected boolean longue_extremite;
	protected int longueur_pateAR = 30;

	public animal_sauteur(String nom, String race, int poids, int age, String couleur, boolean griffes,
			boolean membre_extensible, boolean longue_extremite, int longueur_pateAR) {
		super(nom, race, poids, age, couleur, griffes);
		this.membre_extensible = membre_extensible;
		this.longue_extremite = longue_extremite;
		this.longueur_pateAR = longueur_pateAR;
	}

	public void membre_extensible() {
		System.out.println("ettirement long");
	}

	public void longue_extremite() {
		System.out.println(longue_extremite);
	}

	public animal_sauteur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public animal_sauteur(String nom, String race, int poids, int age, String couleur, boolean griffes) {
		super(nom, race, poids, age, couleur, griffes);
		// TODO Auto-generated constructor stub
	}

	public void longueur_pateAR() {
		System.out.println("longueur plus importante");
	}

	/**
	 * @return the Membre_extensible
	 */
	public Boolean getMembre_extensible() {
		return membre_extensible;
	}

	/**
	 * @param Membre_extensible the Membre_extensible to set
	 */
	public void setMembre_extensible(Boolean membre_extensible) {
		this.membre_extensible = membre_extensible;
	}

	/**
	 * @return the Longue_extremite
	 */
	public Boolean getLongue_extremite() {
		return longue_extremite;
	}

	/**
	 * @param Longue_extremite the Longue_extremite to set
	 */
	public void setLongue_extremite(Boolean longue_extremite) {
		this.longue_extremite = longue_extremite;
	}

	/**
	 * @return the race
	 */
	public Boolean getLongueur_pateAR() {
		return longue_extremite;
	}

	/**
	 * @param race the race to set
	 */
	public void setLongueur_pateAR(int longueur_pateAR) {
		this.longueur_pateAR = longueur_pateAR;
	}
}
