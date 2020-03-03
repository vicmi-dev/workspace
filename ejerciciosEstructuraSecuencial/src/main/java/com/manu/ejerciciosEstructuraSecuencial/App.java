package com.manu.ejerciciosEstructuraSecuencial;

import java.util.Scanner;

public class App 
{
  public static void readShowNumber() {
	Scanner sc = new Scanner(System.in);
	int a, b;
	a = sc.nextInt();
	b = sc.nextInt();
	System.out.println("Tus números son " + a + " " + b);

}  
  
  public static void main( String[] args )
    {
	  readShowNumber();
    }
}
