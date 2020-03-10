package com.fran.EjercicioPOO8;

import java.util.Scanner;

public class NIF {
		
	private long dni;
	private char letra;
	
	public NIF() {
		
	}
	
	public NIF(long dni) {
		super();
		this.dni = dni;
		this.letra = calcularLetra();
	}
		
	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
		this.letra = calcularLetra();
	}

	public char getLetra() {
		return letra;
	}


	private char calcularLetra() {
		String posicionLetra = "TRWAGMYFPDXBNJZSQVHLCKE";
		return posicionLetra.charAt((int) (dni%23));
	}
	
	public void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce dni: ");
		this.dni = sc.nextInt();
		calcularLetra();
	}

	@Override
	public String toString() {
		return pasarOchoLetras() + "-" + Character.toUpperCase(letra);
	}
	
	private String pasarOchoLetras() {
		String resultado=Long.toString(dni);
		int numeroCerosPorDelante = 8 - Long.toString(dni).length();
		for(int i = 0;i<numeroCerosPorDelante;i++) {
			resultado = "0" + resultado;
		}
		return resultado;
		
	}
	
	
}
