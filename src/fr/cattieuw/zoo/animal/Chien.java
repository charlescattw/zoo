package fr.cattieuw.zoo.animal;

public class Chien extends Animal { // �tend les d�clarations clon�es communes � la classe Animal.

	public Chien(String nom, String race, int poids, int age, String couleur, boolean griffes) {
		super(nom, race, poids, age, couleur, griffes);
	}

	public Chien() {
		super();
		// TODO Auto-generated constructor stub
	}

}