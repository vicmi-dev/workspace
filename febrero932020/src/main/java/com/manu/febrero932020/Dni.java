package com.manu.febrero932020;

import javax.swing.JOptionPane;

public class Dni {
String txt;
long dni;
String letra = "TRWAGMYFPDXBNJZSQVHLCKE";

public Dni() {
	this.txt = JOptionPane.showInputDialog("Introduce un número de DNI: ");
	int numeroCerosPorDelante = 8 - txt.length();
	for(int i = 0;i<numeroCerosPorDelante;i++) {
		txt = "0" + txt;
}
	this.dni = Integer.parseInt(txt);
	System.out.println(txt + "-" + letra.charAt((int) (this.dni%23)));

}
}
