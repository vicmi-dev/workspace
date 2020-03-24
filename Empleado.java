package com.exionarixdan.ejerciciosPOO;

public class Empleado {
	private int numHijos;
	private String nif, nombre;
	private double sueldoBase, horasExtra, irpf;
	private boolean casado;
	private static double importeHoraExtra;

	public Empleado() {
	}

	public Empleado(String nif) {
		this.nif = nif;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public int getNumHijos() {
		return numHijos;
	}

	public void setNumHijos(int numHijos) {
		this.numHijos = numHijos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public double getHorasExtra() {
		return horasExtra;
	}

	public void setHorasExtra(double horasExtra) {
		this.horasExtra = horasExtra;
	}

	public double getIrpf() {
		return irpf;
	}

	public void setIrpf(double irpf) {
		this.irpf = irpf;
	}

	public boolean isCasado() {
		return casado;
	}

	public void setCasado(boolean casado) {
		this.casado = casado;
	}

	public static double getImporteHoraExtra() {
		return importeHoraExtra;
	}

	public static void setImporteHoraExtra(double importeHoraExtra) {
		Empleado.importeHoraExtra = importeHoraExtra;
	}

	public double complementoHorasExtra() {
		return this.horasExtra * this.importeHoraExtra;
	}

	public double sueldoBruto() {
		return this.sueldoBase + complementoHorasExtra();
	}

	public double retencionesIrpf() {
		return (this.irpf - (this.casado ? 2 : 0) - this.numHijos) >= 0
				? (sueldoBruto() * 0.01 * (this.irpf - (this.casado ? 2 : 0) - this.numHijos))
				: 0.0;
	}

	@Override
	public String toString() {
		return this.nif + " " + this.nombre + "\nSueldo Base: " + this.sueldoBase + "\nHoras Extra: " + this.horasExtra
				+ "\nTipo IRPF: " + this.irpf + "\nCasado: " + (this.casado ? "S" : "N") + "\nNúmero de Hijos: "
				+ this.numHijos;
	}

}
