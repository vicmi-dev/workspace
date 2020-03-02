package com.manu.contador;

public class Fraccion {
	int num, den;

	public Fraccion() {
		this.num = 0;
		this.den = 1;
	}

	public Fraccion(int num, int den) {
		super();
		this.num = num;
		this.den = den;
	}

	public int suma() {
		
	}

	private void simplificar() {

	}

//Cálculo del máximo común divisor
	private int mcd(Fraccion f) {
		int u = Math.abs(num);
		int v = Math.abs(den);
		if (v == 0) {
			return u;
		}
		int r;
		while (v != 0) {
			r = u % v;
			u = v;
			v = r;
		}
		return u;
	}

}
