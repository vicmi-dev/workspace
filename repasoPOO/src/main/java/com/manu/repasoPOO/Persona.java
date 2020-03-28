package com.manu.repasoPOO;

import javax.swing.JOptionPane;

public class Persona {
String nombre;
private long id;
private int letter = (int) (id / 23);
private String letters = "TRWAGMYFPDXBNJZSQVHLCKE";
private char idLetter = letters.charAt(letter);
private String nif;
private String txtInput;
private char sexo;
private double salario;
private String dof;

public Persona() {
	int contador=0;
	contador ++;
	int contPer = contador;
	txtInput = JOptionPane.showInputDialog("Introduce el nombre del empleado número " + contPer + ":");
	this.nombre = txtInput;
	this.nif = dniLetra();
	this.dof = dof();
	txtInput = JOptionPane.showInputDialog("Introduce el sueldo base de " + this.nombre + ":");
	txtInput = JOptionPane.showInputDialog("Cuál es el salairo de " + this.nombre + ":");
	this.salario = Integer.parseInt(txtInput);
	txtInput = JOptionPane.showInputDialog("Cuál es el género de " + this.nombre + ": H(hombre) // M (Mujer)");
	this.sexo = txtInput.charAt(0);
}

private String dniLetra() {
	txtInput = JOptionPane.showInputDialog("Introduce el número de DNI:");
	this.id = Integer.parseInt(txtInput);
	return txtInput + "-" + this.idLetter;
}

public String dof() {
	int day, year;
	txtInput = JOptionPane.showInputDialog("Qué día naciste?");
	day = Integer.parseInt(txtInput);
	String mes = JOptionPane.showInputDialog("De qué mes?");
	txtInput = JOptionPane.showInputDialog("De qué año?");
	year = Integer.parseInt(txtInput);
	return day + " de " + mes + " de " + year;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getNif() {
	return nif;
}

public void setNif(String nif) {
	this.nif = nif;
}

public char getSexo() {
	return sexo;
}

public void setSexo(char sexo) {
	this.sexo = sexo;
}

public double getSalario() {
	return salario;
}

public void setSalario(double salario) {
	this.salario = salario;
}

public String getDof() {
	return dof;
}

public void setDof(String dof) {
	this.dof = dof;
}

@Override
public String toString() {
	return "Persona [nombre=" + nombre + ", nif=" + nif + ", sexo=" + sexo + ", salario=" + salario + ", dof=" + dof
			+ "]";
}



}
