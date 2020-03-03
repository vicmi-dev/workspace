package com.manu.arrayList;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class App 
{
	List<Integer> arrayAlt = new ArrayList<Integer>();
	
	public static int numeroAlumnos() {
		 String texto = JOptionPane.showInputDialog("Introduce el número de alumnos");
	        int numAlum = Integer.parseInt(texto);
	        return numAlum;
	}
	
	public void leerAlturas() {
		int i = 0;
		while(i<=numeroAlumnos()) {
		String texto = JOptionPane.showInputDialog("Introduce las alturas");
        int alturas = Integer.parseInt(texto);
        arrayAlt.add(alturas);
        i++;
		}
	}
	
	
	
	
	/*
	 * Programa Java que pida por teclado las alturas de N alumnos de una clase y
	 * las guarde en un ArrayList de tipo Double. A continuación el programa
	 * calculará cuantos alumnos hay más altos que la media y cuantos más bajos.
Método mostrarResultados():
	 * muestra por pantalla todas las alturas y calcula y muestra el número de
	 * alumnos con altura superior e inferior a la media. Recibe como parámetros el
	 * ArrayList con las alturas de todos los alumnos y la media calculada
	 * anteriormente.
	 */
    public static void main( String[] args )
    {
      int num = numeroAlumnos();
      System.out.println(num);
    }
}
