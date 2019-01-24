package fr.cattieuw.zoo;

import fr.cattieuw.zoo.animal.Chien;
import fr.cattieuw.zoo.animal.animal_sauteur.chat;

public class Main {

	public static void main(String[] args) {
		Chien rex = new Chien("Rex", "Berger", 15, 12, "Jaune", true);

		System.out.println(rex.getRace());

		chat tom = new chat("Tom", "Birman", 8, 6, "Rouge", true);

		System.out.println(tom.getPoids());

	}

}