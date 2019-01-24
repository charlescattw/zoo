package fr.cattieuw.zoo.animal;

public class elephant extends Animal {

	public elephant(String nom, String race, int poids, int age, String couleur, boolean griffes) {
		super(nom, race, poids, age, couleur, griffes);
	}

	public void charge() {
		System.out.println("panpan");
	}

	public elephant() {
		super();
		// TODO Auto-generated constructor stub
	}
}