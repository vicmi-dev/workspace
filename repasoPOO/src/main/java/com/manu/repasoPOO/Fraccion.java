package com.manu.repasoPOO;

public class Fraccion {
	private int num, den;

	public Fraccion(int num, int den) {
		this.num = num;
		this.den = den;
	}

	public Fraccion() {
		this.num = 0;
		this.den = 1;
	}

	public Fraccion(int num) {
		this.num = num;
		this.den = 1;
	}

	public Fraccion sumar(Fraccion f2) {
		int denF = this.den * f2.den;
		int num1 = this.num * f2.den;
		int num2 = f2.num * this.den;
		int numR = num1 + num2;
		Fraccion res = new Fraccion(numR, denF);
		res.mcd();
		denF = denF/res.mcd();
		numR = numR / res.mcd();
		Fraccion resF = new Fraccion(numR, denF);
		return resF;

	}
	public Fraccion restar(Fraccion f2) {
		int denF = this.den * f2.den;
		int num1 = this.num * f2.den;
		int num2 = f2.num * this.den;
		int numR = num1 - num2;
		Fraccion res = new Fraccion(numR, denF);
		res.mcd();
		denF = denF/res.mcd();
		numR = numR / res.mcd();
		Fraccion resF = new Fraccion(numR, denF);
		return resF;
	}
	
	public Fraccion multiplicar(Fraccion f2) {
		int denF = this.den * f2.den;
		int num1 = this.num * f2.num;
		Fraccion res = new Fraccion(num1, denF);
		res.mcd();
		denF = denF/res.mcd();
		num1= num1 / res.mcd();
		Fraccion resF = new Fraccion(num1, denF);
		return resF;
	}
	
	public Fraccion dividir(Fraccion f2) {
		int denF = this.den / f2.den;
		int num1 = this.num / f2.num;
		Fraccion res = new Fraccion(num1, denF);
		res.mcd();
		denF = denF/res.mcd();
		num1= num1 / res.mcd();
		Fraccion resF = new Fraccion(num1, denF);
		return resF;
	}
	
	

	// Cálculo del máximo común divisor
	private int mcd() {
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

	@Override
	public String toString() {
		return this.num + "/" + this.den;
	}

}
