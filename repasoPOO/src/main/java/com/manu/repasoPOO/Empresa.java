package com.manu.repasoPOO;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private int cif;
	private String nombre;
	private List<Persona> listaPersonas;
	private static int numTotalTrab;
	
	public Empresa() {
		this.listaPersonas = new ArrayList <Persona>();
	}
	
	public Empresa(int cif, String nombre, List<Persona> listaPersonas) {
		this.cif = cif;
		this.nombre = nombre;
		this.listaPersonas = listaPersonas;
	}

	public int getCif() {
		return cif;
	}

	public void setCif(int cif) {
		this.cif = cif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Persona> getListaPersonas() {
		return listaPersonas;
	}

	public void setListaPersonas(List<Persona> listaPersonas) {
		this.listaPersonas = listaPersonas;
	}

	public int getNumTrabajadores() {
		return numTrabajadores;
	}

	public void setNumTrabajadores(int numTrabajadores) {
		this.numTrabajadores = numTrabajadores;
	}

	public static int getNumTotalTrab() {
		return numTotalTrab;
	}

	public static void setNumTotalTrab(int numTotalTrab) {
		Empresa.numTotalTrab = numTotalTrab;
	}
	
	

	


}
