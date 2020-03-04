package com.fran.LambdaFeb20;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class App {
	
	private static List<User> users;
	
	private static void setUpUser() {
		users = new ArrayList<User>();
		users.add(new User(1,"Fran"));
		users.add(new User(2,"Nuria"));
		users.add(new User(3,"Ana"));
		users.add(new User(4,"Cristian"));
		users.add(new User(5,"Aleix"));		
	}
	
	private static void printUsers(List<User> lista) {
		for(User user: lista) {
			System.out.println(user.toString());
		}
	}
	
	/**
	 * Uso de las ternarias
	 */
	public static void usarTernarias() {
		// Operador ternario
		int edad = 15;
		char sexo = 'M';
		boolean mayorEdad;
		String cadena;

		// tradicional
		if (edad > 17)
			mayorEdad = true;
		else
			mayorEdad = false;

		// operador ternario
		mayorEdad = edad>17?true:false;
		cadena = (edad>17 && sexo=='M')?"Es mayor de edad" + " y guapa":"No es mayor de edad";
		System.out.println(cadena);
		
		// Imprimir tradicional
		if (edad > 17) {
			System.out.println("Es mayor de edad");
		}			
		else {
			System.out.println("No es mayor de edad");
		}
					
		// Imprimir operador ternario
		System.out.println(edad>17?"Es mayor de edad":"No es mayor de edad");
	}
	
	public static void main(String[] args) {
		
		setUpUser();
		printUsers(users);	
		
		// No es la más común
		Stream stream = Stream.of(users);
		// Esto es lo mismo
		users.stream();
		
		// uso básico con lambdas
		users.stream().forEach(e -> e.setNombre(e.getNombre() + " Apellido"));
		printUsers(users);
		
		// Map y Collector.toList
		// Map -> permite realizar una transformación rápida de la lista original
		// Collector.toList -> permite sacar cosas del stream una vez finalizado el proceso
		
		List<String> nombres = users.stream()	// Crea el flujo
				.map(e->e.getNombre())		// Quédate con los nombres
				.collect(Collectors.toList());	// Crea una nueva lista
		

		// Filter -> Filtra elementos de la lista
		System.out.println("----------------Filters----------------");
		List<User> usuariosfiltrados = users.stream()
				.filter(e->e.getNombre().charAt(0)=='A')
				.filter(e->e.getNombre().length()>13)
				.collect(Collectors.toList());
		// Imprimir con función
		printUsers(usuariosfiltrados);
		// Imprimir con lambda
		usuariosfiltrados.stream().forEach(e->System.out.println(e));
		
		// Mezclando lo anterior, filtrando e imprimiendo
		users.stream()
		.filter(e->e.getNombre().charAt(0)=='A')
		.filter(e->e.getNombre().length()>13)
		.forEach(e->System.out.println(e));
		
		
	}
	

}
