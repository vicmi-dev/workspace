package empleado;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		System.out.println("Introduce el numero de empleados: ");
		int numempleados = sc.nextInt();
		
		Empleado[] empleados = new Empleado[numempleados];
		
		for(int i =0;i<numempleados;i++) {
			
			System.out.println("Introduce el Nif: ");
			empleados[i] = new Empleado(sc.next());
			System.out.println("Introduce el Nombre: ");
			empleados[i].setNombre(sc.next());
			System.out.println("Introduce el Sueldo Base: ");
			empleados[i].setSueldobase(sc.nextDouble());
			System.out.println("Introduce el número de horas extras: ");
			empleados[i].setNumhorasextras(sc.nextInt());
			System.out.println("Introduce el IRPF: ");
			empleados[i].setIrpf(sc.nextInt());
			System.out.println("Introduce si esta casado (S/N): ");
			empleados[i].setCasado((sc.next().toLowerCase().charAt(0)=='s')?true:false);
			System.out.println("Introduce el número de hijos: ");
			empleados[i].setHijos(sc.nextInt());
			
		}
		
		System.out.println("Introduce el Precio de la hora extra: ");
		Empleado.setHoraextra(sc.nextDouble());
		
		
		Arrays.sort(empleados, (e1, e2) -> Double.compare(e1.sueldoBruto()-e1.retencion() , e2.sueldoBruto()-e2.retencion()));
		System.out.println(empleados[numempleados-1].toString());	// El que más gana
		System.out.println(empleados[0].toString());				// El que menos gana
		Arrays.sort(empleados, (e1, e2) -> Double.compare(e1.calculoComplemento() , e2.calculoComplemento()));
		System.out.println(empleados[numempleados-1].toString());	// El que más gana por horas extras
		System.out.println(empleados[0].toString());				// El que menos gana por horas extras
		Arrays.sort(empleados, (e1, e2) -> Double.compare(e1.sueldoBruto()-e1.retencion() , e2.sueldoBruto()-e2.retencion()));
		for(Empleado e: empleados) {
			System.out.println(e.toString());	// Imprimo todos los empleados
		}
		
		
		
		

	}

}
