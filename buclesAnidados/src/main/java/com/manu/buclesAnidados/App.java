package com.manu.buclesAnidados;

import javax.swing.JOptionPane;

/**

Por ejemplo, el número 6 es perfecto.
El 6 tiene como divisores: 1, 2, 3 y 6 pero el 6 no se cuenta como divisor para comprobar si es
perfecto.
Si sumamos 1 + 2 + 3 = 6
Los siguientes números perfectos después del 6 son 28, 496, 8128, 33550336, 8589869056.
Desarrollar el algoritmo para comprobar si un número es perfecto.
El programa pide por teclado un número y muestra si es perfecto o no. mediante un bucle for
sumaremos los divisores del número. Al final si esta suma es igual al número mostraremos el
mensaje correspondiente.
 */
public class App 
{
	public static int numeroPerfecto() {
		String textNum = JOptionPane.showInputDialog("Introduce un número:");
		int num = Integer.parseInt(textNum);
		int resultado = 0;
		
		for (int i = num - 1; i > 0; i--) {
			if (num % i == 0) {
				resultado = resultado + i;
			}
		}
			if (resultado == num) {
				System.out.println(num + " es un número perfecto");
			} else {
				System.out.println(num + " no es un número perfecto");
			}
		return resultado;
		
	}
	
    public static void main( String[] args )
    {
    	numeroPerfecto();
    }
}
