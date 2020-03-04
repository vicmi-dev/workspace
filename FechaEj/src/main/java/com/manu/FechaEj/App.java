package com.manu.FechaEj;

import javax.swing.JOptionPane;

public class App {
	public static void main(String[] args) {
		
		String textD = JOptionPane.showInputDialog("Introduce un día");
		int d = Integer.parseInt(textD);
		String textM = JOptionPane.showInputDialog("Introduce un mes");
		int m = Integer.parseInt(textM);
		String textY = JOptionPane.showInputDialog("Introduce un año");
		int y = Integer.parseInt(textY);
		Fecha date = new Fecha(d, m , y);
		//System.out.println(date);
		//System.out.println(date.fechaCorrecta());
		//System.out.println(date.diaSiguiente());
		System.out.println(date.esBisiesto());
	}
}
