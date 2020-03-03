package com.manu.array;

import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class App 
{
	
	public static void crearArray() {
		double pos, neg;
		int posN, negN;
		posN =0;
		negN = 0;
		pos =0;
		neg = 0;
		
		int[] numEnt = new int[10];
		for (int i = 0; i<numEnt.length;i++) {
		String texto = JOptionPane.showInputDialog("Introduce un número entero");
        numEnt[i] = Integer.parseInt(texto);
        System.out.println(numEnt[i]);
        if (numEnt[i]>0) {
        	pos = pos + numEnt[i];
        	posN++;
        } else {
        	neg = neg + numEnt[i];
        	negN++;
        }
		}
		System.out.println("La media es " + pos/posN);
        System.out.println("La media es " + neg/negN);
	}
    public static void main( String[] args )
    {
    	crearArray();
    }
}
