package com.manu.febrero932020;

import java.util.Arrays;

import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void ejercicio7(){
		String txt = JOptionPane.showInputDialog("Número de empleados: ");
    	int numempleados = Integer.parseInt(txt);
       Empleado[] empleados = new Empleado [numempleados];
       for (int i = 0; i < numempleados; i++) {
    	   empleados[i] = new Empleado();
	}
       
       Arrays.sort(empleados, (e1, e2) -> Double.compare(e1.retenciones() , e2.retenciones()));
		System.out.println(empleados[numempleados-1].toString());	// El que más gana
		System.out.println(empleados[0].toString());				// El que menos gana
		Arrays.sort(empleados, (e1, e2) -> Double.compare(e1.getHoursExtra() , e2.getHoursExtra()));
		System.out.println(empleados[numempleados-1].toString());	// El que más gana por horas extras
		System.out.println(empleados[0].toString());				// El que menos gana por horas extras
		Arrays.sort(empleados, (e1, e2) -> Double.compare(e1.retenciones() , e2.retenciones()));
		for(Empleado e: empleados) {
			System.out.println(e.toString());	// Imprimo todos los empleados
		}
	}
	
    public static void main( String[] args )
    {
    	ejercicio7();
    	//Dni dni = new Dni();
    	
    }
}
