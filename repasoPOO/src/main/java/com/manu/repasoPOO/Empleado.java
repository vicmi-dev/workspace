package com.manu.repasoPOO;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Empleado {
	private long id;
	private int letter = (int) (id / 23);
	private String letters = "TRWAGMYFPDXBNJZSQVHLCKE";
	private char idLetter = letters.charAt(letter);
	private String nif;
	private String nombre;
	private double sueldoBase;
	private double sueldNeto;
	private int horasExtra;
	private double irpf;
	private boolean casado;
	private int numHijos;
	private static double importeHoras = Integer.parseInt(JOptionPane.showInputDialog("Introduce el importe de las horas extras."));
	private String txtInput;
	private static int contador = 0;
	private int idEm;

	
	

	public Empleado() {
		Empleado.contador ++;
		idEm = Empleado.contador;
		txtInput = JOptionPane.showInputDialog("Introduce el nombre del empleado número " + Empleado.contador + ":");
		this.nombre = txtInput;
		this.nif = dniLetra();
		txtInput = JOptionPane.showInputDialog("Introduce el sueldo base de " + this.nombre + ":");
		this.sueldoBase = Integer.parseInt(txtInput);
		txtInput = JOptionPane.showInputDialog("Introduce las horas extras de " + this.nombre + ":");
		this.horasExtra = Integer.parseInt(txtInput);
		txtInput = JOptionPane.showInputDialog("Está " + this.nombre + " casado? Sí o No");
		
		if (txtInput.toLowerCase().equals("si") || txtInput.toLowerCase().equals("sí")) {
			this.casado = true;
		} else {
			this.casado = false;
		}
		
		this.irpf = irpf();
		this.sueldNeto = this.sueldoBase - (this.sueldoBase*this.irpf/100);
		
	}

	
	public Empleado(String nif) {
		this.nif = nif;
	}


	public double irpf() {
		txtInput = JOptionPane.showInputDialog("Introduce el numero de hijos de " + this.nombre + ":");
		this.numHijos = Integer.parseInt(txtInput);
		double tipoIrpf = 15;
		if (this.casado == true) {
			tipoIrpf = tipoIrpf - (2 + this.numHijos);
		} else {
			tipoIrpf -= this.numHijos;
		}
		return tipoIrpf;
	}
	
	public String dniLetra() {
		txtInput = JOptionPane.showInputDialog("Introduce el número de DNI:");
		this.id = Integer.parseInt(txtInput);
		return txtInput + "-" + this.idLetter;
	}
	
	public String dniLetra(int id) {
		this.id = id;
		return id + "-" + this.idLetter;
	}


	@Override
	public String toString() {
		return "Empleado" + idEm + " [nif=" + nif + ", nombre=" + nombre + ", sueldoBase=" + sueldoBase + ", sueldNeto=" + sueldNeto
				+ ", horasExtra=" + horasExtra + ", irpf=" + irpf + ", casado=" + casado + ", numHijos=" + numHijos
				+ "]";
	}
	
	
	
}
