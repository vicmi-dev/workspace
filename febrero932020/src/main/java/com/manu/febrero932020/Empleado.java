package com.manu.febrero932020;

import javax.swing.JOptionPane;

public class Empleado {
	private int id, wage;
	private int hoursExtra;
	private int children;
	private static double priceHour;
	private String name, txt;
	private boolean married;
	private double irpf = 15;
	private double porcentaje;



	public Empleado(int id) {
		this.id = id;
		this.txt = JOptionPane.showInputDialog("-NUEVO EMPLEADO- \nNúmero de hijos:");
		this.children = Integer.parseInt(txt);
		this.txt = JOptionPane.showInputDialog("¿Estás casado o casada? Sí o No:");
		this.married = txt.toLowerCase() == "no" ? false : true;
		this.name = JOptionPane.showInputDialog("Introduce tu nombre completo");
		this.txt = JOptionPane.showInputDialog("Sueldo:");
		this.wage = Integer.parseInt(txt);
		this.txt = JOptionPane.showInputDialog("Número de horas extra: ");
		this.hoursExtra = Integer.parseInt(txt);
		retenciones();
	}

	public double sueldoBruto(){
		return this.ExtraHours() + this.wage;
	}
	
	public double retenciones() {
		if(this.married) {
			porcentaje = (this.irpf-2) - this.children;
		} else {
			porcentaje = this.irpf - this.children;
		}
		return sueldoBruto() - (sueldoBruto()*this.porcentaje/100);
	}

	@Override
	public String toString() {
		return  id + " " + name + "\nSueldo base: " + wage + "\nHoras extras: " + this.hoursExtra + 
				"\nTipo de IRPF: " + this.porcentaje + "\nCasado: " + (this.married == true ? "S" : "N") + "\n"
						+ "Número de hijos :" + getChildren() + " Sueldo neto: " + retenciones();
	}
	

	public double ExtraHours() {
				return Empleado.priceHour * this.hoursExtra;
	
	
	}

	public Empleado() {
		this.txt = JOptionPane.showInputDialog("-NUEVO EMPLEADO- \nNúmero de hijos:");
		this.children = Integer.parseInt(txt);
		this.txt = JOptionPane.showInputDialog("¿Estás casado o casada? Sí o No:");
		this.married = txt.toLowerCase() == "no" ? false : true;
		this.name = JOptionPane.showInputDialog("Introduce tu nombre completo");
		this.txt = JOptionPane.showInputDialog("Sueldo:");
		this.wage = Integer.parseInt(txt);
		this.txt = JOptionPane.showInputDialog("Número de DNI:");
		this.id = Integer.parseInt(txt);
		this.txt = JOptionPane.showInputDialog("Número de horas extra: ");
		this.hoursExtra = Integer.parseInt(txt);
		retenciones();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getWage() {
		return wage;
	}

	public void setWage(int wage) {
		this.wage = wage;
	}

	public int getHoursExtra() {
		return hoursExtra;
	}

	public void setHoursExtra(int hoursExtra) {
		this.hoursExtra = hoursExtra;
	}

	public int getChildren() {
		return children;
	}

	public void setChildren(int children) {
		this.children = children;
	}

	public static double getPriceHour() {
		return priceHour;
	}

	public static void setPriceHour(double priceHour) {
		Empleado.priceHour = priceHour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isMarried() {
		return married;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}

	public double getIrpf() {
		return irpf;
	}

	public void setIrpf(double irpf) {
		this.irpf = irpf;
	}
	

	/*
	 * Los objetos Empleado se podrán crear con un constructor por defecto o con un
	 * constructor con un solo parámetro correspondiente al DNI.
	 */

}
