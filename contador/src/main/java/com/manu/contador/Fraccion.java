package com.manu.contador;

public class Fraccion {
	private int num, den;

	public Fraccion() {
		this.num = 0;
		this.den = 1;
	}

	public Fraccion(int num, int den) {
		super();
		this.num = num;
		this.den = den;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getDen() {
		return den;
	}

	public void setDen(int den) {
		this.den = den;
	}

	public Fraccion suma(Fraccion c) {
		Fraccion res = new Fraccion();
		if(this.den>c.getDen()) {
			c.setDen(c.getDen()*this.den);
			c.setNum(c.getNum()*this.den);
		} else {
			this.setDen(c.getDen()*this.den);
			this.setNum(c.getDen()*this.num);
		}
		return res;
	}
	
	
	public void resta(Fraccion c) {
		Fraccion res = new Fraccion();
		
		if(this.den>c.getDen()) {
			c.setDen(c.getDen()*this.den);
			c.setNum(c.getNum()*this.den);
			this.den = this.den + c.getDen();
			this.num = this.num + c.getNum();
		}
		else {
			this.setDen(c.getDen()*this.den);
			this.setNum(c.getDen()*this.num);
			this.den = this.den + c.getDen();
			this.num = this.num + c.getNum();
		}
	}


//Cálculo del máximo común divisor
	private int simplificar(Fraccion f) {
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
