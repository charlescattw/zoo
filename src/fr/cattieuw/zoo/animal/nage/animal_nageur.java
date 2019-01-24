package fr.cattieuw.zoo.animal.nage;

import fr.cattieuw.zoo.animal.Animal;;

public class animal_nageur extends Animal {

	protected boolean pelagique;
	protected boolean mammifere;
	protected int nbEcaille = 5000;

	public animal_nageur(String nom, String race, int poids, int age, String couleur, boolean griffes,
			boolean pelagique, boolean mammifere, int nbEcaille) {
		super(nom, race, poids, age, couleur, griffes);
		this.pelagique = pelagique;
		this.mammifere = mammifere;
		this.nbEcaille = nbEcaille;
	}

	public animal_nageur(String nom, String race, int poids, int age, String couleur, boolean griffes) {
		super(nom, race, poids, age, couleur, griffes);
		// TODO Auto-generated constructor stub
	}

	public animal_nageur() {
		super();
		// TODO Auto-generated constructor stub
	}
}
