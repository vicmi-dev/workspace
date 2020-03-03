package com.fran.Ejercicio5POO;

public class Complejo {

	private double real;
	private double imaginaria;
	
	/**
	 * Constructor por defecto
	 */
	public Complejo() {
		this.real=0;
		this.imaginaria=0;
	}

	/**
	 * Constructor con parámetros
	 * @param real
	 * @param imaginaria
	 */
	public Complejo(double real, double imaginaria) {
		super();
		this.real = real;
		this.imaginaria = imaginaria;
	}
	
	/**
	 * Constructor de copia
	 */
	public Complejo(Complejo c) {

		this.real = c.real;
		this.imaginaria = c.imaginaria;
	}

	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImaginaria() {
		return imaginaria;
	}

	public void setImaginaria(double imaginaria) {
		this.imaginaria = imaginaria;
	}

	public Complejo sumar(Complejo c) {
		Complejo resultado = new Complejo();
		resultado.setReal(this.real+c.getReal());
		resultado.setImaginaria(this.imaginaria+c.getImaginaria());
		return resultado;
	}
	
	public Complejo restar(Complejo c){
		Complejo resultado = new Complejo();
		resultado.setReal(this.real-c.getReal());
		resultado.setImaginaria(this.imaginaria-c.getImaginaria());
		return resultado;
	
	}

	public Complejo multiplicar(Complejo c) {
		Complejo resultado = new Complejo();
		resultado.setReal(this.real*c.getReal()-this.imaginaria*c.getImaginaria());
		resultado.setImaginaria(this.real*c.getImaginaria()+this.imaginaria*c.getReal());
		return resultado;
	}
	
	public Complejo multiplicar(double d) {
		Complejo resultado = new Complejo();
		resultado.setReal(this.real*d);
		resultado.setImaginaria(this.imaginaria*d);
		return resultado;
	}
	
	public Complejo dividir(Complejo c){
		Complejo resultado = new Complejo();
		resultado.setReal(
				(this.real*c.getReal() + this.imaginaria*c.getImaginaria())
				/
				(Math.pow(c.getReal(),2) + Math.pow(c.getImaginaria(),2))
				);		
		resultado.setImaginaria(
				(this.imaginaria*c.getReal()-this.real*c.getImaginaria())
				/
				(Math.pow(c.getReal(),2)+Math.pow(c.getImaginaria(),2))
				);
		return resultado;	
	}

	@Override
	public String toString() {
		return "(" + real + "," + imaginaria + ")";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(imaginaria);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(real);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Complejo other = (Complejo) obj;
		if (Double.doubleToLongBits(imaginaria) != Double.doubleToLongBits(other.imaginaria))
			return false;
		if (Double.doubleToLongBits(real) != Double.doubleToLongBits(other.real))
			return false;
		return true;
	}

	
	
}
