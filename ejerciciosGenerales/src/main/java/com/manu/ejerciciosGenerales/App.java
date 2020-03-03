package com.manu.ejerciciosGenerales;

import java.io.IOException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	private static Scanner sc = new Scanner(System.in);
	public static void numeros() {

		
		int a, b, c;
		System.out.println("Introduzca un número");
		a = sc.nextInt();
		System.out.println("Introduzca otro número");
		b = sc.nextInt();
		
		System.out.println("El valor de a es: " + a + " y el valor de b es :" + b);
		c = b;
		b = a;
		a = c;
		
		System.out.println("El valor de a es: " + a + " y el valor de b es :" + b);
		
	}
    
	public static void numeroCifras() {
		int num, cifras;
		num = sc.nextInt();
		cifras = 0;
		while(num!=0) {
			num = num/10;
			cifras++;
		}
		
	System.out.println("El número de cifras es " + cifras);
		
	}

	public static void grados () throws IOException {
		double temperatura;
        char car;
        do{
            System.out.print("Introduce temperatura en �C: ");
            temperatura = sc.nextDouble();
            System.out.println("Grados Kelvin ..: " + (temperatura+273));
            System.out.print("Repetir proceso? (S/N): " );
            car = (char)System.in.read();
        }while(car =='S' || car == 's');		
}
	
	public static void conversion() {
		double kelvin;
		System.out.println("introduce grados");
		kelvin = sc.nextDouble() + 273;
		System.out.println(kelvin + " es su equivalencia a kelvin");
		
	}
	
	public static void num2() {
		int count, input;
		count=0;
		do {
		input = sc.nextInt();
		if (input%10 == 2) {
			count++;
		}
		} while (input>=0); 
		System.out.println(count);
	}
	
	public static void divisores() {
		int a, b, c, d, e, f;
		System.out.println("numero 1");
		a = sc.nextInt();
		System.out.println("numero 2");
		b = sc.nextInt();
		c = 1;
		e = 0;
		while (c<a) {
			if (a%c == 0) {
				e = e + c;
				c++;
		} else {
			c++;
		}
		}
		d = 1;
		f = 0;
		while (d<b) {			
			if (b%d == 0) {
				f = f + d;
			d++;
		} else {
			d++;
		}
		}
		System.out.println(e + " " + f);
		if (e == b && f == a) {
			System.out.println("Son amigos");
		}
	}
	
	public static void main( String[] args ) throws IOException
    {
        //numeros();
        //numeroCifras();
		//grados();
		//num2();
		divisores();
    }
}
