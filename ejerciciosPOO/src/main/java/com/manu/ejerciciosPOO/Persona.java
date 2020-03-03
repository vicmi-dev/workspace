package com.manu.ejerciciosPOO;


public class Persona {
	private String nombre;
	String id;
	private int edad;
	private double peso, altura;
	private char sexo = 'H';
	
	public Persona() {
		super();
	}

	public Persona(String nombre, int edad, char sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}

	public Persona(String nombre, double id, int edad, double peso, double altura, char sexo) {
		super();
		this.nombre = nombre;
		this.id = generaDNI();
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
		this.sexo = sexo;
	}
	
	public int calcularIMC() {
		double imc;
		imc = this.peso/(this.altura * this.altura);
		if (imc<20) {
			return -1;			
		} else if (imc >= 20 && imc <= 25) {
			return 0;
		} else {
			return 1;
		}
	}
	
	public boolean esMayorDeEdad() {
		if(this.edad>=18) {
			return true;
		} else {
			return false;
		}
	}

	//public
	
	public String generaDNI() {
		double num;
		num = Math.random()*((99999999-10000000)) + 99999999;
		return num + "Q";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", id=" + id + ", edad=" + edad + ", peso=" + peso + ", altura=" + altura
				+ ", sexo=" + sexo + ", calcularIMC()=" + calcularIMC() + ", esMayorDeEdad()=" + esMayorDeEdad() + "]";
	}

	
	
}
