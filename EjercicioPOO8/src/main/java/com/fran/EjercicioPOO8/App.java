package com.fran.EjercicioPOO8;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        NIF nif = new NIF(12345);
        System.out.println(nif.getLetra());
        System.out.println(nif.toString());
    }
}
