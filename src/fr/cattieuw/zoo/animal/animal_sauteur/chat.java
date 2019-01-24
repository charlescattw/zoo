package fr.cattieuw.zoo.animal.animal_sauteur;

import fr.cattieuw.zoo.animal.Animal;

public class chat extends Animal {

	// constructeur avec paramètres
//	public chat(String nom, String race, int poids, int age, String couleur, boolean griffes,
//			boolean longue_extremite) {
//		super();
//		this.nom = nom;
//		this.race = race;
//		this.poids = poids;
//		this.age = age;
//		this.couleur = couleur;
//		this.griffes = griffes;
//	}

	public chat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void tomber() { // ici la caractéristique unique du chat est excklusive
		System.out.println("chute");// au chat et ne sera pas commune à celles
	}// contenues dans la classe Animal.

	public chat(String nom, String race, int poids, int age, String couleur, boolean griffes) {
		super(nom, race, poids, age, couleur, griffes);
		// TODO Auto-generated constructor stub
	}

	/*
	 * constructeur d'actions public void miauler() { System.out.println("meow..");
	 * }
	 * 
	 * public void courir() { System.out.println("ouafouaf!"); }
	 * 
	 * public void sauter() { System.out.println("DingDong!"); }
	 * 
	 * public void boire() { System.out.println("Robinet ouvert"); }
	 * 
	 * public void manger() { System.out.println("Paté écuelle"); }
	 * 
	 * public void jouer() { System.out.println("Balle rebondissante"); }
	 * 
	 */

	// constructeur de récupérateur de valeurs et de modificteur de valeurs.

}
