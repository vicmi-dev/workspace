package com.manu.contador;

import java.util.Scanner;

public class App 
{/*
    	public static void main(String[] args) {

    		 Scanner sc = new Scanner(System.in);

    		 //Utilizar el constructor por defecto
    		 Contador contador1 = new Contador();

    		 int n;
    		 System.out.println("Introduce valor para inicializar el contador: ");
    		 n = sc.nextInt();

    		 //asignar un valor al contador
    		 contador1.setCont(n);
    		 //incrementar el contador
    		 contador1.incrementar();
    		 //mostrar el valor actual
    		 System.out.println(contador1.getCont());

    		 contador1.incrementar();
    		 contador1.incrementar();

    		 //mostrar el valor actual
    		 System.out.println(contador1.getCont());

    		 //restar 1 al valor del contador
    		 contador1.decrementar();

    		 //mostrar el valor actual
    		 System.out.println(contador1.getCont());
    		 //crear un nuevo objeto Contador con valor inicial 10
    		 Contador contador2 = new Contador(10);
    		 
    		 //incrementar y decrementar el contador2 y mostrar su valor
    		 contador2.incrementar();
    		 System.out.println(contador2.getCont());
    		 contador2.decrementar();
    		 System.out.println(contador2.getCont());
    		 //crear un objeto Contador utilizando el constructor copia
    		 //se crea el objeto contador3 como copia de contador2
    		 Contador contador3 = new Contador(contador2);
    		 //mostrar el valor de contador3
    		 System.out.println(contador3.getCont());
    		 }
*/
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 String titulo, autor;
	 int ejemplares;
	 //se crea el objeto libro1 utilizando el constructor con parámetros
	 Libro libro1 = new Libro("El quijote", "Cervantes", 1, 0);
	 //se crea el objeto libro2 utilizando el constructor por defecto
	 Libro libro2 = new Libro();
	 System.out.print("Introduce titulo: ");
	 titulo = sc.nextLine();
	 System.out.print("Introduce autor: ");
	 autor = sc.nextLine();
	 System.out.print("Numero de ejemplares: ");
	 ejemplares = sc.nextInt();
	 //se asigna a libro2 los datos pedidos por teclado.
	 //para ello se utilizan los métodos setters
	 libro2.setTitulo(titulo);
	 libro2.setAutor(autor);
	 libro2.setEjemplares(ejemplares);
	 //se muestran por pantalla los datos del objeto libro1
	 //se utilizan los métodos getters para acceder al valor de los atributos
	 System.out.println("Libro 1:");
	 System.out.println("Titulo: " + libro1.getTitulo());
	 System.out.println("Autor: " + libro1.getAutor());
	 System.out.println("Ejemplares: " + libro1.getEjemplares());
	 System.out.println("Prestados: " + libro1.getPrestados());
	 System.out.println();
	 //se realiza un préstamo de libro1. El método devuelve true si se ha podido
	 //realizar el préstamo y false en caso contrario
	 if (libro1.prestamo()) {
	 System.out.println("Se ha prestado el libro " + libro1.getTitulo());
	 } else {
	 System.out.println("No quedan ejemplares del libro " + libro1.getTitulo() + " para	prestar");
	 }
	 //se realiza una devolución de libro1. El método devuelve true si se ha podido
	 //realizar la devolución y false en caso contrario
	 if (libro1.devolucion()) {
	 System.out.println("Se ha devuelto el libro " + libro1.getTitulo());
	 } else {
	 System.out.println("No hay ejemplares del libro " + libro1.getTitulo() + " prestados");
	 }
	 //se realiza otro préstamo de libro1
	 if (libro1.prestamo()) {
	 System.out.println("Se ha prestado el libro " + libro1.getTitulo());
	 } else {
	 System.out.println("No quedan ejemplares del libro " + libro1.getTitulo() + " para prestar");
	 }
	 //se realiza otro préstamo de libro1. En este caso no se podrá realizar ya que
	 //solo hay un ejemplar de este libro y ya está prestado. Se mostrará por
	 //pantalla el mensaje No quedan ejemplares del libro…
	 if (libro1.prestamo()) {
	 System.out.println("Se ha prestado el libro " + libro1.getTitulo());
	 } else {
	 System.out.println("No quedan ejemplares del libro " + libro1.getTitulo() + " para prestar");
	 }
	 //mostrar los datos del objeto libro1
	 System.out.println("Libro 1:");
	 System.out.println("Titulo: " + libro1.getTitulo());
	 System.out.println("Autor: " + libro1.getAutor());
	 System.out.println("Ejemplares: " + libro1.getEjemplares());
	 System.out.println("Prestados: " + libro1.getPrestados());
	 System.out.println();
	 //mostrar los datos del objeto libro2
	 System.out.println("Libro 2:");
	 System.out.println("Titulo: " + libro2.getTitulo());
	 System.out.println("Autor: " + libro2.getAutor());
	 System.out.println("Ejemplares: " + libro2.getEjemplares());
	 System.out.println("Prestados: " + libro2.getPrestados());
	 System.out.println();
	 }
/*sdfjdfskajldsfklasdfkj
	public static void main(String[] args) {
		 // Se crean 4 fracciones
		 Fraccion f1 = new Fraccion(1, 4); // Fracción 1/4
		 Fraccion f2 = new Fraccion(1, 2); // Fracción 1/2
		 Fraccion f3 = new Fraccion(); // Fracción 0/1
		 Fraccion f4 = new Fraccion(4); // Fracción 4/1
		 // operaciones aritméticas con esas fracciones
		 Fraccion suma = f1.sumar(f2);
		 Fraccion resta = f1.restar(f3);
		 Fraccion producto = f1.multiplicar(f4);
		 Fraccion cociente = f1.dividir(f2);
		 //mostrar resultados
		 System.out.println(f1 + " + " + f2 + " = " + suma);
		 System.out.println(f1 + " - " + f3 + " = " + resta);
		 System.out.println(f1 + " * " + f4 + " = " + producto);
		 System.out.println(f1 + " / " + f2 + " = " + cociente);
		}
		*/

}
