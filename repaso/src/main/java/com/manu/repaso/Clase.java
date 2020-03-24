package com.manu.repaso;

import javax.swing.JOptionPane;

public class Clase {

	private int n;
	private double a;
	private char c;

	public double suma() {
		return this.n + this.a;
	}

	public double resta() {
		return this.a - this.n;
	}

	public int valorChar() {
		return ((int) this.c);
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public char getC() {
		return c;
	}

	public void setC(char c) {
		this.c = c;
	}

	public Clase(int n, double a, char c) {
		this.n = n;
		this.a = a;
		this.c = c;
	}

	public Clase(char c) {
		this.c = c;
		String text = JOptionPane.showInputDialog("Introduzca dato double");
		double a1 = Double.parseDouble(text);
		this.a = a1;
		text = JOptionPane.showInputDialog("Introduzca dato int");
		int n1 = Integer.parseInt(text);
		this.n = n1;
	}

	@Override
	public String toString() {
		return "La suma de N + A es igual a: " + suma() + ".\n" + "La diferencia de A - N: " + resta() + ".\n"
				+ "El valor numérico correspondiente al carácter que contiene la variable C es: " + valorChar();
	}

//	El valor de cada variable.
//	La suma de N + A
//	La diferencia de A - N
//	El valor numérico correspondiente al carácter que contiene la variable C.
//	Si por ejemplo le hemos dado a N el valor 5, a A el valor 4.56 y a C el valor ‘a’, se debe
//	mostrar por pantalla:
}
