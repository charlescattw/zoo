package fr.cattieuw.zoo.animal.animal_sauteur;

import fr.cattieuw.zoo.animal.Animal;

public class Lapin extends Animal {

	public Lapin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Lapin(String nom, String race, int poids, int age, String couleur, boolean griffes) {
		super(nom, race, poids, age, couleur, griffes);
		// TODO Auto-generated constructor stub
	}

	/*
	 * public Lapin(String nom, String race, int poids, int age, String couleur,
	 * boolean griffes) { super(); this.nom = nom; this.race = race; this.poids =
	 * poids; this.age = age; this.couleur = couleur; this.griffes = griffes; }
	 */

	public void carotène() {
		System.out.println("adore les Carottes, les Pissenlits...");
	}

}