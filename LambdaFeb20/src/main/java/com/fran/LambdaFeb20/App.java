package com.fran.LambdaFeb20;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
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
		users.add(new User(6,"Ana"));
	}
	
	private static void printUsers(List<User> lista) {
		for(User user: lista) {
			System.out.println(user.toString());
		}
	}
	
	private static int devolverPrimas(int id) {
		if(id>3) {
			return 1000;
		}
		else {
			return 2000;
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
		
		System.out.println("----------------FindFirst----------------");
		
		// nos vamos a quedar con el primer usuario cuyo id sea par
		// Uso de Optional
		Optional<User> user = users.stream()
				.filter(e->e.getId()%7==0)
				.findFirst();
		
		if (user.isPresent()) {
			System.out.println(user.get().getNombre());
		}
		
		// nos vamos a quedar con el primer usuario cuyo id sea divisible por 7
		// Uso de orElse
		User user2 = users.stream()
				.filter(e->e.getId()%7==0)
				.findFirst()
				.orElse(new User(7,"Adrián")); 	// Valor por defecto si no encuentra ninguno
		
		// Coge datos de diferentes arrays y lo concatena en una única lista
		System.out.println("----------------FlatMap----------------");
		List<String> nombresSantander = new ArrayList<String>();
		nombresSantander.add("Fran");
		nombresSantander.add("Paco");
		nombresSantander.add("Dani");
		List<String> nombresSabadell = new ArrayList<String>();
		nombresSabadell.add("Luis");
		nombresSabadell.add("Michael");
		nombresSabadell.add("Daniel");
		
		List<List<String>> nombresTotales = new ArrayList<List<String>>();
		nombresTotales.add(nombresSantander);
		nombresTotales.add(nombresSabadell);
		
		List<String> nombresFusionados = nombresTotales.stream()
				.flatMap(e->e.stream())				
				.collect(Collectors.toList());
		nombresFusionados.stream().forEach(e->System.out.println(e));
		
		// Es como forEach pero sin ser final
		System.out.println("----------------Peek----------------");
		/*List<String> nombresFusionadosConApellido = nombresFusionados.stream()
				.peek(e -> e = e + "Apellido")
				.collect(Collectors.toList());
		nombresFusionadosConApellido.stream().forEach(e->System.out.println(e));*/
		setUpUser();
		List<User> userConApellido = users.stream()
				.peek(e -> e.setNombre(e.getNombre()+ " Apellido"))
				.collect(Collectors.toList());
		userConApellido.stream().forEach(e->System.out.println(e));
		
		System.out.println("----------------Count----------------");
		setUpUser();
		long cantidadResultados = users.stream()
				.filter(e->e.getNombre().length()>5)
				.count();
		System.out.println(cantidadResultados);
		
		// Salta un número de elementos y limita la cantidad de resultados
		System.out.println("----------------Skip y Limit----------------");
		List<String> sublista = nombresFusionados.stream()
				.skip(2)
				.limit(3)
				.collect(Collectors.toList());
		sublista.stream().forEach(e->System.out.println(e));	
		
		// Ordena los elementos
		System.out.println("----------------Sorted----------------");			
		setUpUser();
		// Crear nueva lista de users ordenados por nombre
		List<User> usuariosOrdenadosNombre = users.stream()
				.sorted(Comparator.comparing(User::getNombre).reversed())
				.collect(Collectors.toList());
		usuariosOrdenadosNombre.stream().forEach(e->System.out.println(e));
		
		System.out.println("----------------Min y Max----------------");
		setUpUser();
		User minimoId = users.stream()
				.min(Comparator.comparing(User::getId))
				.orElse(null);
		User maximoId = users.stream()
				.max(Comparator.comparing(User::getId))
				.orElse(null);
		System.out.println(minimoId.getId() + " " + maximoId.getId());
		
		System.out.println("----------------Distinct----------------");
		List<String> nombres2 = new ArrayList<String>();
		nombres2.add("Fran");
		nombres2.add("Dani");
		nombres2.add("Paco");
		nombres2.add("Fran");
		
		List<String> nombresSinDuplicados = nombres2.stream()
				.distinct()
				.collect(Collectors.toList());
		nombresSinDuplicados.stream().forEach(e->System.out.println(e));
		
		System.out.println("----------------allMatch, anyMatch, noneMatch----------------");
		// Los 3 devuelven booleanos
		setUpUser();
		boolean todos = users.stream()
				.allMatch(e->e.getId()>3 && e.getNombre().length()>3);	// false
		boolean alguno = users.stream()
				.anyMatch(e->e.getId()>3);	// true
		boolean ninguno = users.stream()
				.noneMatch(e->e.getId()>3);	// false
		
		System.out.println(todos + " " + alguno + " " + ninguno);
		
		System.out.println("----------------sum, average, range----------------");
		setUpUser();
		
		double sumaIds = users.stream()
				.mapToDouble(e->e.getId())
				.sum();
		
		double mediaIds = users.stream()
				.mapToDouble(e->e.getId())
				.average()
				.orElse(0);
		
		System.out.println(" La suma es: " + sumaIds + " y la media " + mediaIds);
		System.out.println(IntStream.range(0, 100).sum());
		
		// Coge el stream y lo combina en un único resultado
		// mediante la repetición de una operación
		System.out.println("----------------Reduce----------------");
		setUpUser();
		
		long suma = users.stream()
				.map(User::getId)
				.reduce(100, Integer::sum); // El primer parámetro es el valor inicial, el segundo la operación
		System.out.println(suma);
		
		// Une los elementos en uno solo
		System.out.println("----------------Joining----------------");
		setUpUser();
		
		String nombresSeguidos = users.stream()
				.map(User::getNombre)
				.collect(Collectors.joining(" - "));
		System.out.println(nombresSeguidos);
		
		// Nos va a crear una nueva lista sin Repetidos
		System.out.println("----------------toSet----------------");
		setUpUser();
		
		Set<String> setNombres = users.stream()
				.map(User::getNombre)
				.collect(Collectors.toSet());
		setNombres.stream().forEach(e->System.out.println(e));
		
		// saca datos estadísticos
		System.out.println("----------------summarizingDouble----------------");
		DoubleSummaryStatistics estadisticas = users.stream()
				.collect(Collectors.summarizingDouble(e->devolverPrimas(e.getId())));
		
		System.out.println("Media : " + estadisticas.getAverage()
				+ " Máximo: " + estadisticas.getMax()
				+ " Mínimo: " + estadisticas.getMin()
				+ " Cantidad: " + estadisticas.getCount());

		// divide la lista original en sublistas con la condición pasada
		System.out.println("----------------GroupingBy----------------");
		setUpUser();
		Map<Character,List<User>> grupoAlfabetico = users.stream()
				.collect(Collectors.groupingBy(e->new Character(e.getNombre().charAt(0))));
		
		grupoAlfabetico.get('A').stream().forEach(e->System.out.println(e.getNombre()));
		grupoAlfabetico.get('F').stream().forEach(e->System.out.println(e.getNombre()));
		
		// Divide la lista original en 2 sublistas. Una cumple la condición y otra no (true y false)
		System.out.println("----------------PartitionBy----------------");
		setUpUser();
		
		Map<Boolean,List<User>> nombresLargos = users.stream()
				.collect(Collectors.partitioningBy(e->e.getNombre().length()>4));
		System.out.println("Nombres Largos:");
		nombresLargos.get(true).stream().forEach(e->System.out.println(e.getNombre()));
		System.out.println("Nombres Cortos:");
		nombresLargos.get(false).stream().forEach(e->System.out.println(e.getNombre()));
		
		// Convierte una lista de objetos en otra de otro tipo de objetos
		System.out.println("----------------mapping----------------");
		setUpUser();
		
		List<String> nombresPersonas = users.stream()
				.collect(Collectors.mapping(User::getNombre, Collectors.toList()));
		// equivalente a la línea de arriba
		List<String> nombresPersonas2 = users.stream()
				.map(User::getNombre)
				.collect(Collectors.toList());
		
		
		System.out.println("----------------Stream Paralelo----------------");
		setUpUser();
		long tiempoInicial = System.currentTimeMillis();
		users.stream().forEach(e->convertirMayusculas(e.getNombre()));
		long tiempoFinal = System.currentTimeMillis();
		System.out.println("La duración es: " + (tiempoFinal-tiempoInicial));
		tiempoInicial = System.currentTimeMillis();
		users.parallelStream().forEach(e->convertirMayusculas(e.getNombre()));
		tiempoFinal = System.currentTimeMillis();
		System.out.println("La duración es: " + (tiempoFinal-tiempoInicial));
		
	}
	
	public static String convertirMayusculas(String nombre) {
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return nombre.toUpperCase();
	}
	
}
