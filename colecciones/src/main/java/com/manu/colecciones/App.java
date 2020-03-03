package com.manu.colecciones;

import java.util.ArrayList;
import java.util.List;

public class App 
{
	public static void listaDias() {
		List<String> listaDias = new ArrayList<String>();
		listaDias.add("Lunes");
		listaDias.add("Martes");
		listaDias.add("Miércoles");
		listaDias.add("Jueves");
		listaDias.add("Viernes");
		listaDias.add("Sábado");
		listaDias.add("Domingo");
		System.out.println(listaDias);
		listaDias.add(4, "Juernes");
		System.out.println(listaDias);
		List<String> listaDos = new ArrayList<String>(listaDias);
		System.out.println(listaDos.subList(3, 5));
		System.out.println(listaDos.get((0)));
		System.out.println(listaDos.size());
		
	}
    public static void main( String[] args )
    {
        listaDias();
    }
}
