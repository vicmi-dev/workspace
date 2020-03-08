package com.manu.pruebas;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
  
    	private static List<User> users;
    	
    	private static void setUpUser() {
    		users = new ArrayList<User>();
    		users.add(new User(1,"Fran"));
    		users.add(new User(2,"Nuria"));
    		users.add(new User(3,"Ana"));
    		users.add(new User(4,"Cristian"));
    		users.add(new User(5,"Aleix"));		
    	}
    	
    	  public static void main( String[] args )
    	    { 	
    		  setUpUser();
    		  long tiempoInicial = System.currentTimeMillis();
    		  users.stream().forEach(e -> convertirMayusculas(e.getNombre()));
    		  long tiempoFinal = System.currentTimeMillis();
    		  System.out.println("La duración es: " + (tiempoFinal - tiempoInicial));
    		  tiempoInicial = System.currentTimeMillis();
    		  users.parallelStream().forEach(e -> convertirMayusculas(e.getNombre()));
    		  tiempoFinal = System.currentTimeMillis();
    		  System.out.println("La duración es: " + (tiempoFinal - tiempoInicial));
    	    }
    		  
    	public static String convertirMayusculas(String nombre) {
    			  
    			  try {
    				  Thread.sleep(2000);
    			  } catch (InterruptedException e) {
    				  
    			  }
				return nombre;
    		  }
    		 
    			  
    			  
}
