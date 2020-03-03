package com.manu.ejerciciosCondicionales;

import java.util.Scanner;

public class App 
{
	static int h, m, s;
	public static void reloj() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Escribe una hora");
	h = sc.nextInt();
	System.out.println("Escribe los minutos");
	m = sc.nextInt();
	System.out.println("Escribe los segundos");
	s = sc.nextInt();
	
	
	}
	
	public static boolean poss(){
		if(h<25 && h>=0 && m>=0 && m<60 && s>=0 && s<60) {
			System.out.println(h + ":" + m + ":" + s);
			return true;
			} else {
				System.out.println("por favor inserta un formato de hora correcto");
				return false;
			}
	}
    public static void main( String[] args )
    {
        reloj();
        poss();
    }
}
