package com.exionarixdan.ejerciciosPOO;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MainEmpleado {
	public static void main(String[] args) {
		int numEmpleados;
		List<Empleado> empleados = new ArrayList<Empleado>();
		Scanner lectura = new Scanner(System.in);

		System.out.println("Indique el número de empleados a introducir:");
		numEmpleados = lectura.nextInt();

		for (int i = 0; i < numEmpleados; i++) {
			Empleado empleado = new Empleado();
			
			lectura.nextLine();
			System.out.println("Introduzca el NIF del empleado:");
			String nif = lectura.nextLine();
			empleado.setNif(nif);
			System.out.println("Introduzca el nombre del empleado:");
			String nombre = lectura.nextLine();
			empleado.setNombre(nombre);
			System.out.println("Introduzca el sueldo base del empleado:");
			double sueldoBase = lectura.nextDouble();
			empleado.setSueldoBase(sueldoBase);
			System.out.println("Introduzca el numero de horas extras realizadas por el empleado:");
			double horasExtra = lectura.nextDouble();
			empleado.setHorasExtra(horasExtra);
			System.out.println("Introduzca el tipo de irpf del empleado:");
			double irpf = lectura.nextDouble();
			empleado.setIrpf(irpf);
			lectura.nextLine();
			System.out.println("Introduzca S si el empleado está casado o N si no lo está:");
			String casado = lectura.nextLine();
			if (casado.equals("S")) {
				empleado.setCasado(true);
			} else if (casado.equals("N")) {
				empleado.setCasado(false);
			}
			System.out.println("Introduzca el número de hijos del empleado:");
			int numHijos = lectura.nextInt();
			empleado.setNumHijos(numHijos);

			empleados.add(empleado);
		}

		System.out.println("Introduzca el importe del pago por hora extra:");
		double importeHoraExtra = lectura.nextDouble();

		Empleado empleadoMaxSalario = empleados.stream().max(Comparator.comparing(Empleado::sueldoBruto)).orElse(null);
		System.out.println("El empleado con el máximo salario es:\n" + empleadoMaxSalario.toString());
		Empleado empleadoMinSalario = empleados.stream().min(Comparator.comparing(Empleado::sueldoBruto)).orElse(null);
		System.out.println("El empleado con el mínimo salario es:\n" + empleadoMinSalario.toString());
		Empleado empleadoMaxExtra = empleados.stream().max(Comparator.comparing(Empleado::complementoHorasExtra))
				.orElse(null);
		System.out.println("El empleado que más cobra por horas extra es:\n" + empleadoMaxExtra.toString());
		Empleado empleadoMinExtra = empleados.stream().min(Comparator.comparing(Empleado::complementoHorasExtra))
				.orElse(null);
		System.out.println("El empleado que menos cobra por horas extra es:\n" + empleadoMinExtra.toString());

		System.out.println("A continuación se muestran los empleados ordenados por salario de menor a mayor:\n");
		List<Empleado> empleadosOrdenados = empleados.stream()
				.sorted(Comparator.comparing(Empleado::sueldoBruto).reversed()).collect(Collectors.toList());
		empleadosOrdenados.stream().forEach(e->System.out.println(e.toString()));
	}
}
