package com.exionarixdan.ejerciciosPOO;

public class MainFecha {
	public static void main(String[] args) {
		Fecha fecha = new Fecha(25, 3, 2020);
		
		System.out.println(fecha.fechaCorrecta() ? "Fecha introducida: " + fecha.toString()
				: "La fecha introducida es incorrecta");
		
		System.out.println("Los 10 días siguientes son:");
		for (int i = 0; i < 10; i++) {
			fecha.diaSiguiente();
			System.out.println(fecha.toString());
		}
	}
}
