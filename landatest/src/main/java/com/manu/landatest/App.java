package com.manu.landatest;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App {

private static List<LandaTest> users;

private static void setUpUser() {
	users.add(new LandaTest(1, "Fran"));
	users.add(new LandaTest(2, "Nuria"));
	users.add(new LandaTest(3, "Ana"));
	users.add(new LandaTest(4, "Cristian"));
	users.add(new LandaTest(5, "Aleix"));
}

private static void printList() {
	
}

	
public static void usarTernarias() {
		int edad = 20;
		boolean mayorEdad = false;

		// Tradicional, si if sólo tiene una línea, las llaves no son necesarias. Pero
		// sólo ejecutaría la primera línea. El else es redundante.
		if (edad > 17)
			mayorEdad = true;
		else
			mayorEdad = false;

		// Operador ternario
		mayorEdad = edad > 17 ? true : false;

		// Imprimir Tradicional
		if (edad > 17)
			System.out.println("es mayor");
		else
			System.out.println("no");

		// Operador ternario
		System.out.println(edad > 17 ? "es mayor" : "no es mayor");
	}


	public static void main(String[] args) {
		user.for
}
}
