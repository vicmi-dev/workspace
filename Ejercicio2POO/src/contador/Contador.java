package contador;

public class Contador {
	
	  private int cont;

	  //constructor por defecto
	  public Contador() {
	  }

	  //constructor con parámetros
	  public Contador(int cont) {
		  parsearContador(cont);
	  }

	  //constructor copia
	  public Contador(final Contador c) {
	      this.cont = c.cont;
	  }

	  //getter
	  public int getCont() {
	      return cont;
	  }

	  //setter
	  public void setCont(int cont) {
		  parsearContador(cont);
	  }

	  /**
	   * Recibe un numero entero y devuelve 0 si el número en menor que 0 
	   * y el propio número en caso contrario
	   * @param cont
	   */
	  private void parsearContador(int cont) {
		  if (cont < 0) {
	          this.cont = 0;
	      } else {
	          this.cont = cont;
	      }
	  }
	  	  
	  //método incrementar contador
	  public void incrementar() {
	      cont++;
	  }
	  
	  //método incrementar contador una cantidad
	  public void incrementar(int cantidad) {
	      cont = cont + cantidad;
	  }

	  //método decrementar contador
	  public void decrementar() {
	      cont--;
	      if (cont < 0) {
	          cont = 0;
	      }
	  }
	  
	//método decrementar contador
	  public void decrementar(int cantidad) {
	      cont = cont - cantidad;
	      if (cont < 0) {
	          cont = 0;
	      }
	  }

}
